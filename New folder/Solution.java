import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hs = new HashSet<>();
        for (List<String> x : paths) {
            hs.add(x.get(1));
        }
        for (List<String> x : paths) {
            hs.remove(x.get(1));
        }
        return hs.iterator().next();

    }
}