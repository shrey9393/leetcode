class MyCalendar {
    TreeMap<Integer, Integer> bookedSlots;

    public MyCalendar() {
        bookedSlots = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer floorKey = bookedSlots.floorKey(start);
        if (floorKey != null && bookedSlots.get(floorKey) > start) {
            return false;
        }
        Integer ceilingKey = bookedSlots.ceilingKey(start);
        if (ceilingKey != null && ceilingKey < end) {
            return false;
        }
        bookedSlots.put(start, end);
        return true;
    }
}
