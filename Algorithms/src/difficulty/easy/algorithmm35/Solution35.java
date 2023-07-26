package difficulty.easy.algorithmm35;

public class Solution35 {

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;

    }
}
