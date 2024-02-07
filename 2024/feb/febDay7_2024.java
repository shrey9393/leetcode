class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()
        );
        Map<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        pq.addAll(hm.entrySet());
        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry= pq.poll();
            res.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return res.toString();
    }
}