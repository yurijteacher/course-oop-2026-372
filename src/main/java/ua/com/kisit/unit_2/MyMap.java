package ua.com.kisit.unit_2;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    static void main() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "C++");
        map.put(2, "Java");

        System.out.println(map.get(1));
        map.remove(1);

        System.out.println(map);

        for (Map.Entry<Integer, String> el : map.entrySet()){
            System.out.println(el.getKey() + ",  " + el.getValue());
        }


    }

}
