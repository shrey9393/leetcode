import java.util.*;

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> graph = new HashMap<>();
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.computeIfAbsent(from, k -> new PriorityQueue<>()).add(to);
        }

        List<String> itinerary = new ArrayList<>();
        dfs("JFK", graph, itinerary);
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
}
