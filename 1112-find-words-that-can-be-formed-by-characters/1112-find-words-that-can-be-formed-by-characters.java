class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        
        for (char c : chars.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        
        int count = 0;
        
        for (String word : words) {
            boolean canForm = true;
            HashMap<Character, Integer> wordFrequency = new HashMap<>();
            
            for (char c : word.toCharArray()) {
                wordFrequency.put(c, wordFrequency.getOrDefault(c, 0) + 1);
                
                if (!charFrequency.containsKey(c) || wordFrequency.get(c) > charFrequency.get(c)) {
                    canForm = false;
                    break;
                }
            }
            
            if (canForm) {
                count += word.length();
            }
        }
        
        return count;
    }
}
