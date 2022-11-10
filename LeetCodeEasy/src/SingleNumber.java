//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int numsLen = nums.length;
        if (numsLen == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < numsLen - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i++;
        }
        return nums[numsLen - 1];
    }
}
