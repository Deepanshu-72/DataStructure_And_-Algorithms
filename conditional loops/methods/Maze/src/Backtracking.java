public class Backtracking {
    public static void main(String[] args) {

    }
    static void allpaths(String p, boolean[][] maze, int r, int c){
        if( r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if(r<maze.length-1) allpaths(p+'D',maze,r+1, c);
        if(c<maze[0].length-1) allpaths(p+'R',maze,r, c+1);

        return;
    }
}
