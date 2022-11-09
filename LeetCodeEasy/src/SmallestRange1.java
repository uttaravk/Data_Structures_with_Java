public class SmallestRange1 {
    public int smallestRangeI(int[] nums, int k) {

        if (nums.length <= 1) {
            return 0;
        }
        //Alternate solution:
        // Arrays.sort(nums);
        // int min = nums[0];
        // int max = nums[nums.length-1];

        int min = nums[0];
        int max = nums[0];
        int score;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        score = (max - k) - (min + k);

        if (score > 0) {
            return score;
        }
        return 0;
    }
}
