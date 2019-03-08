package ac.za.cput.project2;

import java.util.*;

public class CollectionsInterface {
   public Collection<String> Collection()
    {
        Collection<String> collection = new HashSet<>();
        collection.add("List");
        collection.add("Set");
        collection.add("Map");
        collection.add("Queue");

        System.out.println("Collection is:" + collection.size()+"Collection size : "+collection);

        System.out.println("\n");

        return collection;
    }

    public List<String> List()
    {
        List<String> actors = new ArrayList<>();
        //List Interface
        actors.add("Ziyanda Mapinda");
        actors.add("Thandie Jicks");
        actors.add("Luyolo Ndiki");
        actors.add("Sino Ranana");
        actors.add("Jack Braid");
        actors.remove(2);
        actors.set(2, "Brad Pet");

        for (int i = 0; i < actors.size(); i++) {
            System.out.println("List : " + actors.get(i));
        }

        System.out.println("The list does contains : " + actors.contains("Luyolo Ndiki"));
        System.out.println("The list does contains : " + actors.contains("Brad Pet"));

        System.out.println("\n");
        return actors;
    }

    public Set<String> Set()
    {
        //Set Interface
        Set<String> elements = new HashSet<>();
        elements.add("Fire");
        elements.add("Ice");
        elements.add("Air");
        elements.add("Earth");
        elements.add("Fire");// duplicated but doesn't show

        System.out.println("Elements : " +elements);

        System.out.println("Elements are  : " +elements.size());

        System.out.println("\n");
        return elements;
    }


    public Map Map()
    {
        //Map
        Map map = new HashMap();
        map.put(100, "Red");
        map.put(101, "Blue");
        map.put(102, "Pink");
        map.put(103, "Green");

        //Traversing Map
        Set set = map.entrySet();//Converting to Set so that we can traverse
        Iterator itrr = set.iterator();
        while (itrr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itrr.next();
            System.out.println("Map ID: " + entry.getKey() + " Has color : " + entry.getValue());
        }
        return map;
    }
    public static void main(String[] args) {

        CollectionsInterface coll = new CollectionsInterface();
        coll.Collection();
        coll.List();
        coll.Set();
        coll.Map();
    }
}
