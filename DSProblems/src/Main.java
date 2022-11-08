import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        System.out.print("Pos: ");
        System.out.println(
                bs.binarySearch(new int[]{1, 4, 5, 7, 9, 12, 15, 18, 19, 22, 25, 29, 40, 50}, 12));
        System.out.println(
                bs.binarySearch(new int[]{1, 4, 5, 7, 9, 12, 15, 18, 19, 22, 25, 29, 40, 50}, 6));
        System.out.println(
                bs.binarySearchRegular(new int[]{1, 4, 5, 7, 9, 12, 15, 18, 19, 22, 25, 29, 40, 50}, 12));
        System.out.println(
                bs.binarySearchRegular(new int[]{1, 4, 5, 7, 9, 12, 15, 18, 19, 22, 25, 29, 40, 50}, 6));

        CountOccurances co = new CountOccurances();
        co.countOccurances("We love you and you love us");

        ReturnAllCombinations returnAllCombinations = new ReturnAllCombinations();
        System.out.println(returnAllCombinations.returnAllCombinations(new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8)), 10));

    }
}
