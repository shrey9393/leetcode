class Solution {
    public int shortestPathAllKeys(String[] grid) {
        int m = grid.length, n = grid[0].length();
        Queue<int[]> qList = new LinkedList<>();
        int[][] mv = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        
        Map<Integer, Set<Pair<Integer, Integer>>> visited = new HashMap<>();
        
        Set<Character> keySet = new HashSet<>();
        Set<Character> lockSet = new HashSet<>();
        int aKeys = 0;
        int startR = -1, startC = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char cell = grid[i].charAt(j);
                if (cell >= 'a' && cell <= 'f') {
                    aKeys += (1 << (cell - 'a'));
                    keySet.add(cell);
                }
                if (cell >= 'A' && cell <= 'F') {
                    lockSet.add(cell);
                }
                if (cell == '@') {
                    startR = i;
                    startC = j;
                }
            }
        }

        qList.offer(new int[] {startR, startC, 0, 0});
        visited.put(0, new HashSet<>());
        visited.get(0).add(new Pair<>(startR, startC));    
        
        while (!qList.isEmpty()) {
            int[] cur = qList.poll();
            int curR = cur[0], curC = cur[1], keys = cur[2], dist = cur[3];
            for (int[] move : mv) {
                int newR = curR + move[0], newC = curC + move[1];
                
                if (newR >= 0 && newR < m && newC >= 0 && newC < n && grid[newR].charAt(newC) != '#') {
                    char cell = grid[newR].charAt(newC);
                    
                    if (keySet.contains(cell)) {
                        if (((1 << (cell - 'a')) & keys) != 0) {
                            continue;
                        }
                        
                        int newKeys = (keys | (1 << (cell - 'a')));
                        
                        if (newKeys == aKeys) {
                            return dist + 1;
                        }
                        visited.putIfAbsent(newKeys, new HashSet<>());
                        visited.get(newKeys).add(new Pair<>(newR, newC));
                        qList.offer(new int[] {newR, newC, newKeys, dist + 1});
                    }
                    
                     if (lockSet.contains(cell) && ((keys & (1 << (cell - 'A'))) == 0)) {
                        continue;
                    }
                   
                    else if (!visited.get(keys).contains(new Pair<>(newR, newC))) {
                        visited.get(keys).add(new Pair<>(newR, newC));
                        qList.offer(new int[] {newR, newC, keys, dist + 1});
                    }
                }
            }
        }
        
        return -1;
    }
}