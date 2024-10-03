import java.util.*;

public class Graph {

    private final List<Node> nodes;
    private final List<Edge> edges;
    private final Map<String, String> attributes;

    public Graph() {
        this(Collections.emptyMap());
    }

    public Graph(Map<String, String> attributes) {
        this.attributes = Map.copyOf(attributes);
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public Collection<Node> getNodes() {
        return List.copyOf(nodes);
    }

    public Collection<Edge> getEdges() {
        return List.copyOf(edges);
    }

    public Graph node(String name) {
        nodes.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        nodes.add(new Node(name, Map.copyOf(attributes)));
        return this;
    }

    public Graph edge(String start, String end) {
        edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        edges.add(new Edge(start, end, Map.copyOf(attributes)));
        return this;
    }

    public Map<String, String> getAttributes() {
        return Map.copyOf(attributes);
    }
}
