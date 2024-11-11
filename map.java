import java.util.Map;
import java.util.HashMap;

public class map {
    public Map<Integer, String> addElement(Map<Integer, String> map) {
        map.put(1, "One");
        map.put(2, "Two");
        map.put(34, "Thirty Four");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(70, "Seventy");
        map.put(8, "Eight");
        map.put(99, "Ninety Nine");
        map.put(100, "Hundred");

        return map;
    }
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        map obj = new map();
        m = obj.addElement(m);

        System.out.println("Keys: " + m.keySet());
        System.out.println("Values: " + m.values());

        for (int k: m.keySet()) {
            System.out.println("Key: " + k + ", Value: " + m.get(k));
        }

        System.out.println("Map of 1: " + m.get(1));
        System.out.println("Map: " + m);
    }


}
