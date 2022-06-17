package lession_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<String, String> boxes = new HashMap<>();

        // Add element into a HashMap
        boxes.put("box1", "Noodle");
        boxes.put("box2", "General documents");
        boxes.put("x", "Secret documents");

        // Get values
        System.out.printf("Box1 value: %s%n", boxes.get("box1"));
        System.out.printf("Box2 value: %s%n", boxes.get("box2"));
        System.out.printf("Box X value: %s%n", boxes.get("x"));

        // Add duplicated key, it will change the value which is tight with that key
        boxes.put("box1", "snack");
        System.out.printf("Box1 value: %s%n", boxes.get("box1"));

        // Replace
        boxes.replace("box1", "Empty");
        System.out.printf("Box1 value: %s%n", boxes.get("box1"));

        // Remove
        boxes.remove("box1");
        System.out.printf("Box1 value: %s%n", boxes.get("box1")); // null

        // Get all keys | boxes.keySet() returns a Set of all keys in HashMap
        for (String label : boxes.keySet()){
            System.out.println(label);
        }

        // Loop all keyset and get corresponding value
        for (String label : boxes.keySet()){
            System.out.printf("%s: %s%n", label, boxes.get(label));
        }

        // Use method: containsKey to checks whether a key is in HashMap or not
        System.out.println(boxes.containsKey("box1")); // false
        System.out.println(boxes.containsKey("box2")); // true
    }
}
