public class Main {
    public static void main(String[] args) {
        RemoveElementSolution removeElementSolution = new RemoveElementSolution();
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        System.out.print("Input Array: ");
        printArray(nums1);
        int result1 = removeElementSolution.removeElement(nums1, val1);
        System.out.print("\nResultant Array: ");
        printArray(nums1);
        System.out.println("\nResultant Position: "+result1+"\n");

        int[] nums2 = {3,3};
        int val2 = 3;
        System.out.print("Input Array: ");
        printArray(nums2);
        int result2 = removeElementSolution.removeElement(nums2, val2);
        System.out.print("\nResultant Array: ");
        printArray(nums2);
        System.out.println("\nResultant Position: "+result2+"\n");

        int[] nums3 = {4,5};
        int val3 = 5;
        System.out.print("Input Array: ");
        printArray(nums3);
        int result3 = removeElementSolution.removeElement(nums3, val3);
        System.out.print("\nResultant Array: ");
        printArray(nums3);
        System.out.println("\nResultant Position: "+result3+"\n");
    }

    public static void printArray(int [] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }
}