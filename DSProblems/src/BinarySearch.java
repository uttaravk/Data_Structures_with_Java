public class BinarySearch {

    public int binarySearch(int[] input, int target) {
        int mid = (0 + input.length) / 2;
        return traverseArray(input, 0, mid, input.length - 1, target);
    }

    public int binarySearchRegular(int[] input, int target) {
        int start = 0;
        int end = input.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (input[mid] == target) {
                return mid;
            } else if (input[mid] > target) {
                end = mid - 1;
            } else if (input[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }


    private int traverseArray(int[] input, int start, int mid, int end, int target) {
        int newStart = start;
        int newMid;
        int newEnd = end;
        if (start > end) {
            return -1;
        }
        if (input[mid] == target) {
            return mid;
        } else if (input[mid] < target) {
            newStart = mid + 1;
        } else if (input[mid] > target) {
            newEnd = mid - 1;
        }
        newMid = (newStart + newEnd) / 2;
        return traverseArray(input, newStart, newMid, newEnd, target);
    }

}
