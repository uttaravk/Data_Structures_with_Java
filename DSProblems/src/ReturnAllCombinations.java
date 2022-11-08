// Given nums array return all combination of nums[i]; whose total is equal to the given maxLimit.

import java.util.ArrayList;

public class ReturnAllCombinations {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> returnAllCombinations(
            ArrayList<Integer> nums, Integer maxLimit) {
        getCombo(nums, maxLimit, new ArrayList<>());
        return result;
    }

    public void getCombo(
            ArrayList<Integer> numbers, Integer maxLimit, ArrayList<Integer> currResult) {
        int currSum = 0;
        for (int i = 0; i < currResult.size(); i++) {
            currSum += currResult.get(i);
        }

        if (currSum == maxLimit) {
            result.add(currResult);
        }

        if (currSum >= maxLimit) {
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            ArrayList<Integer> newRemaining = new ArrayList<>();
            for (int j = i + 1; j < numbers.size(); j++) {
                newRemaining.add(numbers.get(j));
            }
            ArrayList<Integer> ncurrResult = new ArrayList<>(currResult);
            ncurrResult.add(numbers.get(i));
            getCombo(newRemaining, maxLimit, ncurrResult);
        }
    }
}
