package difficulty.easy.algorithm88MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // In this for loop, we simply add the nums2 array to the top of the nums1 array.
        for (int j = 0, i = m; j < n ; j++) {
            nums1[i] = nums2[j];
            i++;
        }

        // Then we sort the nums1 array with the sort() method.
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

        
    }


    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,m,nums2,n);
    }
}
