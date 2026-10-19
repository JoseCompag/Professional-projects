package trapthecat;

import java.util.LinkedList;

import adversarysearch.StateAdversary;

public class TrapTheCatState implements StateAdversary {

  /**
   * representation of the ScreenBoard.
   */
  private ScreenBoard screenBoard;

  /**
   * {@inheritDoc}
   */
  private TrapTheCatState parent = null;

  /**
   * Boolean representation of the player
   */
  private boolean isMax;

  /**
   * Default Constructor class.
   */
  public TrapTheCatState() {
    this.screenBoard = new ScreenBoard();
    this.isMax = true;
  }

  /**
   * Constructor class with parameters.
   * @param screenBoard Game board
   * @param isMax Boolean value of current player state
   */
  public TrapTheCatState(ScreenBoard screenBoard, boolean isMax) {
    this.screenBoard = screenBoard;
    this.isMax = isMax;
  }

  /**
   * Indicates whether the current state is a max state or not.
   * If the current state is not a 'max' state, then it is assumed
   * to be a min state.
   * @return true iff 'this' is a max state.
   * @pre. true.
   * @post. true is returned iff 'this' is a max state.
   */
  public boolean isMax() {
    return isMax;
  }

  /**
   * {@inheritDoc}
   */
  public StateAdversary getParent() {
    return this.parent;
  }

  /**
   * Indicates whether this state is an end state, i.e., a
   * state with no successors.
   * @return true iff state is an end state.
   * @pre. this!=null.
   * @post. true is returned iff this is an end state.
   */
  public boolean end() {
    Integer cat = screenBoard.positionCat();
    LinkedList<Integer> borders = screenBoard.getEdges();
    for (int i = 0; i < borders.size(); i++) {
      if (borders.get(i) == cat) {
        return true;
      }
    }

    LinkedList<Integer> adjacentsCat = screenBoard.getAdjacents(cat);
    for (int i = 0; i < adjacentsCat.size(); i++) {
      if (getHexagonValue(adjacentsCat.get(i)) == HexagonValue.FREE) {
        return false;
      }
    }
    return true;
  }

  /**
   * Computes the value of this  state. If the state is a leaf
   * (end state), then this value is an exact value, and indicates
   * the outcome of the game. If the state is not an end state, then
   * this value is an approximate value. This value must
   * be greater than minValue(), and smaller than maxValue().
   * @return an integer value, representing the value of the state.
   * @pre. this!=null.
   * @post. an integer value, representing the value of the state.
   */
  public int value() {
    if (isMax) {
      int value = (screenBoard.distanceBlocks() * (-1)) + screenBoard.shortestPathCatToEdge();
      return value;
    } else {
      return screenBoard.shortestPathCatToEdge();
    }
  }

  /**
   * mark hexagon in the specified Screen position, according to the player's turn.
   * players turn = block | cat turn = cat
   * @param hexagonNumber  position.
   * @param value  to set in hexagon position.
   */
  public void setHexagonValue(int hexagonNumber, HexagonValue value) {
    screenBoard.setPositionBoard(hexagonNumber, value);
  }

  /**
   * Set player's turn.
   * @param maxTurn indicate player turn to set.
   */
  public void setMax(boolean maxTurn) {
    this.isMax = maxTurn;
  }

  /**
   * Creates and returns a copy of this State.
   * @return a copy of this State.
   */
  public TrapTheCatState clone() {
    ScreenBoard aux = this.screenBoard.clone();
    return new TrapTheCatState(aux, this.isMax);
  }

  /**
   * Returns the content of a specific hexagon.
   * @param hexagonNumber  position.
   * @return the content of a specific hexagon.
   */
  public HexagonValue getHexagonValue(int hexagonNumber) {
    return screenBoard.getPositionBoard(hexagonNumber);
  }

  /**
   * Returns an object representing the rule applied, leading to the
   * current state.
   * @return an object representing the rule applied, leading to the
     current state. If the state is the initial state, then null is
     returned.
   * @pre. true.
   * @post. An object representing the rule applied, leading to the
     current state, is returned. If the state is the initial state,
     then null is returned.
   */
  public Object ruleApplied() {
    return null;
  }

  /**
   * Produces string representation of the state.
   * prints Screen from this State, and additional relevant infor mation.
   * @return a string representing the current State.
     For instance, a screenBoard with only two occupied hexagon:
     hexagon number 1 = blocked and hexagon number 13 = the cat
     should be something like this:
     [XXX,002,003,004,005,006,007,008,009,010,011]
       [012, C ,014,015,016,017,018,019,020,021,022]
     [023,024,025,026,027,028,029,030,031,032,033]
       [034,035,036,037,038,039,040,041,042,043,044]
     [045,046,047,048,049,050,051,052,053,054,055]
       [056,057,058,059,060,061,062,063,064,065,066]
     [067,068,069,070,071,072,073,074,075,076,077]
       [078,079,080,081,082,083,084,085,086,087,088]
     [089,090,091,092,093,094,095,096,097,098,099]
       [100,101,102,103,104,105,106,107,108,109,110]
     [111,112,113,114,115,116,117,118,119,120,121]
*/
  @Override
  public String toString() {
    return screenBoard.toString();
  }

  /**
   * Method that is responsible for  granting me the position of the cat in the current state.
   * @return an integer indicating the position of the cat in the current state.
   */
  public Integer positionCat() {
    return screenBoard.positionCat();
  }

  /**
   * Produces a list of adjacent nodes with respect to the position of the node where the cat is located.
   * @return a list with the nodes adjacent to the position of the cat
   */
  public LinkedList<Integer> adjCatPosition() {
    LinkedList<Integer> adjCatPosition = screenBoard.getAdjacents(screenBoard.positionCat());
    return adjCatPosition;
  }
}
