class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        String[] segmentArray = s.split("\\s+");
        return segmentArray.length;
    }
}
