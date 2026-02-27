package training;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map =new HashMap<>();
        map.put(0, 10);
        map.put(1, 50);
        map.put(2, 40);
        System.out.println(map);
        map.remove(0);
        System.out.println(map);
        System.out.println(map.containsKey(0));
    }
}
