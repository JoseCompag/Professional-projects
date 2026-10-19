package assignment4_exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * The `Path` class represents and manipulates a path of nodes stored as a list.
 * It provides methods to add nodes, generate an edge list from the node list,
 * verify sublists, and convert the path to string representations.
 *
 */
public class Path {

    /**
     * List that stores the nodes of the path.
     */
    private List<Integer> list = new ArrayList<>();

    /**
     * Returns the list of nodes as a list of strings.
     *
     * @return A list of strings representing each node in the original list.
     */
    public List<String> getList() {
        List<String> listString = new ArrayList<>();
        for (Integer i : list) {
            listString.add(String.valueOf(i));
        }
        return listString;
    }

    /**
     * Adds a node (an integer) to the end of the node list.
     *
     * @param i The integer representing the node to be added.
     */
    public void add(Integer i) {
        list.add(i);
    }

    /**
     * Prints the list of nodes to the console, preceded by the title "--- Nodes List ---".
     */
    public void print() {
        System.out.println("\n" + "--- Nodes List ---");
        System.out.println(list.toString());
    }

    /**
     * Returns a list of edges (pairs of nodes) based on the node list.
     * Each edge is represented as a string in the format "node1 node2".
     *
     * @return A list of strings representing the edges in the path.
     */
    public List<String> edges() {
        String edge = "";
        List<String> edges = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            edge += list.get(i) + " ";
            edge += list.get(i + 1);
            edges.add(edge);
            edge = "";
        }
        return edges;
    }

    /**
     * Prints the list of edges to the console, preceded by the title "--- Edges List ---".
     */
    public void printEdges() {
        System.out.println("--- Edges List ---");
        List<String> edges = edges();
        for (String edge : edges) {
            System.out.println(edge);
        }
    }

    /**
     * Checks if a given list is a sublist of the node list in this path.
     *
     * @param sublist The list of integers to be checked as a sublist.
     * @return true if the sublist is present in the node list, false otherwise.
     */
    public boolean isSublist(List<Integer> sublist) {
        for (int i = 0; i <= list.size() - sublist.size(); i++) {
            if (list.subList(i, i + sublist.size()).equals(sublist)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the string representation of the node list.
     *
     * @return A string containing the contents of the node list.
     */
    @Override
    public String toString() {
        return list.toString();
    }
}
