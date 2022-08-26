public class Main {
    public static void main(String[] args) {
        int[] digits = new int[]{ 1,2,3};
        int[] digits2 = new int[]{9,9,9};
        PlusOneSolution plusOneSolution = new PlusOneSolution();
        System.out.println("Input: ");
        printArray(digits);
        System.out.println("\n"+ "Output: ");
        int[] output = plusOneSolution.plusOne(digits);
        printArray(output);
        System.out.println(" ");
        System.out.println("Input: ");
        printArray(digits2);
        System.out.println("\n"+ "Output: ");
        int[] output2 = plusOneSolution.plusOne(digits2);
        printArray(output2);
        System.out.println(" ");
    }

    public static void printArray(int[] array){
        System.out.print("[");
        int len = array.length;
        for (int i=0; i<len-1; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.print(array[len-1]+"]");
    }
}