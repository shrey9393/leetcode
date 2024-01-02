import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
    int cap;
    LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
    public LRUCache(int capacity) {
        cap = capacity;
    }
    public int get(int key) {
        if (hm.containsKey(key)) {
            int value = hm.get(key);
            hm.remove(key);
            hm.put(key, value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (hm.containsKey(key)) {
            hm.remove(key);
        } else if (hm.size() >= cap) {
            Map.Entry<Integer, Integer> firstEntry = hm.entrySet().iterator().next();
            hm.remove(firstEntry.getKey());
        }
        hm.put(key, value);
    }
}
