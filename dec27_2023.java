class Solution {
    public int minCost(String colors, int[] neededTime) {
        Stack<Pair<Character, Integer>> st = new Stack<>();
        int cost = 0;
        for (int i = 0; i < colors.length(); i++) {
            Pair<Character, Integer> pi = new Pair<>(colors.charAt(i), neededTime[i]);
            while (!st.isEmpty() && st.peek().getKey().equals(pi.getKey())) {
                if (st.peek().getValue() < pi.getValue()) {
                    cost += st.peek().getValue();
                    st.pop();
                } else {
                    cost += pi.getValue();  
                    pi = st.peek();
                    st.pop();
                }
            }
            st.push(pi);
        }
        return cost;
    }
}
