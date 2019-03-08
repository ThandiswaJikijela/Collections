package ac.za.cput.project2;

import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestCollectionsInterface {
   private CollectionsInterface collection;

    @Before
    public void setUp() throws Exception{
        collection = new CollectionsInterface();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testCollection()
    {
        //testing if the word Set is on the list, and counting how many elements that are in the list
        Collection<String> collections = collection.Collection();

        assertTrue(collections.contains("Set"));
        assertEquals("Number of collections are 4:" , 4,4);
    }
    @Test
    public void testList()
    {
        /*testing if the if ziyanda mapinda exists on the list,
        * and checking if index number 2 has been removed and replaced by another name
        */
        List<String> actors = collection.List();

        assertTrue(actors.contains("Ziyanda Mapinda"));
        assertTrue(actors.contains("Brad Pet"));
    }

    @Test
    public void testSet()
    {
        //testing if the element Fire is on the list, and counting how many elements that are in the list
        Set<String> elements = collection.Set();

        assertTrue(elements.contains("Fire"));
        assertEquals("Number of elements are 4:" , 4,4);
    }

    @Test
    public void testMap()
    {
        // testing how many inputs are in the list
        Map map = collection.Map();

        assertEquals("Map ID",4, 4);
    }
}
