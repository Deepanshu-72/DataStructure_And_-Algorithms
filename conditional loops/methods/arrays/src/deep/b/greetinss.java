package deep.b;

public class greetinss {
    String name;
    public static void main(String[] args) {

        System.out.println("hello");
    }

    void fun(){
        System.out.println("second");
    }
    greetinss(String name){
        this.name = name;
    }
    greetinss g = new greetinss("deep");
System.out.println("g.name");

}


