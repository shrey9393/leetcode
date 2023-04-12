#include <iostream>
#include <vector>
using namespace std;
class Solution
{
public:
    int bestTeamScore(vector<int> &scores, vector<int> &ages)
    {
        int res = 0, n = ages.size();
        int dp[n];
        memset(dp, 0, sizeof dp);
        vector<vector<int>> temp;
        for (int i = 0; i < scores.size(); i++)
        {
            temp.push_back({-ages[i], -scores[i]});
        }
        sort(temp.begin(), temp.end());
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j >= 0; j--)
            {
                if (-temp[i][1] <= -temp[j][1])
                {
                    dp[i] = max(dp[i], dp[j] - temp[i][1]);
                }
            }
            res = max(res, dp[i]);
        }
        return res;
    }
};