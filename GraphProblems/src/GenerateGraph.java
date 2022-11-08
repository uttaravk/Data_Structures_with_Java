//Generate adjacency Hashmap from edge list
import java.util.ArrayList;
import java.util.HashMap;

public class GenerateGraph {
    public HashMap<String, ArrayList<String>> convertUndirectedEdgesToAdjacencyList(ArrayList<ArrayList<String>> edges) {
        HashMap<String, ArrayList<String>> adjacencyList = new HashMap<>();
        for (int i = 0; i < edges.size(); i++) {
            String key = edges.get(i).get(0);
            String neighbour = edges.get(i).get(1);
            if (!adjacencyList.containsKey(key)) {
                adjacencyList.put(key, new ArrayList<>());
            }
            if (!adjacencyList.containsKey(neighbour)) {
                adjacencyList.put(neighbour, new ArrayList<>());
            }
            adjacencyList.get(key).add(neighbour);
            adjacencyList.get(neighbour).add(key);
        }
        return adjacencyList;
    }
}
