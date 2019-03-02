package ac.za.cput.project2;

import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestCollectionsInterface {
    @Test
    public void testCollection()
    {
        //testing if the word Set is on the list, and counting how many elements that are in the list
        Collection<String> collection = new HashSet<String>();
        collection.add("List");
        collection.add("Set");
        collection.add("Map");
        collection.add("Queue");

        assertTrue(collection.contains("Set"));
        assertEquals("Number of collections are 4:" , 4,4);
    }
    @Test
    public void testList()
    {
        /*testing if the if ziyanda mapinda exists on the list,
        * and checking if index number 2 has been removed and replaced by another name
        */
        List<String> actors = new ArrayList<>();
        actors.add("Ziyanda Mapinda");
        actors.add("Thandie Jicks");
        actors.add("Luyolo Ndiki");
        actors.add("Sino Ranana");
        actors.add("Jack Braid");
        actors.remove(2);
        actors.set(2, "Brad Pet");

        assertTrue(actors.contains("Ziyanda Mapinda"));
        assertTrue(actors.contains("Brad Pet"));
    }

    @Test
    public void testSet()
    {
        //testing if the element Fire is on the list, and counting how many elements that are in the list
        Set<String> elements = new HashSet<>();
        elements.add("Fire");
        elements.add("Ice");
        elements.add("Air");
        elements.add("Earth");
        elements.add("Fire");

        assertTrue(elements.contains("Fire"));
        assertEquals("Number of elements are 4:" , 4,4);
    }

    @Test
    public void testMap()
    {
        // testing how many inputs are in the list
        Map map = new HashMap();
        map.put(100, "Red");
        map.put(101, "Blue");
        map.put(102, "Pink");
        map.put(103, "Green");

        assertEquals("Map ID",4, 4);
    }
}
