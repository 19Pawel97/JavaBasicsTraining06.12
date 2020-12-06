package collection_training;

import java.util.ArrayList;
import java.util.List;

public class List_training {
    public static void trainingList() {
        System.out.println("Lists");
        String name1 = "Paul";
        String name2 = "James";
        String name3 = "Martin";
        List<String> names = new ArrayList<>();
//        List<String> names = new LinkedList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        System.out.println(names.size());
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("Adding one name");
        names.add(name1);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names.size());
    }
}
