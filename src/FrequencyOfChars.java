import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfChars {

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();

        for (char value : c) {
            if (map.containsKey(value)) {
                int j = map.get(value) + 1;
                map.put(value, j);
            } else {
                map.put(value, 1);
            }
        }
        char [] arr = s.toCharArray();
        Character[] charArr = new Character[arr.length];
        for (int i = 0; i < arr.length; i++) {
            charArr[i] = arr[i];
        }
        Arrays.sort(charArr, new Comparator<Character>(){
            @Override
            public int compare(Character a , Character b){
                Integer x= map.get(a);
                Integer y = map.get(b);
                if (!x.equals(y)) {
                    return y - x;
                } else {
                    return a - b;
                }

            }
        });
        StringBuilder ans = new StringBuilder();

        for(int i =0;i<charArr.length;i++){
            ans.append(charArr[i]);
        }
        return ans.toString();
    }

    /*public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();

        for (char value : c) {
            if (map.containsKey(value)) {
                int j = map.get(value) + 1;
                map.put(value, j);
            } else {
                map.put(value, 1);
            }
        }

        List<Character> keyList = new ArrayList<>(map.keySet());

        Collections.sort(keyList);


        for(Map.Entry<Character, Integer> entry : map.entrySet()){

        }


        return s;
    }*/

    public static void main(String[] args) {
       String str = frequencySort("Aabb");
       System.out.println(str);
    }
}
