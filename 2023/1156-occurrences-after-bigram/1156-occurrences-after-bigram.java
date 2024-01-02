class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> al = new ArrayList<>();
        String toCompare = first + " " + second;
        String arr[] = text.split(" ");
        for (int i = 2; i < arr.length; i++) {
            if ((arr[i - 2] + " " + arr[i - 1]).equals(toCompare)) {
                al.add(arr[i]);
            }
        }
        String ans[] = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}