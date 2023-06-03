import java.util.*;

public class Vertex<V> {
    public V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data){
        adjacentVertices = new HashMap<>();
        this.data = data;
    }

    public void addAdjacentVertices(Vertex<V> destination, double weight){
        adjacentVertices.put(destination, weight);
    }

    public int adjacentVerticesCount(){
        return adjacentVertices.size();
    }

    public Double getWeight(Vertex<V> v){
        return adjacentVertices.get(v);
    }

    public boolean contains(Vertex<V> v){
        return adjacentVertices.containsKey(v);
    }

    public Iterable<V> getAdjacent(){
        List<V> vertices = new LinkedList<>();
        for (var elem : adjacentVertices.keySet()) {
            vertices.add(elem.data);
        }
        return vertices;
    }
}