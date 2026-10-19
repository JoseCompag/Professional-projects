package trapthecat;

import adversarysearch.StateProblemAdversary;

import java.util.LinkedList;
import java.util.List;

public class TrapTheCatProblem implements StateProblemAdversary<TrapTheCatState> {

  /**
   * {@inheritDoc}
   */
  public TrapTheCatState initialState() {
    return new TrapTheCatState();
  }

  /**
   * {@inheritDoc}
   */
  public List<TrapTheCatState> getSuccessors(TrapTheCatState s) {
    List<TrapTheCatState> result = new LinkedList<>();

    if (s.isMax()) {
      for (int i = 1; i < 122; i++) {
        if (s.getHexagonValue(i) == HexagonValue.FREE) {
          TrapTheCatState state = s.clone();
          state.setHexagonValue(i, HexagonValue.BLOCK);
          result.add(state);
        }
      }

    } else {
      LinkedList<Integer> adjCat = s.adjCatPosition();
      Integer cat = s.positionCat();
      for (int i = 0; i < adjCat.size(); i++) {
        if (s.getHexagonValue(adjCat.get(i)) != HexagonValue.BLOCK) {
          TrapTheCatState boardAux = s.clone();
          boardAux.setHexagonValue(cat, HexagonValue.FREE);
          boardAux.setHexagonValue(adjCat.get(i), HexagonValue.CAT);
          result.add(boardAux);
        }
      }
    }
    return result;
  }

  /**
  * {@inheritDoc}
  */
  public int minValue() {
    return (-100);
  }

  /**
  * {@inheritDoc}
  */
  public int maxValue() {
    return 100;
  }
}
