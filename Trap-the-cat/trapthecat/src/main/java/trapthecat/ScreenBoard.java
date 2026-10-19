package trapthecat;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import java.util.Queue;

public class ScreenBoard {

  /**
   * Attribute representing the graph structure.
   */
  private Map<Integer, Par<HexagonValue, LinkedList<Integer>>> board;

  /**
   * Attribute that has a list with all the ends of the board.
   */
  private Integer[] edges;
  /**
   * Boolean list to store those nodes that were visited in BFSmodified.
   */
  private Boolean[] visited;
  /**
   * Default Constructor class.
   */
  public ScreenBoard() {
    Random random = new Random();
    this.board = new HashMap<>();
    this.visited = new Boolean[122];
    for (int i = 0; i < 122; i++) {

      this.board.put(i, new Par<>(HexagonValue.FREE, new LinkedList<Integer>()));

    }

    int numRamdomBlocks = random.nextInt(15) + 1;
    for (int i = 0; i < numRamdomBlocks; i++) {

      int numRamdom = random.nextInt(121) + 1;
      if (!(numRamdom == 61)) {
        this.board.put(numRamdom, new Par<>(HexagonValue.BLOCK, new LinkedList<>()));
      }

    }

    this.board.put(61, new Par<>(HexagonValue.CAT, new LinkedList<>()));

    Integer[] aux = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 22, 23, 33, 34, 44, 45, 55, 56, 66, 67, 77, 78, 88, 89, 99, 100, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121};
    this.edges = aux;
    connectingHexagons();

  }

  /**
   * Method that is responsible for  establishing all relationships between nodes.
   */
  private void connectingHexagons() {
    LinkedList<Integer> conjuntoA = new LinkedList<>();
    LinkedList<Integer> conjuntoB = new LinkedList<>();
    LinkedList<Integer> conjuntoBordeParteIzq = new LinkedList<>();
    LinkedList<Integer> conjuntoBordeParteDer = new LinkedList<>();

    for (int i = 1; i < board.size(); i++) {

      if ((13 <= i && i <= 21) || (35 <= i && i <= 43) || (57 <= i && i <= 65) || (79 <= i && i <= 87) || (101 <= i && i <= 109)) {
        conjuntoA.add(i);
      }

      if ((24 <= i && i <= 32) || (46 <= i && i <= 54) || (68 <= i && i <= 76) || (90 <= i && i <= 98)) {
        conjuntoB.add(i);
      }

      if (i % 11 == 0 && (i != 121 && i != 11)) {
        conjuntoBordeParteDer.add(i);
      }

      if ((i - 1) % 11 == 0 && (i != 111 && i != 1)) {
        conjuntoBordeParteIzq.add(i);
      }

    }
    for (int i = 0; i < conjuntoA.size(); i++) {

      board.get(conjuntoA.get(i)).segundo().add(conjuntoA.get(i) + 1);
      board.get(conjuntoA.get(i)).segundo().add(conjuntoA.get(i) + 12);
      board.get(conjuntoA.get(i)).segundo().add(conjuntoA.get(i) + 11);
      board.get(conjuntoA.get(i)).segundo().add(conjuntoA.get(i) - 1);
      board.get(conjuntoA.get(i)).segundo().add(conjuntoA.get(i) - 11);
      board.get(conjuntoA.get(i)).segundo().add(conjuntoA.get(i) - 10);
    }

    for (int i = 0; i < conjuntoB.size(); i++) {
      board.get(conjuntoB.get(i)).segundo().add(conjuntoB.get(i) + 1);
      board.get(conjuntoB.get(i)).segundo().add(conjuntoB.get(i) + 11);
      board.get(conjuntoB.get(i)).segundo().add(conjuntoB.get(i) + 10);
      board.get(conjuntoB.get(i)).segundo().add(conjuntoB.get(i) - 1);
      board.get(conjuntoB.get(i)).segundo().add(conjuntoB.get(i) - 12);
      board.get(conjuntoB.get(i)).segundo().add(conjuntoB.get(i) - 11);


    }

    for (int i = 0; i < conjuntoBordeParteDer.size(); i++) {
      if (conjuntoBordeParteDer.get(i) % 2 == 0) {
        board.get(conjuntoBordeParteDer.get(i)).segundo().add(conjuntoBordeParteDer.get(i) - 1);
        board.get(conjuntoBordeParteDer.get(i)).segundo().add(conjuntoBordeParteDer.get(i) - 11);
        board.get(conjuntoBordeParteDer.get(i)).segundo().add(conjuntoBordeParteDer.get(i) + 11);
      } else {
        board.get(conjuntoBordeParteDer.get(i)).segundo().add(conjuntoBordeParteDer.get(i) - 1);
        board.get(conjuntoBordeParteDer.get(i)).segundo().add(conjuntoBordeParteDer.get(i) + 10);
        board.get(conjuntoBordeParteDer.get(i)).segundo().add(conjuntoBordeParteDer.get(i) + 11);
        board.get(conjuntoBordeParteDer.get(i)).segundo().add(conjuntoBordeParteDer.get(i) - 11);
        board.get(conjuntoBordeParteDer.get(i)).segundo().add(conjuntoBordeParteDer.get(i) - 12);
      }
    }

    for (int i = 0; i < conjuntoBordeParteIzq.size(); i++) {
      if (conjuntoBordeParteIzq.get(i) % 2 != 0) {
        board.get(conjuntoBordeParteIzq.get(i)).segundo().add(conjuntoBordeParteIzq.get(i) + 1);
        board.get(conjuntoBordeParteIzq.get(i)).segundo().add(conjuntoBordeParteIzq.get(i) - 11);
        board.get(conjuntoBordeParteIzq.get(i)).segundo().add(conjuntoBordeParteIzq.get(i) + 11);
      } else {
        board.get(conjuntoBordeParteIzq.get(i)).segundo().add(conjuntoBordeParteIzq.get(i) + 1);
        board.get(conjuntoBordeParteIzq.get(i)).segundo().add(conjuntoBordeParteIzq.get(i) + 11);
        board.get(conjuntoBordeParteIzq.get(i)).segundo().add(conjuntoBordeParteIzq.get(i) + 12);
        board.get(conjuntoBordeParteIzq.get(i)).segundo().add(conjuntoBordeParteIzq.get(i) - 10);
        board.get(conjuntoBordeParteIzq.get(i)).segundo().add(conjuntoBordeParteIzq.get(i) - 11);
      }
    }
    board.get(1).segundo().add(2);
    board.get(1).segundo().add(12);
    board.get(111).segundo().add(100);
    board.get(111).segundo().add(112);
    board.get(11).segundo().add(10);
    board.get(11).segundo().add(21);
    board.get(11).segundo().add(22);
    board.get(121).segundo().add(109);
    board.get(121).segundo().add(110);
    board.get(121).segundo().add(120);
    //
    for (int i = 2; i <= 10; i++) {
      board.get(i).segundo().add(i - 1);
      board.get(i).segundo().add(i + 1);
      board.get(i).segundo().add(i + 10);
      board.get(i).segundo().add(i + 11);
    }
    //
    for (int i = 112; i <= 120; i++) {
      board.get(i).segundo().add(i + 1);
      board.get(i).segundo().add(i - 1);
      board.get(i).segundo().add(i - 11);
      board.get(i).segundo().add(i - 12);
    }
  }

  /**
   * Constructor that defines a new "ScreenBoard" from Map that is passed as a parameter.
   * @param board
   */
  public ScreenBoard(Map<Integer, Par<HexagonValue, LinkedList<Integer>>> board) {
    this.board = board;
    this.visited = new Boolean[122];
    Integer[] aux = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 22, 23, 33, 34, 44, 45, 55, 56, 66, 67, 77, 78, 88, 89, 99, 100, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121};
    this.edges = aux;
  }

  /**
   * Board attribute getter.
   * @return returns a map of integers as "key" and a tuple of a value "HexagonValue" and
   * a list of integers representing adjacent nodes of a node as "value"
   */
  public Map<Integer, Par<HexagonValue, LinkedList<Integer>>> getBoard() {
    return this.board;
  }

  /**
   * Board attribute setter.
   * @param board map of integers as "key" and a tuple of a value "HexagonValue" and
   * a list of integers representing adjacent nodes of a node as "value"
   */
  public void setBoard(Map<Integer, Par<HexagonValue, LinkedList<Integer>>> board) {
    this.board = board;
  }

  /**
   * Create a copy of the current ScreenBoard.
   * @return a copy of the current ScreenBoard.
   */
  public ScreenBoard clone() {
    Map<Integer, Par<HexagonValue, LinkedList<Integer>>> aux = new HashMap<>();

    for (Integer i : board.keySet()) {
      Par<HexagonValue, LinkedList<Integer>> auxPar = new Par<>(board.get(i).primero(), board.get(i).segundo());
      aux.put(i, auxPar);
    }
    ScreenBoard auxScreenBoard = new ScreenBoard(aux);
    return auxScreenBoard;
  }

  /**
   * Given a position on the board, it returns the value of the position in "HexagoValue".
   * @param position of board.
   * @return a value in "HexagonValue".
   */
  public HexagonValue getPositionBoard(Integer position) {
    return board.get(position).primero();
  }

  /**
   * The value of "HexagoValue" is set with respect to the indicated position.
   * @param position of the value to change.
   * @param value of the position to change in "HexagonValue".
   */
  public void setPositionBoard(Integer position, HexagonValue value) {
    board.get(position).primero(value);
  }

  /**
   * Given a position on the board, returns the adjacent positions.
   * @param position of board.
   * @return an integer list representing all adjacent nodes.
   */
  public LinkedList<Integer> getAdjacents(Integer position) {
    return board.get(position).segundo();
  }

  /**
   * Returns an integer representing the current position of the cat on the board.
   * @return the current position of the cat on the board.
   */
  public Integer positionCat() {
    for (Integer i : board.keySet()) {
      if (board.get(i).primero() == HexagonValue.CAT) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Method that returns a list of all ends or edges of the board.
   * @return a list of all edge/end nodes of the board.
   */
  public LinkedList<Integer> getEdges() {
    LinkedList<Integer> aux = new LinkedList<>();

    for (int i = 0; i < edges.length; i++) {
      aux.add(edges[i]);
    }
    return aux;
  }

  public LinkedList<Integer> getBlocks() {
    LinkedList<Integer> aux = new LinkedList<>();

    for (Integer i : board.keySet()) {
      if(board.get(i).primero() == HexagonValue.BLOCK){
        aux.add(i);
      }
    }
    return aux;
  }

  /**
   * Method that calculates the shortest distance from the position of the cat to an edge.
   * @return an integer that is the shortest distance from the cat position to an edge.
   */
  public Integer shortestPathCatToEdge() {
    Integer pred[] = new Integer[122];
    Integer dist[] = new Integer[122];
    int minDistance = Integer.MAX_VALUE;
    int src = positionCat();
    
    for (int i = 0; i < edges.length; i++) {
      if (src == this.edges[i]) {
        return -100;
      }
    }
    
    // From the cat position, I call BFSmodified for each unblocked edge.
    for (int i = 0; i < edges.length; i++) {
      if (board.get(edges[i]).primero() != HexagonValue.BLOCK) {
        if (BFSmodified(src, edges[i], pred, dist) == false) { 
          return 10;
        }
        if (dist[edges[i]] < minDistance) {
          minDistance = dist[edges[i]];
        }
      }
    }
    return minDistance;
  }

  /**
   * Method to calculate the shortest path from an origin to a destination using two matrices to store the distances and information to calculate the path.
   * That blocked node is not considered as a valid node for a path.
   * @param src is the key of the source node.
   * @param dest is the key of the destination node.
   * @param pred so that later we can build the road.
   * @param dist which stores the minimum distance from src to node i.
   * @return True if it found a path, False if it didn't.
   */
  private Boolean BFSmodified(int src, int dest, Integer pred[], Integer dist[]) {
    for (int i = 1; i < 122; i++) {
        this.visited[i] = false;
        dist[i] = Integer.MAX_VALUE;
        pred[i] = -1;
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.add(src);
    this.visited[src] = true;
    dist[src] = 0;
    
    while (!queue.isEmpty()) {
      int w = queue.poll();
      for (int i = 0; i < board.get(w).segundo().size(); i++) {
          if (visited[board.get(w).segundo().get(i)] == false) {
              int nodoAdj = board.get(w).segundo().get(i);
              if (board.get(nodoAdj).primero() == HexagonValue.FREE) {
                visited[board.get(w).segundo().get(i)] = true;
                dist[board.get(w).segundo().get(i)] = dist[w] + 1;
                pred[board.get(w).segundo().get(i)] = w;
                queue.add(board.get(w).segundo().get(i));
              
                if (board.get(w).segundo().get(i) == dest){
                  return true;
                }
              }
          }
      }
    }
  return false;
  }

  /**
   * Method to calculate the relative distance of the blocks with the cat. The bigger this number is, the freer the cat will be.
   * @return an integer that is the relative distance of the blocks with the cat.
   */
  public Integer distanceBlocks() {
    Integer pred[] = new Integer[122];
    Integer dist[] = new Integer[122];
    int src = positionCat();
    LinkedList<Integer> blocks = getBlocks();
    int relativeDistanceBlocks = -1;

    for (int i = 0; i < blocks.size(); i++) {
      if (BFSmodified2(src, blocks.get(i), pred, dist) == true) { 
        relativeDistanceBlocks = relativeDistanceBlocks + dist[blocks.get(i)];
      }
    }

    return relativeDistanceBlocks / blocks.size();
  }

  /**
   * Method to calculate the shortest path from an origin to a destination using two matrices to store the distances and information to calculate the path.
   * That blocked node is considered as a valid node for a path. We are only interested in the distance.
   * @param src is the key of the source node.
   * @param dest is the key of the destination node.
   * @param pred so that later we can build the road.
   * @param dist which stores the minimum distance from src to node i.
   * @return True if it found a path, False if it didn't.
   */
  private Boolean BFSmodified2(int src, int dest, Integer pred[], Integer dist[]) {
    for (int i = 1; i < 122; i++) {
        this.visited[i] = false;
        dist[i] = Integer.MAX_VALUE;
        pred[i] = -1;
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.add(src);
    this.visited[src] = true;
    dist[src] = 0;
    
    while (!queue.isEmpty()) {
      int w = queue.poll();
      for (int i = 0; i < board.get(w).segundo().size(); i++) {
        if (visited[board.get(w).segundo().get(i)] == false) {
          visited[board.get(w).segundo().get(i)] = true;
          dist[board.get(w).segundo().get(i)] = dist[w] + 1;
          pred[board.get(w).segundo().get(i)] = w;
          queue.add(board.get(w).segundo().get(i));

          if (board.get(w).segundo().get(i) == dest){
            return true;
          }
        }
      }
    }
  return false;
}

  /**
   * Returns a String representation of the board
   * @return a representation of the board
   */
  public String toString() {
    String aux = "\n";
    int count = 1;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        aux += "[";
      } else {
        aux += "  [";
      }

      for (int j = count; j < board.size(); j++) {
        if (board.get(j).primero() == HexagonValue.CAT) {
          aux += "CAT" + " ,";
        } else if (board.get(j).primero() == HexagonValue.BLOCK) {
          aux += "---" + " ,";
        } else {
          if (1 <= j && j <= 9) {
            aux += "00" + j + " ,";
          } else if (10 <= j && j <= 99) {
            aux += "0" + j + " ,";
          } else {
            aux += j + " ,";
          }
        }

        if (j % 11 == 0) {
          count = j + 1;
          break;
        }
      }
      aux += "]\n";
    }
    return aux;
  }

}
