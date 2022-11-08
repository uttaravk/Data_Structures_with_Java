//Implementation of Depth First Traversal

import java.util.*;

public class DepthFirstTraversal {

    public void printIterativeDepthFirstTraversal(HashMap<String, ArrayList<String>> graph, String startNode) {
        Stack<String> workingStack = new Stack<>();
        workingStack.push(startNode);
        while (!workingStack.empty()) {
            String currentNode = workingStack.pop();
            ArrayList<String> neighbours = graph.get(currentNode);
            for (int i = 0; i < neighbours.size(); i++) {
                workingStack.push(neighbours.get(i));
            }
        }
    }

    public boolean isPathAvaliableDFT(HashMap<String, ArrayList<String>> graph, String startNode, String endNode) {
        Stack<String> workingStack = new Stack<>();
        HashSet<String> visitedNodes = new HashSet<>();
        workingStack.push(startNode);
        while (!workingStack.empty()) {
            String currNode = workingStack.pop();
            if (currNode.equals(endNode)) {
                return true;
            } else {
                visitedNodes.add(currNode);
            }
            ArrayList<String> neighbours = graph.get(currNode);
            for (int i = 0; i < neighbours.size(); i++) {
                String neighbour = neighbours.get(i);
                if (!visitedNodes.contains(neighbour)) {
                    workingStack.push(neighbour);
                }
            }
        }
        return false;
    }

    public void printRecursiveDepthFirstTraversal(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> neighbours = graph.get(startNode);

        //Base case is implicit; yet it can be
        if (neighbours == null) {
            return;
        }

        for (int i = 0; i < neighbours.size(); i++) {
            printRecursiveDepthFirstTraversal(graph, neighbours.get(i));
        }
    }

    public boolean isPathAvaliableRecursiveDFT(HashMap<String, ArrayList<String>> graph, String startNode, String endNode) {
        return isPathAvaliableRecursiveDFT(graph, startNode, endNode, new HashSet<String>());
    }

    private boolean isPathAvaliableRecursiveDFT(HashMap<String, ArrayList<String>> graph, String startNode, String endNode, HashSet<String> visited) {
        if (startNode.equals(endNode)) {
            return true;
        }
        visited.add(startNode);
        ArrayList<String> neighbours = graph.get(startNode);
        for (int i = 0; i < neighbours.size(); i++) {
            String neighbour = neighbours.get(i);
            if (!visited.contains(neighbour)) {
                if (isPathAvaliableRecursiveDFT(graph, neighbour, endNode, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
