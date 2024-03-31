import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {

        if (s.length() == 0 || s == null) {
            return 0;
        }

        int currentValue = 0;
        int previousValue = 0;

        for (int i = s.length()-1; i>=0; i--) {
            int value = getValue(s.charAt(i));
            if(value < previousValue){
                currentValue = currentValue - value;
            }else{
                currentValue = currentValue + value;
            }
            previousValue = value;

        }
        return currentValue;
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args){
        System.out.println(romanToInt("IV"));
    }
}
