import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String st = "abc";
        int i = st.length();
        System.out.println(i);
        subseq("",st, list);
        System.out.println(list);

    }
    static  ArrayList<String> subseq(String p, String up,ArrayList<String> list){
        if(up.isEmpty()){

            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1),list);
        subseq(p, up.substring(1),list );
        return list;

    }

}
