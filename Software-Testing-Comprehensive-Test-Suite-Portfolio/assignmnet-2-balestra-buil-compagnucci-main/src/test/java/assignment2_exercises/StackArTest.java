package assignment2_exercises;

import assignment2_exercises.stack.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StackArTest {

  private StackAr stack;

  @BeforeEach
  public void setUp() {
    stack = new StackAr();

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
  }

  @Test
  public void testIsEmpty() {
    //arrange
    //act
    //assert
    assertFalse(stack.isEmpty());
  }

  @Test
  public void testIsFull() {
    //arrange
    //act
    //assert
    assertFalse(stack.isFull());
  }

  @Test
  public void testSize() {
    //arrange
    //act
    //assert
    assertEquals(stack.size(),5);
  }

  @Test
  public void testMakeEmpty(){
    //arrange
    //act
    stack.makeEmpty();
    //assert
    assertAll("",
      () -> assertTrue(stack.repOk()),
      () -> assertEquals(stack.size(),0)
    );
  }

  @Test
  public void testTop(){
    //arrange
    Object res;
    //act
    res = stack.top();
    //assert
    assertEquals(res, 50);
  }

  @Test
  public void testPush() {
    //arrange
    Object newValue = 60;
    //act
    stack.push(newValue);
    //assert
    assertAll("",
      () -> assertTrue(stack.repOk()),
      () -> assertEquals(stack.size(),6),
      () -> assertEquals(stack.top(),60)
      );
  }

  @Test
  public void testPop() {
    //arrange
    Object res;
    //act
    res = stack.pop();
    //assert
    assertAll("",
      () -> assertTrue(stack.repOk()),
      () -> assertEquals(res, 50)
      );
  }

  @Test
  public void testRepOk(){
    //arrange
    //act
    //assert
    assertTrue(stack.repOk());
  }

  @Test
  public void testEquals(){
    //arrange
    StackAr stackAux = new StackAr();
    //act
    stackAux.push(10);
    stackAux.push(20);
    stackAux.push(30);
    stackAux.push(40);
    stackAux.push(50);

    //assert
    assertTrue(stack.equals(stackAux));

  }

  @Test
  public void testHascode(){
    //arrange
    StackAr stackAux = new StackAr();
    //act
    stackAux.push(10);
    stackAux.push(20);
    stackAux.push(30);
    stackAux.push(40);
    stackAux.push(50);
    //assert
    assertEquals(stack.hashCode(), stackAux.hashCode());
  }

  @Test
  public void testToString(){
    //act
    StackAr stackAux = new StackAr();
    //arrange
    stackAux.push(10);
    stackAux.push(20);
    stackAux.push(30);
    stackAux.push(40);
    stackAux.push(50);
    //assert
    assertEquals(stack.toString(), stackAux.toString());
  }

  @Test
  public void testTopEmptys(){
    //arrange
    //act
    stack.makeEmpty();
    //assert
    assertThrows(IllegalStateException.class, () -> stack.top());
  }

  @Test
  public void testPopEmpty(){
    //arrange
    //act
    stack.makeEmpty();
    //assert
    assertThrows(IllegalStateException.class, () -> stack.pop());
  }

  @Test
  public void testPushNull(){
    //arrange
    //act
    //assert
    assertThrows(IllegalArgumentException.class, () -> stack.push(null));
  }
}
