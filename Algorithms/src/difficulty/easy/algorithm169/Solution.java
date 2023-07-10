package difficulty.easy.algorithm169;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("Result is : " + majorityElement(nums));
        System.out.println("2. Result is : " + majorityElement2(nums));
        System.out.println("3. Resutl is : " + majorityElement3(nums));
    }


    //  nums = [2,2,1,1,1,2,2]  Output: 2 ,  nums = [3,2,3] Output: 3
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0 ; i < length ; i++) {

            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i] , 1);
            }

        }

        int key = Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
        double majority = length / 2;
        return key;
    }

    // Sorting Solution (From Leetcode solution)
    public static int majorityElement2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        return nums[n/2];
    }

    // Moore voting algorithm (From leetcode solution)
    public static int majorityElement3(int[] nums) {
        int count=0, ret = 0;
        for (int num: nums) {
            if (count==0)
                ret = num;
            if (num!=ret)
                count--;
            else
                count++;
        }
        return ret;
    }
}
