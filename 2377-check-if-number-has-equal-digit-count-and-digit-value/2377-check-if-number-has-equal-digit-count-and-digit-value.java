class Solution {
    public boolean digitCount(String num) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < num.length(); i++)
        {
            char x = num.charAt(i);

            int a = x - '0'; 

            if(map.containsKey(a))
                map.put(a,map.get(a)+1);

            else
                map.put(a,1);

        }

        for(int i = 0; i<num.length(); i++)
        {

            if(!map.containsKey(i))
            {
                if(num.charAt(i)!='0') 
                    return false;
                else 
                    continue;
            }
            char x = num.charAt(i); 
            int a = x - '0'; 
            if(a!=map.get(i))
                return false;

        }

        return true;
    }
}