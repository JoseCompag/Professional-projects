package engines;

import java.util.List;

import adversarysearch.EngineAdversary;
import adversarysearch.StateAdversary;
import adversarysearch.StateProblemAdversary;

/**
 * Engine implementing Alpha-Beta Pruning.
 * @param <P> This describes a StateProblemAdversary subtype parameter.
 * @param <S> This describes a StateAdversary subtype parameter.
 */
public class AlphaBetaPruning<P extends StateProblemAdversary<S>, S extends StateAdversary> implements EngineAdversary<P, S> {
  /**
   * Problem representation.
   */
  private P sp;

  /**
   * Indicates the maximum depth used for the search.
   */
  private int maxDepth;

  /**
   * Engine constructor.
   * @param sp problem representation.
   */
  public AlphaBetaPruning(P sp) {
    this.sp = sp;
    this.maxDepth = 1;
  }

  /**
   * Starts the search in order to compute a value for a state. The
   * computation is performed by exploring the game tree corresponding
   * to the problem being analysed, considering state as the root,
   * and with maximum depth maxDepth.
   * @param state is the state for which its value is being computed.
   * @return the value computed for the state.
   * @pre problem!=null and state!=null.
   * @post the value for the state is computed, via a search in the
     game tree for state as the root, and maxDepth as the maximum
     depth.
   */
  public int computeValue(S state) {
    int md = this.maxDepth;
    return computeValue(state, sp.minValue(), sp.maxValue(), md);
  }

  /**
   * @param state is the state for which its value is being computed.
   * @param alpha is the minimum value of the search.
   * @param beta is the maximum value of the search.
   * @param maxDepth maximum depth for the search.
   * @return the value computed for the state.
   */
  public int computeValue(S state, int alpha, int beta, int maxDepth) {
    if (state.end() || maxDepth == 0) {
        return state.value() - maxDepth;
    } else {
      List<S> succs = sp.getSuccessors(state);
      for (S nk : succs) {
        if (alpha >= beta) {
          break;
        }
        if (state.isMax()) {
          alpha = Math.max(alpha, computeValue(nk, alpha, beta, maxDepth - 1));
        } else {
          beta = Math.min(beta, computeValue(nk, alpha, beta, maxDepth - 1));
        }
      }
      if (state.isMax()) {
        return alpha;
      } else {
        return beta;
      }
    }
  }

  /**
   * Starts the search in order to compute a most promising successor
   * for a state. The computation is performed by exploring the game
   * tree corresponding to the problem being analysed, considering
   * state as the root, and with maximum depth maxDepth.
   * @param state is the state for which its most promising successor
    is being computed.
   * @return the most promising successor for state. The method
     ruleApplied() in the result indicates which rule led to the
     state.
   * @pre. problem!=null and state!=null.
   * @post. the most promising successor for the state is computed,
     via a search in the game tree for state as the root, and
     maxDepth as the maximum depth.
   */
  public S computeSuccessor(S state) {
    int x = Integer.MIN_VALUE;
    S nextMax = null;
    int y = Integer.MAX_VALUE;
    S nextMin = null;
    List<S> succs = sp.getSuccessors(state);
    for (S nk : succs) {
        int nkValue = computeValue(nk);
        if (state.isMax()) {
            if (x < nkValue) {
                x = nkValue;
                nextMax = nk;
            }
        } else {
            if (y > nkValue) {
                y = nkValue;
                nextMin = nk;
            }
        }
    }
    if (state.isMax()) {
        return nextMax;
    } else {
        return nextMin;
    }
}

  /**
   * Returns the maximum depth to be used for search. This value
   * indicates how many game moves in the future are going to be
   * explored in order to compute the value for a state.
   * @return the maximum depth to be used for search.
   * @pre. true.
   * @post. the value of maxDepth is returned.
   */
  public int getMaxDepth() {
    return this.maxDepth;
  }

  /**
   * Sets the maximum depth to be used for search. This value
   * indicates how many game moves in the future are going to be
   * explored in order to compute the value for a state.
   * @param md is the value used to set this.maxDepth.
   * @pre. maxDepth >= 1.
   * @post. this.maxDepth is set to maxDepth.
   */
  public void setMaxDepth(int md) {
    this.maxDepth = md;
  }

  /**
   * Returns the problem associated with this search engine.
   * @return a reference to the problem associated with this search engine.
   * @pre. true.
   * @post. this.problem is returned.
   */
  public P getProblem() {
    return this.sp;
  }

  /**
   * Sets the problem associated with the search engine.
   * @param p is the search problem to be used for search (to set 'problem' to).
   * @pre. p!=null.
   * @post. 'problem' is set to p.
   */
  public void setProblem(P p) {
    this.sp = p;
  }

  /**
   * Reports information regarding a previously executed search.
   * @pre. computeSuccessor(s) or computeValue(s) have been
     executed and finished.
   * @post. A report regarding the last performed search is printed
     to standard output.
   */
  public void report() {
    System.out.println("TODO");
  }
}
