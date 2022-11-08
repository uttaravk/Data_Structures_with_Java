//Determine the shortest path between 2 given nodes of a graph
import java.util.*;

public class ShortestPath {

    public int getShortestPathLength(ArrayList<ArrayList<String>> edges, String source, String distination) {
        HashSet<String> visitedSet = new HashSet<>();
        GenerateGraph generateGraph = new GenerateGraph();
        HashMap<String, ArrayList<String>> graph = generateGraph.convertUndirectedEdgesToAdjacencyList(edges);
        Queue<HashMap<String, Integer>> workingQueue = new LinkedList<>();
        HashMap<String, Integer> nodeDistMap = new HashMap<>();
        nodeDistMap.put(source, 0);
        workingQueue.add(nodeDistMap);
        while (!workingQueue.isEmpty()) {
            for (Map.Entry<String, Integer> entry2 : workingQueue.remove().entrySet()) {
                String currNode = entry2.getKey();
                Integer currDist = entry2.getValue();
                visitedSet.add(currNode);
                ArrayList<String> neighbours = graph.get(currNode);
                if (neighbours != null) {
                    for (int i = 0; i < neighbours.size(); i++) {
                        String neighbour = neighbours.get(i);
                        if (!visitedSet.contains(neighbour)) {
                            if (distination.equals(neighbour)) {
                                return currDist + 1;
                            }
                            HashMap<String, Integer> neighbourDistMap = new HashMap<>() {{
                                put(neighbour, currDist + 1);
                            }};
                            workingQueue.add(neighbourDistMap);
                        }
                    }
                }
            }
        }
        return -1;
    }

    public int getShortestPathLengthArr(ArrayList<ArrayList<String>> edges, String source, String distination) {
        HashSet<String> visitedSet = new HashSet<>();
        GenerateGraph generateGraph = new GenerateGraph();
        HashMap<String, ArrayList<String>> graph = generateGraph.convertUndirectedEdgesToAdjacencyList(edges);
        Queue<ArrayList<String>> workingQueue = new LinkedList<>();
        ArrayList<String> nodeDist = new ArrayList<>(Arrays.asList(source, String.valueOf(0)));
        workingQueue.add(nodeDist);
        while (!workingQueue.isEmpty()) {
            ArrayList<String> currNodeDist = workingQueue.remove();
            String currNode = currNodeDist.get(0);
            Integer currDist = Integer.valueOf(currNodeDist.get(1));
            visitedSet.add(currNode);
            ArrayList<String> neighbours = graph.get(currNode);
            if (neighbours != null) {
                for (int i = 0; i < neighbours.size(); i++) {
                    String neighbour = neighbours.get(i);
                    if (!visitedSet.contains(neighbour)) {
                        if (distination.equals(neighbour)) {
                            return currDist + 1;
                        }
                        ArrayList<String> neighbourNodeDist = new ArrayList<>(Arrays.asList(neighbour, String.valueOf(currDist + 1)));
                        workingQueue.add(neighbourNodeDist);
                    }
                }
            }
        }
        return -1;
    }
}
