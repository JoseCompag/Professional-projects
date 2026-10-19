package assignment3_exercises;

import java.util.List;
import java.util.Collections;
import java.util.NoSuchElementException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

/**
 * Characteristics used to generate tests for the methods hasNext(), next() and remove():
 * C1: iterator has more values. 
 * C2: iterator returns a non-null object. 
 * C3: remove() is supported.
 * C4: remove() precondition is satisfied.
 */

public class IteratorTest<T> {
 
    private List<Integer> list;        
    private Iterator<Integer> iterator;      

    @Before
    public void setUp() {
        list = new ArrayList<Integer>();
        list.add(9);
        list.add(null);
        iterator = list.iterator();
    }

    /*
     * Test 1 for method hasNext(): C1-T
     */
    @Test
    public void testHasNext_C1T() {
        assertTrue(iterator.hasNext());
    }

    /*
     * Test 2 for method hasNext(): C1-F
     */
    @Test
    public void testHasNext_C1F() {
        iterator.next();
        iterator.next();
        assertFalse(iterator.hasNext());
    }

    /*
     * Test 1 for method next(): C1-T, C2-T
     */
    @Test
    public void testNext_C1T_C2T() {
        assertNotEquals(iterator.next(), null);
    }

    /*
     * Test 2 for method next(): C1-T, C2-F
     */
    @Test
    public void testNext_C1T_C2F() {
        iterator.next();
        assertTrue(iterator.next() == null);
    }

    /*
     * Test 3 for method next(): C1-F, C2-F
     * C2 is false, meaning iterator doesn't return a not null object.
     * This doesn't necessarily mean that iterator has to return a null object. 
     */
    @Test
    public void testNext_C1F_C2F() {
        iterator.next();
        iterator.next();
        Exception exceptionThrown = assertThrows(NoSuchElementException.class, () -> {
            iterator.next();
        });
    }

    /*
     * Test 1 for method remove(): C1-T, C3-T, C4-T
     * The element should be removed correctly!
     */
    @Test
    public void testRemove_C1T_C3T_C4T() {
        iterator.next();
        iterator.remove();
        assertTrue(!list.contains(9));
    }

    /*
     * Test 2 for method remove(): C1-T, C3-F, C4-F
     */
    @Test
    public void testRemove_C1T_C3F_C4F() {
        list = Collections.unmodifiableList(list);
        iterator = list.iterator();
        Exception exceptionThrown = assertThrows(UnsupportedOperationException.class, () -> {
            iterator.remove();
        });
    }

    /*
     * Test 3 for method remove(): C1-T, C3-T, C4-F
     */
    @Test
    public void testRemove_C1T_C3T_C4F() {
        Exception exceptionThrown = assertThrows(IllegalStateException.class, () -> {
            iterator.remove();
        });
    }

    /* 
     * Test 4 for method remove(): C1-F, C3-T, C4-T
     */
    @Test
    public void testRemove_C1F_C3T_C4T() {
        iterator.next();
        iterator.next();
        assertDoesNotThrow(() -> iterator.remove());
    }

    /*
     * Test 5 for method remove(): C1-F, C3-T, C4-F
     */
    @Test
    public void testRemove_C1F_C3T_C4F() {
        iterator.next();
        iterator.next();   
        iterator.remove();
        Exception exceptionThrown = assertThrows(IllegalStateException.class, () -> {
            iterator.remove();
        });
    }
}