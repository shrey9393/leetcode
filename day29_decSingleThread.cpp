class Solution
{
public:
    vector<int> getOrder(vector<vector<int>> &tasks)
    {
        for (int i = 0; i < tasks.size(); i++)
        {
            tasks[i].push_back(i);
        }
        sort(tasks.begin(), tasks.end());

        priority_queue <vector<int>, vector<vector<int>>, greater<vector<int>>> priorque;
        vector<int> a;
        int maxEnqTime = 0;
        int i = 0;
        while (a.size() < tasks.size())
        {
            if (i < tasks.size() && priorque.empty())
            {
                maxEnqTime = max(maxEnqTime, tasks[i][0]);
            }
            while (i < tasks.size() && maxEnqTime >= tasks[i][0])
            {
                priorque.push({tasks[i][1], tasks[i][2]});
                i++;
            }
            auto x = priorque.top();
            priorque.pop();
            maxEnqTime = min(1000000000, x[0] + maxEnqTime);
            a.push_back(x[1]);
        }
        return a;
    }
};