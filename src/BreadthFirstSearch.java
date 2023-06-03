import java.util.*;

public class BreadthFirstSearch<Vertex> extends Search<Vertex>{

    public BreadthFirstSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);
        bfs(graph, source);
    }

    private void bfs(WeightedGraph<Vertex> graph, Vertex current) {
        marked.add(current);
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(current);
        while (!queue.isEmpty()) {
            Vertex v = queue.remove();
            for (Vertex vertex : graph.adjacencyList(v)) {
                if (!marked.contains(vertex)) {
                    marked.add(vertex);
                    edgeTo.put(vertex, v);
                    queue.add(vertex);
                }
            }
        }
    }
}
