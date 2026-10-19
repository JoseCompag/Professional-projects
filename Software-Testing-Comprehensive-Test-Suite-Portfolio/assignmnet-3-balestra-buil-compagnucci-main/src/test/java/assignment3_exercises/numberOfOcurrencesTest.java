package assignment3_exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Features used to generate tests for the numberOfOccurrences(List<Integer>, Integer) method:
 * - Interface-based approach:
 *   C1: The list is null (true, false).
 *   C2: The list is empty (true, false).
 * - Functionality-based approach:
 *   C3: Number of occurrences of the element in the list (0, 1, >1).
 *   C4: The element is first in the list (true, false).
 *   C5: The element is last in the list (true, false).
 */


class numberOfOcurrencesTest {

  private List<Integer> list = new ArrayList<>();

  @BeforeEach
  void setUp() {
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(0);
  }

  /*
   * Test 1: Interface-based approach for the numberOfOccurrences() method: C1-T, C2-F
   */
  @Test
  public void testNumberOfOcurrences_InterfaceApproach_C1T_C2F() {
    assertThrows(IllegalArgumentException.class, () -> ListUtils.numberOfOcurrences(null,0));
  }

  /*
   * Test 2: Interface-based approach for the numberOfOccurrences() method: C1-F, C2-T
   */
  @Test
  public void testNumberOfOcurrences_InterfaceApproach_C1F_C2T() {
    assertEquals(0, ListUtils.numberOfOcurrences(new ArrayList<Integer>(), 1));
  }

  /*
   * Test 3: Interface-based approach for the numberOfOccurrences() method: C1-F, C2-F
   */
  @Test
  public void testNumberOfOcurrences_InterfaceApproach_C1F_C2F() {
    assertEquals(2, ListUtils.numberOfOcurrences(list, 2));
  }

  /*
   * Test 1: Functionality-based approach for the numberOfOccurrences() method: C3-no occurrences, C4-F, C5-F.
   */
  @Test
  public void testNumberOfOcurrences_FunctionalApproach_C3nc_C4F_C5F(){
    assertEquals(0, ListUtils.numberOfOcurrences(list, 4));
  }

  /*
   * Test 2: Functionality-based approach for the numberOfOccurrences() method: C3-one occurrence, C4-T, C5-F.
   */
  @Test
  public void testNumberOfOcurrences_FunctionalApproach_C3c_C4T_C5F(){
    assertEquals(1, ListUtils.numberOfOcurrences(list, 1));
  }

  /*
   * Test 3: Functionality-based approach for the numberOfOccurrences() method: C3-one occurrence, C4-F, C5-T.
   */
  @Test
  public void testNumberOfOcurrences_FunctionalApproach_C3c_C4F_C5T(){
    assertEquals(1, ListUtils.numberOfOcurrences(list, 0));
  }

  /*
   * Test 4: Functionality-based approach for the numberOfOccurrences() method: C3-more than one occurrence, C4-T, C5-T.
   */
  @Test
  public void testNumberOfOcurrences_FunctionalApproach_C3cm1_C4T_C5T(){
    list.add(1);
    assertEquals(2, ListUtils.numberOfOcurrences(list, 1));
  }

  /*
   * Test 5: Functionality-based approach for the numberOfOccurrences() method: C3-more than one occurrence, C4-F, C5-T.
   */
  @Test
  public void testNumberOfOcurrences_FunctionalApproach_C3cm1_C4F_C5T(){
    assertEquals(3, ListUtils.numberOfOcurrences(list, 3));
  }

}
