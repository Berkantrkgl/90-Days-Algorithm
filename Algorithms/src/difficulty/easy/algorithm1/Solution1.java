package difficulty.easy.algorithm1;

import java.util.HashMap;

public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        twoSum(nums, target);
    }

    // This is my own solution. 
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length -1 ; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        for (Integer i : result) System.out.println(i);
        return result;

    }

    // This is from solution page in LeetCode.
    public static int[] anotherTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
