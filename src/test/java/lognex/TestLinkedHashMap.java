package lognex;

import org.junit.*;
import java.util.LinkedHashMap;
import java.util.Map;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



public class TestLinkedHashMap {

    @Test
    public void testSize()
    {

        Map<String, Double> linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));

        assertEquals(2, linkedHashMap.size());

    }
    @Test
    public void testGet()
    {

        Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double >();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));
        final Double bundle = linkedHashMap.put("Комплект", new Double(15));

        assertEquals ("Значение не совпадет с ожиданиемым", new Double(11.0), linkedHashMap.get("Товар"));

    }

    @Test
    public void testNotEmpty()
    {

        Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));
        final Double bundle = linkedHashMap.put("Комплект", new Double(0));

        assertFalse ("Значение не совпадет с ожиданиемым", linkedHashMap.isEmpty());

    }

    @Test
    public void testValue()
    {

        Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));
        final Double bundle = linkedHashMap.put("Комплект", new Double(11));

        assertFalse("Значение не совпадет с ожиданиемым", linkedHashMap.containsValue(5555.0));

    }

    @Test
    public void testRemove()
    {

        Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));
        final Double bundle = linkedHashMap.put("Комплект", new Double(11));

        linkedHashMap.remove(11);

        assertFalse ("Значение не совпадет с ожиданиемым", linkedHashMap.containsValue(11));

    }

}