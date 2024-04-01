import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        /*StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length-1];
        for (int i=0; i<Math.min(firstStr.length(), lastStr.length()); i++) {
            if (firstStr.charAt(i) != lastStr.charAt(i)) {
                return sb.toString();
            }
            sb.append(firstStr.charAt(i));
        }
        return sb.toString();*/

        if(strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length() -1);
            }
        }

        return prefix;


    }

    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "floght"}));
    }
}
