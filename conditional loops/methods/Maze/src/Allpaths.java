public class Allpaths {
    public static void main(String[] args) {
        System.out.println("hii");
        boolean[][] maze ={
                {true,true,true},
                {true,true,true},
                {true,true,true},


        };
        backtrack("", maze, 0,0);

    }
    static void backtrack(String p, boolean[][] maze, int r, int c){
        if( r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        if(r<maze.length-1) backtrack(p+'D',maze,r+1, c);
        if(c<maze[0].length-1) backtrack(p+'R',maze,r, c+1);
        if(r>0) backtrack(p+'U',maze,r-1, c);
        if(c>0) backtrack(p+'L',maze,r, c-1);
        maze[r][c] = true;

        return;
    }
}
