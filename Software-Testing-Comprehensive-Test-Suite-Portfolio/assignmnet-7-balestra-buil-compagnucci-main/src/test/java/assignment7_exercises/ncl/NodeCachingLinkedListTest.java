package assignment7_exercises.ncl;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;

import org.junit.Test;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Assume;
import net.jqwik.api.ForAll;
import net.jqwik.api.GenerationMode;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.constraints.IntRange;

public class NodeCachingLinkedListTest {
    
    /**
     * Propiedad 1: Luego de remover un elemento de la lista se incrementa en 1 el tamaño de la lista cache.
     */ // TODO: esta bien el assume ese?
    @Property(tries = 1000, generation = GenerationMode.RANDOMIZED)
    public void cacheSizeIncreasesAfterRemoval(@ForAll("nclGenerator") NodeCachingLinkedList list) {
        Assume.that(list.getSize() > 0 && list.getCacheSize() < list.DEFAULT_MAXIMUM_CACHE_SIZE);

        int oldCacheSize = list.getCacheSize();
        list.removeIndex(0);            

        assertEquals(oldCacheSize + 1, list.getCacheSize(), "Cache size should increase by 1 after removal.");
    }

    @Test
    public void cacheSizeIncreasesAfterRemoval2() {
        NodeCachingLinkedList list = new NodeCachingLinkedList();
        list.addFirst(46);
        list.addFirst(9);
        list.addFirst(7);
        list.addFirst(4);
        list.addFirst(22);
        list.addFirst(49);
        list.addFirst(5);

        System.out.println(list);

        int oldCacheSize = list.getCacheSize();
        list.removeIndex(0);            

        assertEquals(oldCacheSize + 1, list.getCacheSize(), "Cache size should increase by 1 after removal.");
    }

    /**
     * Propiedad 2: Si la cache de una NCL no está vacía entonces luego de agregar un elemento, la
     * suma de los nodos de la lista principal y los nodos de la lista Cache de una NCL
     * no cambia.
     */
    @Property(tries = 1000)
    public void totalNodesUnchangedAfterAdding(@ForAll("nclGenerator") NodeCachingLinkedList list,
                                               @ForAll @IntRange(min = 0, max = 1000) int element) {
        Assume.that(list.getCacheSize() > 0);

        int oldCacheSize = list.getCacheSize();
        int oldListSize = list.getSize();
        list.addFirst(element);        
        
        assertEquals(oldCacheSize + oldListSize, list.getCacheSize() + list.getSize(),  "Total nodes in list and cache should remain unchanged.");
    }

    /**
     * Propiedad 3: Eliminar un elemento a la lista me mantiene el invariante de representación.
     */
    @Property(tries = 1000, generation = GenerationMode.RANDOMIZED)
    public void nodeCachingLinkedListIsValid(@ForAll("nclGenerator") NodeCachingLinkedList list) {
        Assume.that(list.getSize() > 0);

        list.removeIndex(0);
        assertTrue(list.repOK());
    }

    @Provide
    private Arbitrary<NodeCachingLinkedList> nclGenerator() {
        return Arbitraries.create(()->generateNCL(30));
    }

    private static NodeCachingLinkedList generateNCL(int maxSize) {
        NodeCachingLinkedList list = new NodeCachingLinkedList();
        Random r = new Random();
        int numberOfElementsToAdd = r.nextInt(maxSize);
        int numberOfElementsToRemove = 0;

        if (numberOfElementsToAdd > 1) {
            numberOfElementsToRemove = r.nextInt(numberOfElementsToAdd - 1);
        } 

        for (int i = 0; i < numberOfElementsToAdd; i++) {
            list.addFirst(r.nextInt(50));
        }

        for (int i = 0; i < numberOfElementsToRemove; i++) {
            list.removeIndex(0);
        }
        return list;
    }
}