package lognex;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;


public class UnitTest {
    @Test
    public void testAddNull() {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(null);
        list.add(67);
        assertEquals(null, list.get(1));

    }

    @Test
    public void testIndexof() {
        List<Integer> list = new LinkedList<>();

        list.add(2);
        list.add(5);
        list.add(4);

        list.set(1, 12);

        assertEquals(1, list.indexOf(12));


    }

    @Test
    public void testMapSize() {
        Map<String, Integer> putMap = new HashMap<>();
        putMap.put("товар", 111);
        putMap.put("услуга", 222);
        putMap.put("комплект", null);
        assertEquals(3, putMap.size());

    }


    @Test
    public void testMapContvalue() {
        Map<String, Integer> putMap = new HashMap<>();
        putMap.put("товар", 111);
        putMap.put("услуга", 222);
        putMap.put("комплект", null);
        putMap.put("товар", 333);

        assertEquals(false, putMap.containsValue(111));


    }

    @Test
    public void testSet() {
        Set<String> set = new HashSet<>();
        set.add("товар");
        set.add("товар");
        set.add("комплект");
        set.add(null);
        set.add(null);
        assertEquals(3, set.size());

    }

    @Test
    public void testSetEmpty() {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        assertEquals(false, set.isEmpty());

    }
}