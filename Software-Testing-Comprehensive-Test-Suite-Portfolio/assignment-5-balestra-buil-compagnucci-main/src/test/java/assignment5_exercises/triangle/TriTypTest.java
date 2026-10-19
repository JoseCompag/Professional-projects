package assignment5_exercises.triangle;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TriTypTest {
    
    /*
     * Casos de test que satisfacen el criterio CACC para el predicado: 
     *      Side1 <= 0 || Side2 <= 0 || Side3 <= 0 
     */
    @ParameterizedTest
    @MethodSource("triangleSidesProvider1")
    public void testPredicate1(int side1, int side2, int side3, int expectedResult) {
        assertEquals(TriTyp.triang(side1, side2, side3), expectedResult);
    }

     private static Stream<Arguments> triangleSidesProvider1() {
        return Stream.of(
            Arguments.of(0, 1, 1, 4), // TFF
            Arguments.of(3, 4, 5, 1), // FFF
            Arguments.of(5, -1, 5, 4), // FTF
            Arguments.of(4, 6, 0, 4)); // FFT
    }

    /*
     * Casos de test que satisfacen el criterio CACC para el predicado: 
     *      Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2
     */
    @ParameterizedTest
    @MethodSource("triangleSidesProvider2")
    public void testPredicate2(int side1, int side2, int side3, int expectedResult) {
        assertEquals(TriTyp.triang(side1, side2, side3), expectedResult);
    }

    private static Stream<Arguments> triangleSidesProvider2() {
        return Stream.of(
            // Este caso de test, además, cubre el caso en el que el predicado triOut == 0 evalúa a True
            Arguments.of(3, 4, 8, 4), // TFF       
            // Cubre, además los tres predicados Side1 == Side2, Side1 == Side3 y  Side2 == Side3 cuando evalúan a False.
            Arguments.of(5, 4, 3, 1), // FFF 
            Arguments.of(4, 2, 1, 4), // FTF 
            Arguments.of(2, 4, 1, 4)); // FFT 
    }

    /*
     * Casos de test que satisfacen el criterio CACC para el predicado: 
     *      triOut == 1 && Side1+Side2 > Side3
     */
    @ParameterizedTest
    @MethodSource("triangleSidesProvider3")
    public void testPredicate3(int side1, int side2, int side3, int expectedResult) {
        assertEquals(TriTyp.triang(side1, side2, side3), expectedResult);
    }

    private static Stream<Arguments> triangleSidesProvider3() {
        return Stream.of(
            // Cubre, además el caso en el que el predicado Side1 == Side2 evalúa a True
            Arguments.of(4, 4, 3, 2), // TT     
            // Cubre, además el caso en el que el predicado Side1 == Side3 evalúa a True
            Arguments.of(3, 5, 3, 2), // FT     
            // Cubre, además el caso en el que el predicado triOut == 0 evalúa a False
            Arguments.of(2, 2, 5, 4)); // TF   
    }

    /*
     * Casos de test que satisfacen el criterio CACC para el predicado: 
     *      triOut == 2 && Side1+Side3 > Side2
     */
    @ParameterizedTest
    @MethodSource("triangleSidesProvider4")
    public void testPredicate4(int side1, int side2, int side3, int expectedResult) {
        assertEquals(TriTyp.triang(side1, side2, side3), expectedResult);
    }

    private static Stream<Arguments> triangleSidesProvider4() {
        return Stream.of(
            // Cubre, además el caso en el que el predicado triOut > 3 evalúa a False
            Arguments.of(3, 2, 3, 2), // TT     
            // Cubre, además el caso en el que el predicado Side2 == Side3 evalúa a True
            Arguments.of(1, 4, 4, 2), // FT   
            Arguments.of(9, 19, 9, 4)); // TF
    }

    /*
     * Casos de test que satisfacen el criterio CACC para el predicado: 
     *      triOut == 3 && Side2+Side3 > Side1
     */
    @ParameterizedTest
    @MethodSource("triangleSidesProvider5")
    public void testPredicate5(int side1, int side2, int side3, int expectedResult) {
        assertEquals(TriTyp.triang(side1, side2, side3), expectedResult);
    }

    private static Stream<Arguments> triangleSidesProvider5() {
        return Stream.of(
            Arguments.of(1, 5, 5, 2), // TT     
            Arguments.of(2, 2, 5, 4), // FT 
            Arguments.of(8, 4, 4, 4)); // TF
    }


    /*
     * Casos restantes de test que satisfacen el criterio CACC para el predicado: 
     *      p = triOut > 3
     * más específicamente cuando p = TRUE.
     */
    @ParameterizedTest
    @MethodSource("triangleSidesProvider6")
    public void testPredicate6(int side1, int side2, int side3, int expectedResult) {
        assertEquals(TriTyp.triang(side1, side2, side3), expectedResult);
    }

    private static Stream<Arguments> triangleSidesProvider6() {
        return Stream.of(
            Arguments.of(5, 5, 5, 3)); // T    
    }
}