class SnapshotArray {

    List<TreeMap<Integer, Integer>> sl;
    int currSnap;

    public SnapshotArray(int length) {
        sl = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            sl.add(new TreeMap<>());
            sl.get(i).put(0, 0);
        }
        currSnap = 0;
    }

    public void set(int index, int val) {
        sl.get(index).put(currSnap, val);
    }

    public int snap() {
        return currSnap++;
    }

    public int get(int index, int snap_id) {
        return sl.get(index).floorEntry(snap_id).getValue();
    }
}