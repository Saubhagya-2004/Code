import java.util.*;

public class strLongestcommonprefixs {
    public static String commonPrefix(String[] strs) {
       
        StringBuilder result = new StringBuilder();
        // sort the array create import java.util.Array;
        Arrays.sort(strs);
        // get the first string
        char[] first = strs[0].toCharArray();
        // get the last string
        char[] last = strs[strs.length - 1].toCharArray();
        // start comparrision
        for (int i = 0; i < first.length; i++) {
            if(first[i]!=last[i]){
                break;
            }
                result.append(first[i]);
            
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] st = {"greeks", "greece", "grace"};
        System.out.println(commonPrefix(st));
    }
}