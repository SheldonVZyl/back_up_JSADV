package lesson7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("H001", "Duke Hat");
        System.out.println(partList);

        partList.put("S002", "Black T-Shirt");
        Set<String> keys = partList.keySet();
        System.out.println(partList);

        System.out.println("===Part List===");
        for (String key : keys) {
            System.out.println("Part#: " + key + " " + partList.get(key));
        }
    }
}
