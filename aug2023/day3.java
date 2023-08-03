class Solution {
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if(n==0){
            return (new ArrayList<>());
        }

        String arr[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wyxz"};
        List<String> ans = new ArrayList<>(Arrays.asList(""));
        for(int i = n-1 ; i>=0 ; i--){
            List<String> res = new ArrayList<>();
            for(char c : arr[(digits.charAt(i)-'2')].toCharArray()){
                for(String s:ans){
                    res.add(c+s);
                }
            }
            ans = res;
        }
        return ans;
    }
}
