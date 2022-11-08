//Implementation of Breadth First Traversal

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;

public class BreadthFirstTraversal {

    public void printIterativeBreadthFirstTraversal(HashMap<String, ArrayList<String>> graph, String startnode) {
        Queue<String> workingQueue = new LinkedList<>();
        workingQueue.add(startnode);
        while (!workingQueue.isEmpty()) {
            String currNode = workingQueue.remove();
            ArrayList<String> neighbours = graph.get(currNode);
            for (int i = 0; i < neighbours.size(); i++) {
                workingQueue.add(neighbours.get(i));
            }
        }

    }

    public boolean isPathAvaliableBFT(HashMap<String, ArrayList<String>> graph, String src, String dist) {
        Queue<String> workingQ = new LinkedList<String>();
        workingQ.add(src);
        HashSet<String> visited = new HashSet<>();
        while (!workingQ.isEmpty()) {
            String currNode = workingQ.remove();
            if (currNode.equals(dist)) {
                return true;
            } else {
                visited.add(currNode);
            }
            ArrayList<String> neighbours = graph.get(currNode);
            for (int i = 0; i < neighbours.size(); i++) {
                String neighbour = neighbours.get(i);
                if (!visited.contains(neighbour)) {
                    workingQ.add(neighbour);
                }
            }
        }
        return false;
    }

}
