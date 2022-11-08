//A grid contains L & W cells representing Land and Water respectively.
//Determine the smallest island in the given grid.

import java.util.ArrayList;
import java.util.HashSet;

public class MinimumIsland {

    public int getMinimumIslandSize(ArrayList<ArrayList<String>> islandGrid) {
        int minIslandSize = Integer.MAX_VALUE;
        HashSet<String> visited = new HashSet<>();
        for (int row = 0; row < islandGrid.size(); row++) {
            for (int col = 0; col < islandGrid.get(0).size(); col++) {
                String currNode = '(' + String.valueOf(row) + ',' + String.valueOf(col) + ')';
                if (!visited.contains(currNode) && islandGrid.get(row).get(col).equals("L")) {
                    int currIslandSize = exploreNode(islandGrid, row, col, visited);
                    if (currIslandSize < minIslandSize) {
                        minIslandSize = currIslandSize;
                    }
                }

            }
        }
        if (minIslandSize == Integer.MAX_VALUE) {
            return 0;
        }
        return minIslandSize;
    }

    private int exploreNode(ArrayList<ArrayList<String>> islandGrid, Integer row, Integer col, HashSet<String> visited) {
        String currNode = '(' + String.valueOf(row) + ',' + String.valueOf(col) + ')';
        if (!visited.contains(currNode) && islandGrid.get(row).get(col).equals("L")) {
            visited.add(currNode);
            int cnt = 1;
            if (row - 1 >= 0) {
                cnt += exploreNode(islandGrid, row - 1, col, visited);
            }
            if (col - 1 >= 0) {
                cnt += exploreNode(islandGrid, row, col - 1, visited);
            }
            if (row + 1 < islandGrid.size()) {
                cnt += exploreNode(islandGrid, row + 1, col, visited);
            }
            if (col + 1 < islandGrid.get(0).size()) {
                cnt += exploreNode(islandGrid, row, col + 1, visited);
            }
            return cnt;
        }
        return 0;
    }
}
