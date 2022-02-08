package algorithms.hashmap;

import java.util.LinkedList;
import java.util.List;

public class MyHashMap {

    private List<CustomHashMap> map;

    public MyHashMap() {
        map = new LinkedList<>();
    }

    public void put(int key, int value) {
        CustomHashMap customHashMap = new CustomHashMap(key, value);

        CustomHashMap search = search(key);
        if (search !=null && search.getKey() == key) {
            map.remove(search);
            map.add(customHashMap);
        } else {
            map.add(customHashMap);
        }
    }

    public int get(int key) {
        CustomHashMap search = search(key);
        if (search != null) {
            return search.getValue();
        } else {
            return -1;
        }
    }

    public void remove(int key) {
        CustomHashMap search = search(key);
        if (search!=null) {
            map.remove(search);
        }
    }

    private CustomHashMap search(int key) {
        for (CustomHashMap customHashMap :  map) {
            if (customHashMap.getKey() == key) {
                return customHashMap;
            }
        }

        return null;
    }


}
