class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> hs = new HashMap<>();
        for(String s : strs){
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String temp = Arrays.toString(arr);
            if(hs.containsKey(temp)){
                hs.get(temp).add(s);
            }else{
                hs.put(temp,new ArrayList<>());
                hs.get(temp).add(s);
            }
            System.out.println(temp);
        }
        for(String s:hs.keySet()){
            ans.add(hs.get(s));
        }
        return ans;
    }
}