public class NestedIterator {
    private List<Integer> flattened;
    private int index;
    private List<Integer> flatten(List<NestedInteger> nested) {
        List<Integer> result = new ArrayList<>();
        for (NestedInteger ni : nested) {
            if (ni.isInteger()) {
                result.add(ni.getInteger());
            } else {
                result.addAll(flatten(ni.getList()));
            }
        }
        return result;
    }

    public NestedIterator(List<NestedInteger> nestedList) {
        flattened = new ArrayList<>();
        index = 0;
        flattened = flatten(nestedList);
    }
    public int next() {
        return flattened.get(index++);
    }

    public boolean hasNext() {
        return index < flattened.size();
    }
}