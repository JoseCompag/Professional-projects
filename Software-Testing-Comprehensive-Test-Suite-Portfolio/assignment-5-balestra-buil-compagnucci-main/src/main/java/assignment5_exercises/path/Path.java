package assignment5_exercises.path;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Integer> nodes = new ArrayList<>();

    public List<Integer> getNodes() {
        return nodes;
    }

    public void addNode(Integer node) {
        nodes.add(node);
    }

    public void printNodes() {
        System.out.println("\n--- Nodes List ---");
        System.out.println(nodes.toString());
    }

    public List<String> getEdges() {
        List<String> edges = new ArrayList<>();
        for (int i = 0; i < nodes.size() - 1; i++) {
            String edge = nodes.get(i) + " " + nodes.get(i + 1);
            edges.add(edge);
        }
        return edges;
    }

    public void printEdges() {
        System.out.println("--- Edges List ---");
        List<String> edges = getEdges();
        for (String edge : edges) {
            System.out.println(edge);
        }
    }

    public boolean containsSublist(List<Integer> sublist) {
        for (int i = 0; i <= nodes.size() - sublist.size(); i++) {
            if (nodes.subList(i, i + sublist.size()).equals(sublist)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nodes.toString();
    }
}