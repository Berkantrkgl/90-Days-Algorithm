package difficulty.easy.algorithm219;

import java.util.HashMap;
import java.util.HashSet;

public class Solution219 {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));


    }

    // This is my own solution with using HashMap.
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }

    // This is another good and compact solution with using Set data structure.
    //With this solution, we always keep the range examined in the given k value dimension.
    public static boolean anotherContainsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        // Create a Hash Set for storing previous of k elements...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse for all elements of the given array in a for loop...
        for(int j = 0; j < nums.length; j++) {
            // If duplicate element is present at distance less than equal to k, return true...
            if(!hset.add(nums[j])){
                return true;
            }
            // If size of the Hash Set becomes greater than k...
            if(hset.size() >= k+1){
                // Remove the last visited element from the set...
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;

    }



}
