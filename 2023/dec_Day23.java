class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<Pair> set = new HashSet<>();
        set.add(new Pair(x, y));
        for(char s : path.toCharArray()) {
            if(s == 'N') y++;
            if(s == 'S') y--;
            if(s == 'E') x++;
            if(s == 'W') x--;
            Pair p = new Pair(x, y);
            if(set.contains(p)) return true;
            set.add(p);
        }
        return false;
    }
}