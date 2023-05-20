class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        Map<String, Map<String, Double>> edgeMap = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            if (!edgeMap.containsKey(equations.get(i).get(0))) {
                edgeMap.put(equations.get(i).get(0), new HashMap<>());
            }

            edgeMap.get(equations.get(i).get(0)).put(equations.get(i).get(1), values[i]);

            if (!edgeMap.containsKey(equations.get(i).get(1))) {
                edgeMap.put(equations.get(i).get(1), new HashMap<>());
            }

            edgeMap.get(equations.get(i).get(1)).put(equations.get(i).get(0), 1.0 / values[i]);
        }

        double[] ans = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            if (!edgeMap.containsKey(queries.get(i).get(0)) || !edgeMap.containsKey(queries.get(i).get(1))) {
                ans[i] = -1.0;
            } else
                ans[i] = dfs(queries.get(i).get(0), queries.get(i).get(1), edgeMap, new HashSet<>());
        }

        return ans;
    }

    private double dfs(String src, String dest, Map<String, Map<String, Double>> edgeMap, HashSet<String> visited) {

        visited.add(src);
        if (src.equals(dest))
            return 1.0;

        Map<String, Double> cEM = edgeMap.get(src);

        for (String node : cEM.keySet()) {
            if (!visited.contains(node)) {
                double val = dfs(node, dest, edgeMap, visited);
                if (val > 0.0) {
                    return cEM.get(node) * val;
                }
            }
        }

        return -1.0;
    }
}