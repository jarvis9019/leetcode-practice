package tuf.sorting.techniques;

public class SecondSmallestElementInArray {
    public static int secondSmallestElement(int[] nums) {

        int smallest = nums[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1; i<= nums.length-1; i++){
            if(nums[i] != smallest) {
                if (nums[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = nums[i];
                }else if(nums[i] != smallest && nums[i] < secondSmallest){
                    secondSmallest = nums[i];
                }
            }
        }
        return secondSmallest;

    }

    public static void main(String[] args) {
        int[] arr = {8,8,7,6,3};
        System.out.println(secondSmallestElement(arr));

    }
}
