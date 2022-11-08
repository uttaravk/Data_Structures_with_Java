//A grid contains L & W cells representing Land and Water respectively.
//Determine number of islands in the given grid.

import java.util.*;

public class IslandCount {

    public int getIslandCount(ArrayList<ArrayList<String>> islandGrid) {
        int islandCount = 0;
        HashMap<String, ArrayList<String>> graph = getAdjacencyMap(islandGrid);
        HashSet<String> visited = new HashSet<>();
        for (Map.Entry<String, ArrayList<String>> entry : graph.entrySet()) {
            String currNode = entry.getKey();
            if (!visited.contains(currNode)) {
                exploreNode(graph, currNode, visited);
                islandCount += 1;
            }
        }


        return islandCount;
    }

    private void exploreNode(HashMap<String, ArrayList<String>> graph, String currNode, HashSet<String> visited) {
        visited.add(currNode);
        ArrayList<String> neighbours = graph.get(currNode);
        for (int i = 0; i < neighbours.size(); i++) {
            String neighbour = neighbours.get(i);
            if (!visited.contains(neighbour)) {
                exploreNode(graph, neighbour, visited);
            }
        }
    }

    private HashMap<String, ArrayList<String>> getAdjacencyMap(ArrayList<ArrayList<String>> islandGrid) {
        HashMap<String, ArrayList<String>> adjacencyMap = new HashMap<>();
        for (int row = 0; row < islandGrid.size(); row++) {
            for (int col = 0; col < islandGrid.get(0).size(); col++) {
                if (islandGrid.get(row).get(col).equals("L")) {
                    String currKey = '(' + String.valueOf(row) + ',' + String.valueOf(col) + ')';
                    if (!adjacencyMap.containsKey(currKey)) {
                        adjacencyMap.put(currKey, new ArrayList<>());
                    }
                    if (row + 1 < islandGrid.size() && islandGrid.get(row + 1).get(col).equals("L")) {
                        adjacencyMap.get(currKey).add('(' + String.valueOf(row + 1) + ',' + String.valueOf(col) + ')');
                    }
                    if (col + 1 < islandGrid.get(0).size() && islandGrid.get(row).get(col + 1).equals("L")) {
                        adjacencyMap.get(currKey).add('(' + String.valueOf(row) + ',' + String.valueOf(col + 1) + ')');
                    }
                    if (row > 0 && islandGrid.get(row - 1).get(col).equals("L")) {
                        adjacencyMap.get(currKey).add('(' + String.valueOf(row - 1) + ',' + String.valueOf(col) + ')');
                    }
                    if (col > 0 && islandGrid.get(row).get(col - 1).equals("L")) {
                        adjacencyMap.get(currKey).add('(' + String.valueOf(row) + ',' + String.valueOf(col - 1) + ')');
                    }
                }
            }
        }
        return adjacencyMap;
    }

    public int getIslandCountGridSolution(ArrayList<ArrayList<String>> islandGrid) {
        int islandCount = 0;
        HashSet<String> visited = new HashSet<>();
        for (int row = 0; row < islandGrid.size(); row++) {
            for (int col = 0; col < islandGrid.get(0).size(); col++) {
                String currNode = '(' + String.valueOf(row) + ',' + String.valueOf(col) + ')';
                if (!visited.contains(currNode)) {
                    if (exploreNodeInGrid(islandGrid, row, col, visited) == true) {
                        islandCount += 1;
                    }
                }
            }
        }
        return islandCount;
    }

    private boolean exploreNodeInGrid(ArrayList<ArrayList<String>> islandGrid, Integer row, Integer col, HashSet<String> visited) {
        String currNode = '(' + String.valueOf(row) + ',' + String.valueOf(col) + ')';

        if (!visited.contains(currNode) && islandGrid.get(row).get(col).equals("L")) {
            visited.add(currNode);
            if (row + 1 < islandGrid.size()) {
                exploreNodeInGrid(islandGrid, row + 1, col, visited);
            }
            if (row - 1 >= 0) {
                exploreNodeInGrid(islandGrid, row - 1, col, visited);
            }
            if (col - 1 >= 0) {
                exploreNodeInGrid(islandGrid, row, col - 1, visited);
            }
            if (col + 1 < islandGrid.get(0).size()) {
                exploreNodeInGrid(islandGrid, row, col + 1, visited);
            }

            return true;
        }
        return false;
    }
}
