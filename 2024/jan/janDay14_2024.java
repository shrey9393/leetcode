class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!= word2.length()){
            return false;
        }
        int s1[]=new int[26];
        int s2[]= new int[26];
        for(char x: word1.toCharArray())
        {
            s1[x-'a']++;
        }
        
        for(char x: word2.toCharArray())
        {
            s2[x-'a']++;
        }
        for(int i =0;i<26;i++){
            if((s1[i]==0 && s2[i]!=0)||(s1[i]!=0 && s2[i]==0))
            {
                return false;
            }
        }
        Map <Integer,Integer> map = new HashMap<>();
        for(int i : s1)
        {
            if(i>0)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        for(int i : s2)
        {
             if(i>0)
            {
                if(!map.containsKey(i))
                {
                    
                    return false;
                }
                map.put(i,map.get(i)-1);
                if(map.get(i)==0)
                {
                    map.remove(i);
                }
            }

            
        }
        return map.size()==0;


    }
}