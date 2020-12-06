package collection_training;

import java.util.HashSet;
import java.util.Set;

public class SetTraining {
    public static void trainSet() {
        String name1 = "Sara";
        String name2 = "Susan";
        String name3 = "Lucy";
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add(name1);
        uniqueNames.add(name2);
        uniqueNames.add(name3);
        System.out.println(uniqueNames.size());
        for (String uniqueName: uniqueNames) {
            System.out.println(uniqueName);
        }
        System.out.println("Adding one name");
        uniqueNames.add(name1);
        for (String uniqueName: uniqueNames) {
            System.out.println(uniqueName);
        }
        System.out.println(uniqueNames.size());


    }
}
