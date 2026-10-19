package assignment2_exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Collections;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MinTest {
   
    @ParameterizedTest
    @CsvSource({
        "'[a,b,c]', 'a'",         
        "'[z,y,x,w]', 'w'",       
        "'[pepe,pepa]', 'pepa'",  
        "'[aaa,aaaa]', 'aaa'",    
        "'[Hello,World]', 'Hello'", 
        "'[carrot,car,travel]', 'car'", 
        "'[apple,Apple,APPLE]', 'APPLE'",
        "'[banana,ban,band]', 'ban'", 
    })
    public void positiveTestMinForStrings(String stringList, Comparable expectedResult) {
        List<Comparable> list = StringParser.parseToStringList(stringList);
        Comparable result = Min.min(list);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
        "'[1,2,3,4]', '1'",         
        "'[1,2,3,4,0]', '0'",       
        "'[-1,0,-2,1,-8]', '-8'",  
        "'[-5,-30,-9,-7]', '-30'", 
        "'[100,50,50,100]', '50'", 
        "'[120]', '120'",   
        "'[0]', '0'",              
        "'[-300]', '-300'",    
        "'[2,2,2,2]', '2'",        
        "'[-10,0,10]', '-10'", 
    })
    public void positiveTestMinForInteger(String stringList, int expectedResult) {
        List<Comparable> list = StringParser.parseToStringList(stringList);
        Comparable result = Min.min(list);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
        "'[1.1,1.0,1.2]', '1.0'",         
        "'[0.0,0.10,1.2]', '0.0'",       
        "'[-1.1,1.1,-1.0]', '-1.1'",  
        "'[3.1,2.2,4.4,1.5]', '1.5'",    
        "'[-3.1,-2.2,-4.4,-1.5]', '-4.4'",
        "'[2.2,2.2,2.2,2.2]', '2.2'",     
        "'[0.0]', '0.0'",                 
        "'[0.5,1.0,0.2,0.4]', '0.2'",     
        "'[1.0,2.0,1.5,0.0]', '0.0'",  
        "'[3.1,-1.2,2.2,1.5]', '-1.2'"
    })
    public void positiveTestMinForDouble(String stringList, double expectedResult) {
        List<Comparable> list = StringParser.parseToStringList(stringList);
        Comparable result = Min.min(list);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
        "'null'",
        "'[null]'",
        "'[1,2,null]'",
        "'[null,1,2]'",
        "'[-1,null,2]'",
    })
    public void negativeTestMinWithListsOfNull(String stringList) {
        List<Comparable> list = StringParser.parseToStringList(stringList);

        Exception exceptionThrown = assertThrows(NullPointerException.class, () -> {
            Min.min(list);
        });
    }

    @ParameterizedTest
    @CsvSource({
        "'[hello,1]'",
        "'[apple,1,banana,1.2,-3]'",
        "'[1.0,2.0,3.0,hello]'",
        "'[true,false,1]'",
        "'[-21,-]'",
        "'[1,a,b,18]'",
    })
    public void neativeTestMinWithIncomparableItems(String stringList) {
        List<Comparable> list = StringParser.parseToStringList(stringList);

        Exception exceptionThrown = assertThrows(ClassCastException.class, () -> {
            Min.min(list);
        });
    }

    @Test
    public void negativeTestMinWithEmptyList() {
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, () -> {
            Min.min(Collections.emptyList());
        });
        assertEquals("Min.min", exceptionThrown.getMessage());
    }
}