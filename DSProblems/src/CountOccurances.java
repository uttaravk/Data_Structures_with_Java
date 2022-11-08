// Count word and occurances

import java.util.HashMap;
import java.util.Map;

public class CountOccurances {
    public void countOccurances(String s) {
        String[] strArr = s.split(" ");
        HashMap<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            if (!countMap.containsKey(strArr[i])) {
                countMap.put(strArr[i], 1);
            } else {
                Integer prevCount = countMap.get(strArr[i]);
                countMap.put(strArr[i], prevCount + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.print("word: " + entry.getKey());
            System.out.print(" occurance: ");
            System.out.println(entry.getValue());
        }
    }
}
