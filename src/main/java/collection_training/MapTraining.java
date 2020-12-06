package collection_training;

import java.util.HashMap;
import java.util.Map;

public class MapTraining {
    public static void trainMap() {
        System.out.println("Maps");
        String name1 = "Asia";
        String name2 = "Kasia";
        String name3 = "Basia";
        String name4 = "Julka";
        Map<Integer, String> names = new HashMap<>();
        names.put(1, name1);
        names.put(2, name2);
        names.put(3, name3);
        System.out.println(names.size());
        printMap(names);
        System.out.println("Changing the first name");
        names.put(1, name4);
        System.out.println(names.size());
        printMap(names);
    }
    public static void printMap(Map<Integer, String> names) {
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
