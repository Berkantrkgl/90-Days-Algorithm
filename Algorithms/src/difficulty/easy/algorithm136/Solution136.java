package difficulty.easy.algorithm136;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution136 {

    public static void main(String[] args) {
        int[] nums = {4,1,1,3,3,2,4,5,5};
        System.out.println(singleNumber(nums));
    }

    // This is my solution with HashMap and EntrySet.
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }

        for (Map.Entry<Integer, Integer> set :
                    map.entrySet()) {
            if (set.getValue() == 1) {
                return set.getKey();
            }
        }
        return 0;
    }

    // I don't fully understand this but I'll try to understand. 
    public static int anotherSingleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res ^= num;
        }
        return res;
    }
}
