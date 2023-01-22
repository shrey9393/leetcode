class Solution
{
public:
    int minCost(vector<int> &nums, int k)
    {
        int size = nums.size();
        vector<vector<long long>> dp_1(size, vector<long long>(size, 0));
        for (int i = 0; i < size; i++)
        {
            vector<int> mp(size, 0);
            int c = 0;
            for (int j = i; j < size; j++)
            {
                if (mp[nums[j]] == 0)
                {
                }
                else if ((mp[nums[j]]) == 1)
                    c += 2;
                else
                    c++;
                mp[nums[j]]++;
                dp_1[i][j] = c;
            }
        }
        vector<long long> dp_2(size + 1, LLONG_MAX);
        dp_2[0] = 0;
        dp_2[1] = dp_1[0][0] + k;

        for (int i = 2; i <= size; i++)
        {
            dp_2[i] = dp_1[0][i - 1] + k;
            for (int j = i - 1; j >= 1; j--)
            {
                dp_2[i] = min(dp_2[i], dp_2[j] + dp_1[j][i - 1] + k);
            }
        }
        return dp_2[size];
    }
};