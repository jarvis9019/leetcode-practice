import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];


        for(int i=0; i<arr.length; i++){

            if(i == arr.length -1){
                result[i] = -1;
                return result;
            }
            int j = 1;

            while(j < arr.length-i){
                if(arr[i]>=arr[i+j]){
                    result[i] = arr[i];
                    j++;
                }
                else {
                    result[i] = arr[i+j];
                    j++;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {18,17,2,3,4,1};
        int[] result = replaceElements(nums);
        Arrays.stream(result).forEach(System.out::println);
    }
}
