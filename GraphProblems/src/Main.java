import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        DepthFirstTraversal dft = new DepthFirstTraversal();
        HashMap<String, ArrayList<String>> inputGraph = new HashMap<String, ArrayList<String>>();
        inputGraph.put("a", new ArrayList<>(Arrays.asList("b", "c")));
        inputGraph.put("b", new ArrayList<>(Arrays.asList("d")));
        inputGraph.put("c", new ArrayList<>(Arrays.asList("e")));
        inputGraph.put("d", new ArrayList<>(Arrays.asList("f")));
        inputGraph.put("e", new ArrayList<>());
        inputGraph.put("f", new ArrayList<>());

        HashMap<Integer, ArrayList<Integer>> emptyGraph = new HashMap<Integer, ArrayList<Integer>>();

        System.out.print("Iterative DFT: ");
        dft.printIterativeDepthFirstTraversal(inputGraph, "a");
        System.out.println("");
        System.out.print("Recursive DFT: ");
        dft.printRecursiveDepthFirstTraversal(inputGraph, "a");
        System.out.println("");
        BreadthFirstTraversal bft = new BreadthFirstTraversal();
        System.out.print("Iterative BFT: ");
        bft.printIterativeBreadthFirstTraversal(inputGraph, "a");
        System.out.println("");

        HashMap<String, ArrayList<String>> pathGraph = new HashMap<String, ArrayList<String>>();
        pathGraph.put("f", new ArrayList<>(Arrays.asList("i", "g")));
        pathGraph.put("g", new ArrayList<>(Arrays.asList("h")));
        pathGraph.put("h", new ArrayList<>());
        pathGraph.put("i", new ArrayList<>(Arrays.asList("g", "k")));
        pathGraph.put("j", new ArrayList<>(Arrays.asList("i")));
        pathGraph.put("k", new ArrayList<>());

        Boolean result = dft.isPathAvaliableDFT(pathGraph, "f", "k");
        System.out.println("DFT: Is Path Avaliable between f & k: " + result);
        result = dft.isPathAvaliableDFT(pathGraph, "j", "f");
        System.out.println("DFT: Is Path Avaliable between j & f: " + result);

        result = dft.isPathAvaliableRecursiveDFT(pathGraph, "f", "k");
        System.out.println("DFT-Recursive: Is Path Avaliable between f & k: " + result);
        result = dft.isPathAvaliableRecursiveDFT(pathGraph, "j", "f");
        System.out.println("DFT-Recursive: Is Path Avaliable between j & f: " + result);

        result = bft.isPathAvaliableBFT(pathGraph, "f", "k");
        System.out.println("BFT: Is Path Avaliable between f & k: " + result);
        result = bft.isPathAvaliableBFT(pathGraph, "j", "f");
        System.out.println("BFT: Is Path Avaliable between j & f: " + result);

        HashMap<String, ArrayList<String>> cyclicUndirectedPathGraph =
                new HashMap<String, ArrayList<String>>();
        cyclicUndirectedPathGraph.put("i", new ArrayList<>(Arrays.asList("j", "k")));
        cyclicUndirectedPathGraph.put("j", new ArrayList<>(Arrays.asList("i")));
        cyclicUndirectedPathGraph.put("k", new ArrayList<>(Arrays.asList("i", "m", "l")));
        cyclicUndirectedPathGraph.put("m", new ArrayList<>(Arrays.asList("k")));
        cyclicUndirectedPathGraph.put("l", new ArrayList<>(Arrays.asList("k")));
        cyclicUndirectedPathGraph.put("o", new ArrayList<>(Arrays.asList("n")));
        cyclicUndirectedPathGraph.put("n", new ArrayList<>(Arrays.asList("o")));

        result = dft.isPathAvaliableDFT(cyclicUndirectedPathGraph, "i", "l");
        System.out.println("Cyclic DFT: Is Path Avaliable between i & l: " + result);
        result = dft.isPathAvaliableDFT(cyclicUndirectedPathGraph, "k", "o");
        System.out.println("Cyclic DFT: Is Path Avaliable between k & o: " + result);

        result = dft.isPathAvaliableRecursiveDFT(cyclicUndirectedPathGraph, "i", "l");
        System.out.println("Cyclic DFT-Recursive: Is Path Avaliable between i & l: " + result);
        result = dft.isPathAvaliableRecursiveDFT(cyclicUndirectedPathGraph, "k", "o");
        System.out.println("Cyclic DFT-Recursive: Is Path Avaliable between k & o: " + result);

        result = bft.isPathAvaliableBFT(cyclicUndirectedPathGraph, "i", "l");
        System.out.println("Cyclic BFT: Is Path Avaliable between i & l: " + result);
        result = bft.isPathAvaliableBFT(cyclicUndirectedPathGraph, "k", "o");
        System.out.println("Cyclic BFT: Is Path Avaliable between k & o: " + result);

        ArrayList<ArrayList<String>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList("i", "j")));
        edges.add(new ArrayList<>(Arrays.asList("k", "i")));
        edges.add(new ArrayList<>(Arrays.asList("m", "k")));
        edges.add(new ArrayList<>(Arrays.asList("k", "l")));
        edges.add(new ArrayList<>(Arrays.asList("o", "n")));

        GenerateGraph generateGraph = new GenerateGraph();
        System.out.println(generateGraph.convertUndirectedEdgesToAdjacencyList(edges));

        HashMap<Integer, ArrayList<Integer>> connectedComponentGraph =
                new HashMap<Integer, ArrayList<Integer>>();
        connectedComponentGraph.put(3, new ArrayList<>());
        connectedComponentGraph.put(4, new ArrayList<>(Arrays.asList(6)));
        connectedComponentGraph.put(6, new ArrayList<>(Arrays.asList(4, 5, 7, 8)));
        connectedComponentGraph.put(5, new ArrayList<>(Arrays.asList(6)));
        connectedComponentGraph.put(7, new ArrayList<>(Arrays.asList(6)));
        connectedComponentGraph.put(8, new ArrayList<>(Arrays.asList(6)));
        connectedComponentGraph.put(1, new ArrayList<>(Arrays.asList(2)));
        connectedComponentGraph.put(2, new ArrayList<>(Arrays.asList(1)));

        HashMap<Integer, ArrayList<Integer>> connectedComponentGraph2 =
                new HashMap<Integer, ArrayList<Integer>>();
        connectedComponentGraph2.put(0, new ArrayList<>(Arrays.asList(8, 1, 5)));
        connectedComponentGraph2.put(1, new ArrayList<>(Arrays.asList(0)));
        connectedComponentGraph2.put(5, new ArrayList<>(Arrays.asList(0, 8)));
        connectedComponentGraph2.put(8, new ArrayList<>(Arrays.asList(0, 5)));
        connectedComponentGraph2.put(2, new ArrayList<>(Arrays.asList(3, 4)));
        connectedComponentGraph2.put(3, new ArrayList<>(Arrays.asList(2, 4)));
        connectedComponentGraph2.put(4, new ArrayList<>(Arrays.asList(3, 2)));

        ConnectedComponentCount connectedComponentCount = new ConnectedComponentCount();
        System.out.println(
                "Connected components count: "
                        + connectedComponentCount.getConnectedComponentsCount(connectedComponentGraph));
        System.out.println(
                "Empty Graph Connected components count: "
                        + connectedComponentCount.getConnectedComponentsCount(emptyGraph));
        System.out.println(
                "Recursive - Connected components count: "
                        + connectedComponentCount.getRecursiveConnectedComponentsCount(
                        connectedComponentGraph));
        System.out.println(
                "Recursive - Empty Graph Connected components count: "
                        + connectedComponentCount.getRecursiveConnectedComponentsCount(emptyGraph));
        System.out.println(
                "Connected components count: "
                        + connectedComponentCount.getConnectedComponentsCount(connectedComponentGraph2));
        System.out.println(
                "Recursive - Connected components count: "
                        + connectedComponentCount.getRecursiveConnectedComponentsCount(
                        connectedComponentGraph2));

        LargestComponent largestComponent = new LargestComponent();
        System.out.println(
                "Largest Component Count: "
                        + largestComponent.getLargestComponent(connectedComponentGraph2));

        ArrayList<ArrayList<String>> edgesShortestPath = new ArrayList<>();
        edgesShortestPath.add(new ArrayList<>(Arrays.asList("w", "x")));
        edgesShortestPath.add(new ArrayList<>(Arrays.asList("x", "y")));
        edgesShortestPath.add(new ArrayList<>(Arrays.asList("z", "y")));
        edgesShortestPath.add(new ArrayList<>(Arrays.asList("z", "v")));
        edgesShortestPath.add(new ArrayList<>(Arrays.asList("w", "v")));

        ShortestPath shortestPath = new ShortestPath();
        System.out.println(
                "Shortest Path Array Implementation: "
                        + shortestPath.getShortestPathLengthArr(edgesShortestPath, "w", "z"));
        System.out.println(
                "Shortest Path: " + shortestPath.getShortestPathLength(edgesShortestPath, "w", "z"));
        System.out.println(
                "Shortest Path Array Implementation: "
                        + shortestPath.getShortestPathLengthArr(edgesShortestPath, "b", "g"));
        System.out.println(
                "Shortest Path: " + shortestPath.getShortestPathLength(edgesShortestPath, "b", "g"));

        ArrayList<ArrayList<String>> islandGrid = new ArrayList<>();
        islandGrid.add(new ArrayList<>(Arrays.asList("W", "L", "W", "W", "W")));
        islandGrid.add(new ArrayList<>(Arrays.asList("W", "L", "W", "W", "W")));
        islandGrid.add(new ArrayList<>(Arrays.asList("W", "W", "W", "L", "W")));
        islandGrid.add(new ArrayList<>(Arrays.asList("W", "W", "L", "L", "W")));
        islandGrid.add(new ArrayList<>(Arrays.asList("L", "W", "W", "L", "L")));
        islandGrid.add(new ArrayList<>(Arrays.asList("L", "L", "W", "W", "W")));

        ArrayList<ArrayList<String>> islandGrid2 = new ArrayList<>();
        islandGrid2.add(new ArrayList<>(Arrays.asList("L", "L", "L")));
        islandGrid2.add(new ArrayList<>(Arrays.asList("L", "L", "L")));
        islandGrid2.add(new ArrayList<>(Arrays.asList("L", "L", "L")));

        ArrayList<ArrayList<String>> islandGrid3 = new ArrayList<>();
        islandGrid3.add(new ArrayList<>(Arrays.asList("W", "W")));
        islandGrid3.add(new ArrayList<>(Arrays.asList("W", "W")));
        islandGrid3.add(new ArrayList<>(Arrays.asList("W", "W")));

        IslandCount islandCount = new IslandCount();
        System.out.println("Island Count Grid1: " + islandCount.getIslandCount(islandGrid));
        System.out.println("Island Count Grid2: " + islandCount.getIslandCount(islandGrid2));
        System.out.println("Island Count Grid3: " + islandCount.getIslandCount(islandGrid3));

        System.out.println(
                "Island Count Grid Solution 1: " + islandCount.getIslandCountGridSolution(islandGrid));
        System.out.println(
                "Island Count Grid Solution 2: " + islandCount.getIslandCountGridSolution(islandGrid2));
        System.out.println(
                "Island Count Grid Solution 3: " + islandCount.getIslandCountGridSolution(islandGrid3));

        MinimumIsland minimumIsland = new MinimumIsland();
        System.out.println(
                "Minimum Island Size Grid1: " + minimumIsland.getMinimumIslandSize(islandGrid));
        System.out.println(
                "Minimum Island Size Grid2: " + minimumIsland.getMinimumIslandSize(islandGrid2));
        System.out.println(
                "Minimum Island Size Grid3: " + minimumIsland.getMinimumIslandSize(islandGrid3));


    }
}
