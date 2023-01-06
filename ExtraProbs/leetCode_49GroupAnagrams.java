import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetCode_49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> l = new ArrayList<>();
        HashMap<String, ArrayList<String>> hs = new HashMap<>();
        for (String st : strs) {
            char charArray[] = st.toCharArray();
            Arrays.sort(charArray);
            String sortedSting = String.valueOf(charArray);
            if(!hs.containsKey(sortedSting))
            {
                hs.put(sortedSting, new ArrayList<>());
            }
            hs.get(sortedSting).add(st);
        }
        return new ArrayList<>(hs.values());
    }

}
