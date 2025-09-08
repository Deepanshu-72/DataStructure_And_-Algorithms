import java.util.ArrayList;
import java.util.Arrays;

public class PhonePad {
    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));

    }
    public  static ArrayList<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        return pad("", digits);


    }

    public static  ArrayList<String> pad(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        String[] mapping = {
                "", "", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz"
        };

        String letters = mapping[digit];
        for(char ch : letters.toCharArray()){


            ans.addAll(pad(p+ch, up.substring(1)));
        }

        return ans;
    }
}
