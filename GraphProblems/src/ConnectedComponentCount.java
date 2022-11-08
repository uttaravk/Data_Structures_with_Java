//Problem: Count number of connected components in a graph

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class ConnectedComponentCount {
    public int getConnectedComponentsCount(HashMap<Integer, ArrayList<Integer>> graph) {
        int count = 0;
        HashSet<Integer> visitedSet = new HashSet<>();
        Stack<Integer> workingStack = new Stack<>();
        for (HashMap.Entry<Integer, ArrayList<Integer>> entry : graph.entrySet()) {
            Integer currNode = entry.getKey();
            if (!visitedSet.contains(currNode)) {
                workingStack.push(currNode);
                while (!workingStack.empty()) {
                    currNode = workingStack.pop();
                    visitedSet.add(currNode);
                    ArrayList<Integer> neighbours = graph.get(currNode);
                    for (int i = 0; i < neighbours.size(); i++) {
                        Integer neighbour = neighbours.get(i);
                        if (!visitedSet.contains(neighbour)) {
                            workingStack.push(neighbour);
                        }
                    }
                }
                count = count + 1;
            }
        }
        return count;
    }

    public int getRecursiveConnectedComponentsCount(HashMap<Integer, ArrayList<Integer>> graph) {
        HashSet<Integer> visitedSet = new HashSet<>();
        int count = 0;
        for (HashMap.Entry<Integer, ArrayList<Integer>> entry : graph.entrySet()) {
            Integer currNode = entry.getKey();
            if (!visitedSet.contains(currNode)) {
                exploreNode(graph, currNode, visitedSet);
                count = count + 1;
            }
        }
        return count;
    }

    private void exploreNode(HashMap<Integer, ArrayList<Integer>> graph, Integer currNode, HashSet<Integer> visitedSet) {
        visitedSet.add(currNode);
        ArrayList<Integer> neighbours = graph.get(currNode);
        for (int i = 0; i < neighbours.size(); i++) {
            Integer neighbour = neighbours.get(i);
            if (!visitedSet.contains(neighbour)) {
                exploreNode(graph, neighbour, visitedSet);
            }
        }
    }
}
