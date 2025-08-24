import java.util.HashMap;
import java.util.Map;

public class ValidParanthesis {
    public boolean isValid(String s) {

        if(s.length() == 0){
            return false;
        }

        Map<String,String> checkMap = new HashMap<>();
        checkMap.put("(",")");
        checkMap.put("[","]");
        checkMap.put("{","}");

        return false;



    }
}
