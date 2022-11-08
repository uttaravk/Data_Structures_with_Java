public class Main {
    public static void main(String[] args) {
        ElementOccuranceMoreThan25percent elementOccuranceMoreThan25percent = new ElementOccuranceMoreThan25percent();
        int[] arr = new int[]{1,2,2,6,6,6,6,7,10};
        System.out.println(elementOccuranceMoreThan25percent.findSpecialInteger(arr));
    }
}