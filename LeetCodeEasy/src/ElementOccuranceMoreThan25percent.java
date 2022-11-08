//Element Appearing More Than 25% In Sorted Array
//Given an integer array sorted in non-decreasing order,
// there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

//Example 1:
//Input: arr = [1,2,2,6,6,6,6,7,10]
//Output: 6

public class ElementOccuranceMoreThan25percent {
    public int findSpecialInteger(int[] arr) {
        int arrLen = arr.length;
        if (arrLen == 1) {
            return arr[0];
        }
        double lowerLimit = arrLen * 0.25;
        int count = 1;
        for (int i = 1; i < arrLen; i++) {
            if (arr[i] == arr[i - 1]) {
                count = count + 1;
            } else {
                count = 1;
            }
            if (count > lowerLimit) {
                return arr[i];
            }
        }
        return 0;
    }
}
