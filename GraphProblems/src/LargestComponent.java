//Determine largest component in the given graph.

import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class LargestComponent {

    public int getLargestComponent(HashMap<Integer, ArrayList<Integer>> graph) {
        int maxComponentNodes = 0;
        HashSet<Integer> visitedNodes = new HashSet<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : graph.entrySet()) {
            Integer currNode = entry.getKey();
            if (!visitedNodes.contains(currNode)) {
                int visitedNodesCount = getNodesCount(graph, currNode, visitedNodes);
                maxComponentNodes = maxComponentNodes < visitedNodesCount ? visitedNodesCount : maxComponentNodes;
            }
        }
        return maxComponentNodes;
    }

    private int getNodesCount(HashMap<Integer, ArrayList<Integer>> graph, Integer currNode, HashSet<Integer> visitedNodes) {
        int visitedNodesCount = 1;
        visitedNodes.add(currNode);
        ArrayList<Integer> neighbours = graph.get(currNode);
        for (int i = 0; i < neighbours.size(); i++) {
            if (!visitedNodes.contains(neighbours.get(i))) {
                visitedNodesCount += getNodesCount(graph, neighbours.get(i), visitedNodes);
            }
        }
        return visitedNodesCount;
    }

}
