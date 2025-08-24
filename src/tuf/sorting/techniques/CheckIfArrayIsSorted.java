package tuf.sorting.techniques;

public class CheckIfArrayIsSorted {


    public static void main(String[] args) {
        int[] arr = {8,8,7,6,3};
        System.out.println(checkIfArrayIsSorted(arr));

    }

    private static boolean checkIfArrayIsSorted(int[] arr) {
        for(int i=1; i<arr.length;i++){
            if(arr[i]<=arr[i-1]){ //descending
                // if(arr[i]>=arr[i-1]){    // ascending

            }else{
                return false;
            }
        }
        return true;
    }
}
