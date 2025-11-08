import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    public class  Node{
        int valve;
        Node left;
        Node right;

        Node(int value){
            this.valve= value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter Root node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void  populate(Scanner scanner, Node node){
        System.out.println("Do you want to Enter in left side " + node.valve);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left node:");
            int value = scanner.nextInt();
            node.left= new Node(value);
            populate(scanner, node.left);

        }

        System.out.println("Do you want to Enter in right side " + node.valve);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right node:");
            int value = scanner.nextInt();
            node.right= new Node(value);
            populate(scanner, node.right);

        }





    }

    public void preetydisplay(){
        preetydisplay(root, 0);
    }

    public void preetydisplay(Node node, int level){

        if (node == null) {
            return;
        }

        preetydisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.valve);
        } else {
            System.out.println(node.valve);
        }
        preetydisplay(node.left, level + 1);


    }


}


