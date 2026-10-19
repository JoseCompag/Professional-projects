package assignment7_exercises.point;

import net.jqwik.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Property(tries = 1000, generation = GenerationMode.RANDOMIZED)
    void testDistanceTo(@ForAll("pointsGenerator") List<Point> points){
        Point p1 = points.get(0);
        Point p2 = points.get(1);

        Assume.that(p1.getY() == p2.getY());

        double distance = Math.abs(p1.getX()-p2.getX());

        assertEquals(distance, p1.distanceTo(p2),"Distance between points differ");
    }

    @Property(tries = 1000, generation = GenerationMode.RANDOMIZED)
    void testRelationEqualsAndHashcode(@ForAll("pointGenerator") Point p) {

        Point other = new Point(p.getX(), p.getY());

        Assume.that(p.equals(other));

        assertEquals(p.hashCode(), other.hashCode(), "Equality between points differ");

    }

    @Provide
    private Arbitrary<Point> pointGenerator() {
        return Arbitraries.create(this::generatePoint);
    }

    private Point generatePoint() {
        Point p = new Point();
        p.setX(Arbitraries.floats().between(0,10).sample());
        p.setY(Arbitraries.floats().between(0,10).sample());

        return p;
    }

    @Provide
    private Arbitrary<List<Point>> pointsGenerator() {
        return Arbitraries.create(this::generatePairOfPoints);
    }

    private List<Point> generatePairOfPoints() {
        Point p1 = new Point();
        Point p2 = new Point();
        List<Point> points = new ArrayList<Point>();

        float commonValueY = Arbitraries.floats().between(0,10).sample();

        p1.setX(Arbitraries.floats().between(0,10).sample());
        p2.setX(Arbitraries.floats().between(0,10).sample());

        p1.setY(commonValueY);
        p2.setY(commonValueY);

        points.add(p1);
        points.add(p2);

        return points;
    }
}
