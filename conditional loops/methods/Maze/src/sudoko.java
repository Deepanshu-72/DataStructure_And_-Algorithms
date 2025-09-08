public class sudoko {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if (solve(board)) {
            display(board);
        } else {
            System.out.println("No solution exists");
        }


    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean empty= true;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if(board[i][j] == 0){
                    row =i;
                    col = j;
                    empty = false;
                    break;
                }

            }
            if (empty==false){
                break;
            }


        }
        if (empty==true){
            return  true;
        }
        for (int no =1; no<=9; no++){
            if (isSafe(board,row,col,no)){
                board[row][col]= no;
                if (solve(board)){
                    

                    return true;
                }
                else {
                    board[row][col]=0;
                }
            }


        }
        return false;

    }
    static void display(int[][] board){
        for(int[] row: board){
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board, int row, int col , int num){
        // check for row
        for (int i =0; i<board.length; i++){
            if (board[row][i]==num){
                return false;
            }
        }
        // check for col
        for (int i =0; i<board.length; i++){
            if (board[i][col]==num){
                return false;
            }
        }
        // check for square
        int s= row - (row % 3);
        int e= col - (col % 3);
        for (int i = s; i<s+3; i++){
            for (int j = e; j<e+3; j++){
                if(board[i][j] == num){
                    return false;
                }
            }


        }




        return true;
    }
}
