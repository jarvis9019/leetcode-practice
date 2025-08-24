public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength * 2];

        for(int i=0; i < numsLength ; i++){
            result[i] = nums[i];
            result[i+numsLength] = nums[i];

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] result = getConcatenation(nums);
    }
}
