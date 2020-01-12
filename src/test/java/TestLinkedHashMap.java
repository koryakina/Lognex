import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;


@SuppressWarnings("deprecation")
public class TestLinkedHashMap {

    @Test
    public void testSelenium1()
    {

        Map<String, Double> linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));

        assertEquals(2, linkedHashMap.size());

    }
    @Test
    public void testSelenium2()
    {

        Map<String, Double> linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));
        final Double bundle = linkedHashMap.put("Комплект", new Double(15));

        assertEquals("Значение не совпадет с ожиданиемым", 11.0, linkedHashMap.get("Товар"));

    }

    @Test
    public void testSelenium3()
    {

        Map<String, Double> linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));
        final Double bundle = linkedHashMap.put("Комплект", new Double(0));

        assertEquals("Значение не совпадет с ожиданиемым", false,  linkedHashMap.isEmpty());

    }

    @Test
    public void testSelenium4()
    {

        Map<String, Double> linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));
        final Double bundle = linkedHashMap.put("Комплект", new Double(11));

        assertEquals("Значение не совпадет с ожиданиемым", false,  linkedHashMap.containsValue(5555.0));

    }

    @Test
    public void testSelenium5()
    {

        Map<String, Double> linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, Double>();
        final Double product = linkedHashMap.put("Товар", new Double(11));
        final Double service = linkedHashMap.put("Услуга", new Double(15));
        final Double bundle = linkedHashMap.put("Комплект", new Double(11));

        linkedHashMap.remove(11);

        assertEquals("Значение не совпадет с ожиданиемым", false,  linkedHashMap.containsValue(11));

    }

}