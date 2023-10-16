class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> mList = new ArrayList<>();
        int i = 0;
        while (i < rowIndex + 1) {
            List<Integer> ans = new ArrayList<>();
            if (i == 0) {
                ans.add(1);
            } else if (i == 1) {
                ans.add(1);
                ans.add(1);
            } else {
                ans.add(1);
                for (int j = 1; j < mList.get(i - 1).size(); j++) {
                    ans.add(mList.get(i - 1).get(j - 1) + mList.get(i - 1).get(j));
                }
                ans.add(1);
            }
            mList.add(ans);
            i++;
        }
        return mList.get(rowIndex);
    }
}