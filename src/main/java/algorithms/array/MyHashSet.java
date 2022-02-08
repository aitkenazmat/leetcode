package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class MyHashSet {


    private List<HashSet> hash;


    public MyHashSet() {
        hash = new LinkedList<>();
    }

    public void add(int key) {
        HashSet hashSet = new HashSet(key, key);
        hash.add(hashSet);
    }

    public void remove(int key) {
        hash.removeIf(h -> h.getKey() == key);
    }

    public boolean contains(int key) {
        for (HashSet h : hash) {
            if (h.getKey() == key ) {
                return true;
            }

        }
        return false;
    }



    static class HashSet {
        private int key;
        private int val;

        public HashSet(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public int getKey() {
            return key;
        }



        public int getHash() {
            return val;
        }
    }

}
