package tuf.sorting.techniques;

public class SecondLargestElementInArray {

    public static int secondLargestElement(int[] nums) {

        int largest = nums[0];
        int secondLrgest = -1;

        for(int i=1; i<= nums.length-1; i++){
            if(nums[i] != largest) {
                if (nums[i] > largest) {
                    secondLrgest = largest;
                    largest = nums[i];
                }else if(nums[i] < largest && nums[i] > secondLrgest){
                    secondLrgest = nums[i];
                }
            }
        }
        return secondLrgest;

    }

    public static void main(String[] args) {
        int[] arr = {8,8,7,6,3};
        System.out.println(secondLargestElement(arr));

    }
}
