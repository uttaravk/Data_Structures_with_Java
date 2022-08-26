Ref.: https://leetcode.com/problems/remove-element/

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

>int[] nums = [...]; // Input array <br/>
int val = ...; // Value to remove <br/>
int[] expectedNums = [...]; // The expected answer with correct length. <br/>
// It is sorted with no values equaling val.<br/><br/>
int k = removeElement(nums, val); // Calls your implementation<br/><br/>
assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
assert nums[i] == expectedNums[i];
}

**Example 1:**

>**Input:** nums = [3,2,2,3], val = 3<br/>
**Output:** 2, nums = [2,2,_,_]<br/>
**Explanation:** Your function should return k = 2, with the first two elements of nums being 2.<br/>
It does not matter what you leave beyond the returned k (hence they are underscores).<br/>

**Example 2:**

>**Input:** nums = [0,1,2,2,3,0,4,2], val = 2<br/>
**Output:** 5, nums = [0,1,4,0,3,_,_,_]<br/>
**Explanation:** Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.<br/>
Note that the five elements can be returned in any order.<br/>
It does not matter what you leave beyond the returned k (hence they are underscores).<br/>


**Constraints:**
>* 0 <= nums.length <= 100<br/>
>* 0 <= nums[i] <= 50<br/>
>* 0 <= val <= 100<br/>