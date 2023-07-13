package difficulty.easy.algorithm26;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }


    // nums = [0,1,2,3,1,2,2,3,3,4]
    public static int removeDuplicates(int[] nums) {
        int index = 0;

        for (int j = 1 ; j < nums.length ; j++) {
            if (nums[index] != nums[j]) {
                nums[index + 1] = nums[j];
                index++;
            }
        }
        return index + 1;
    }
}
