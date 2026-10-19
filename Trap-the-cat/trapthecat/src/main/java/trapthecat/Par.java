package trapthecat;

/**
 * Class that represents a tuple with its respective get and set methods.
 * @param <A> generic type
 * @param <B> generic type
 */
public class Par<A, B> {
  /**
   * Attribute A
   */
  private A primero;

  /**
   * Attribute B
   */
  private B segundo;

  /**
   * Default Constructor class.
   * @param primero of type A
   * @param segundo of type B
   */
  public Par(A primero, B segundo) {
    this.primero = primero;
    this.segundo = segundo;
  }

  /**
   * Getter of primero
   * @return element of type A
   */
  public A primero() {
     return primero;
  }

  /**
   * Getter of segundo
   * @return element of type B
   */
  public B segundo() {
    return segundo;
  }

  /**
   * Setter of primero
   * @param primero of type A
   */
  public void primero(A primero) {
   this.primero = primero;
  }

  /**
   * Setter of segundo
   * @param segundo of type B
   */
  public void segundo(B segundo) {
   this.segundo = segundo;
  }
}
