public class Main {
  public static void main(String[] args) {

    ElementOccuranceMoreThan25percent elementOccuranceMoreThan25percent =
        new ElementOccuranceMoreThan25percent();
    int[] arr = new int[] {1, 2, 2, 6, 6, 6, 6, 7, 10};
    System.out.println(elementOccuranceMoreThan25percent.findSpecialInteger(arr));

    ContainsDuplicate cd = new ContainsDuplicate();
    int[] intArray = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    System.out.println(cd.containsDuplicate(intArray));

    IsomorphicStrings is = new IsomorphicStrings();
    System.out.println(is.isIsomorphic("paper", "title"));

    WordPattern wp = new WordPattern();
    System.out.println(wp.wordPattern("abba", "dog cat cat dog"));

    int[] digits = new int[] {1, 2, 3};
    int[] digits2 = new int[] {9, 9, 9};
    PlusOne plusOne = new PlusOne();
    System.out.println("Input: ");
    printArray(digits);
    System.out.println("\n" + "Output: ");
    int[] output = plusOne.plusOne(digits);
    printArray(output);
    System.out.println(" ");
    System.out.println("Input: ");
    printArray(digits2);
    System.out.println("\n" + "Output: ");
    int[] output2 = plusOne.plusOne(digits2);
    printArray(output2);
    System.out.println(" ");

    RemoveElement removeElement = new RemoveElement();
    int[] nums1 = {3, 2, 2, 3};
    int val1 = 3;
    System.out.print("Input Array: ");
    printArray(nums1);
    int result1 = removeElement.removeElement(nums1, val1);
    System.out.print("\nResultant Array: ");
    printArray(nums1);
    System.out.println("\nResultant Position: " + result1 + "\n");

    int[] nums2 = {3, 3};
    int val2 = 3;
    System.out.print("Input Array: ");
    printArray(nums2);
    int result2 = removeElement.removeElement(nums2, val2);
    System.out.print("\nResultant Array: ");
    printArray(nums2);
    System.out.println("\nResultant Position: " + result2 + "\n");

    int[] nums3 = {4, 5};
    int val3 = 5;
    System.out.print("Input Array: ");
    printArray(nums3);
    int result3 = removeElement.removeElement(nums3, val3);
    System.out.print("\nResultant Array: ");
    printArray(nums3);
    System.out.println("\nResultant Position: " + result3 + "\n");

    int[] numsSmallRange = {1,3,6};
    int k = 3;
    SmallestRange1 smallestRange1 = new SmallestRange1();
    System.out.println(smallestRange1.smallestRangeI(numsSmallRange, k));
  }

  public static void printArray(int[] array) {
    System.out.print("[");
    int len = array.length;
    for (int i = 0; i < len - 1; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.print(array[len - 1] + "]");
  }
}
