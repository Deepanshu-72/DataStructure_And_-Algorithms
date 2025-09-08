import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        boolean[][] maze ={
                {true,true,true},
                {true,false,true},
                {true,true,true},


        };
        countwithobstical("", maze, 0,0);






    }
    static void count(String p,int r, int c){
        if( r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1) count(p+'D',r-1, c);
        if(c>1) count(p+'R',r, c-1);

        return;
    }

    static ArrayList<String> diagonalpath(String p, int r, int c){
        if( r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if( r>1 && c>1){
            list.addAll(diagonalpath(p+'d',r-1, c-1));


        }


        if(r>1){
           list.addAll(diagonalpath(p+'D',r-1, c));

        }

        if(c>1){
           list.addAll(diagonalpath(p+'R',r, c-1));
        }


        return list;
    }

    static void countwithobstical(String p,boolean[][] maze,int r, int c){
        if( r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if(r<maze.length-1) countwithobstical(p+'D',maze,r+1, c);
        if(c<maze[0].length-1) countwithobstical(p+'R',maze,r, c+1);

        return;
    }
}