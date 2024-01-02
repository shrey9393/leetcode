class OrderedStream {
    List<String> arr;
    int ptr; // To keep track of the last inserted index
    
    public OrderedStream(int n) {
        arr = new ArrayList<>(Collections.nCopies(n, null)); // Initialize with n null values
        ptr = 0;
    }

    public List<String> insert(int idKey, String value) {
        arr.set(idKey - 1, value); // Replace the value at the specified index
        List<String> result = new ArrayList<>();
        while (ptr < arr.size() && arr.get(ptr) != null) {
            result.add(arr.get(ptr));
            ptr++;
        }
        return result;
    }
}
