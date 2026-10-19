package assignment2_exercises.queue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BoundedQueueTest {
    static Random random;

    @BeforeAll
    static void setUp() {
        random = new Random(42);
    }

    @ParameterizedTest
    @MethodSource("randomQueueProvider")
    void testQueueRepInvariant(BoundedQueue queue) {
        assertTrue(queue.repOK(), "Queue without applying operations to it, should satisfy the invariant");
    }

    @ParameterizedTest
    @MethodSource("randomQueueProvider")
    void testQueueRepInvariantAfterEnQueue(BoundedQueue queue) {
        queue.enQueue(random.nextInt());
        assertTrue(queue.repOK(), "Queue should satisfy the invariant after enQueue operation");
    }

    @ParameterizedTest
    @MethodSource("randomFullQueueProvider")
    void testQueueRepInvariantAfterDeQueue(BoundedQueue queue) {
        queue.deQueue();

        assertTrue(queue.repOK(), "Queue should satisfy the invariant after deQueue operation");
    }

    @ParameterizedTest
    @MethodSource("randomQueueProvider")
    void enQueueThrowsExceptionWhenNull(BoundedQueue queue) {
        assertThrows(NullPointerException.class, () -> queue.enQueue(null), "Queue should throw NullPointerException when enQueue is called with null");
    }

    @ParameterizedTest
    @MethodSource("randomFullQueueProvider")
    void enQueueThrowsExceptionWhenQueueIsFull(BoundedQueue queue) {
        assertThrows(IllegalStateException.class, () -> queue.enQueue(random.nextInt()), "Queue should throw IllegalStateException when enQueue is called on a full queue");
    }

    @Test
    void deQueueThrowsExceptionWhenQueueIsEmpty() {
        BoundedQueue emptyQueue = new BoundedQueue(1);
        assertThrows(IllegalStateException.class, () -> emptyQueue.deQueue(), "Queue should throw IllegalStateException when deQueue is called on an empty queue");
    }

    @Test
    void isEmptyReturnsTrueWhenQueueIsEmpty() {
        BoundedQueue emptyQueue = new BoundedQueue(1);
        assertTrue(emptyQueue.isEmpty(), "Queue should be empty when no elements are enqueued");
    }

    @ParameterizedTest
    @MethodSource("randomFullQueueProvider")
    void isFullReturnsTrueWhenQueueIsFull(BoundedQueue fullQueue) {
        assertTrue(fullQueue.isFull(), "Queue should be full when all elements are enqueued");
    }

    static Stream<BoundedQueue> randomQueueProvider() {
        return Stream.generate(() -> createQueueWithRandomElements(random.nextInt(10) + 1, false)).limit(10);
    }

    static Stream<BoundedQueue> randomFullQueueProvider() {
        return Stream.generate(() -> createQueueWithRandomElements(random.nextInt(10) + 1, true)).limit(10);
    }

    static BoundedQueue createQueueWithRandomElements(int numElements, boolean isFull) {
        BoundedQueue queue = new BoundedQueue(numElements);
        int limit = isFull ? numElements : numElements - 1;
        for (int i = 0; i < limit; i++) {
            int randomNumber = random.nextInt();
            queue.enQueue(randomNumber);
        }
        return queue;
    }
}