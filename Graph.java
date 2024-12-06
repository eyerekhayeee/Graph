import java.util.*;

class Graph {
    private Map<String, List<String>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String start, String end) {
        if (adjacencyList.containsKey(start) && adjacencyList.containsKey(end)) {
            adjacencyList.get(start).add(end);
        }
    }
