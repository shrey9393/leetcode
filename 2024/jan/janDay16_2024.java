class RandomizedSet {
    public static HashSet<Integer> hs;
    public RandomizedSet() {
        hs = new HashSet<>();
    }
    
    public boolean insert(int val) {
        return hs.add(val);
    }
    
    public boolean remove(int val) {

        return hs.remove(val);
    }
    
    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(hs);
       int r=(int)(Math.random()*hs.size());
       return list.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */