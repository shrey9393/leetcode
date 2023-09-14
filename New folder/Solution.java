import java.util.*;

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        // Create a map to store the graph of airports and their destinations
        HashMap<String, PriorityQueue<String>> graph = new HashMap<>();

        // Build the graph
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.computeIfAbsent(from, k -> new PriorityQueue<>()).add(to);
        }

        List<String> itinerary = new ArrayList<>();
        dfs("JFK", graph, itinerary);

        // Reverse the result since we start from JFK
        Collections.reverse(itinerary);
        return itinerary;
    }

    private void dfs(String airport, HashMap<String, PriorityQueue<String>> graph, List<String> itinerary) {
        PriorityQueue<String> destinations = graph.get(airport);
        while (destinations != null && !destinations.isEmpty()) {
            String nextAirport = destinations.poll();
            dfs(nextAirport, graph, itinerary);
        }
        itinerary.add(airport);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));

        List<String> itinerary = solution.findItinerary(tickets);
        System.out.println(itinerary);
    }
}
