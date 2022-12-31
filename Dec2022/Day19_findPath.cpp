#include <iostream>
#include <vector>
#include <queue>
using namespace std;

class Solution
{
public:
    bool validPath(int n, vector<vector<int>> &edges, int start, int end)
    {
        vector<vector<int>> adjList(n);
        queue<int> q;
        vector<bool> seen(n, false);
        int u, v, currv, secv;
        for (int i = 0; i < edges.size(); i++)
        {
            u = edges[i][0];
            v = edges[i][1];
            adjList[u].push_back(v);
            adjList[v].push_back(u);
        }
        q.push(start);
        seen[start] = true;
        while (!q.empty())
        {
            currv = q.front();
            for (int i = 0; i < adjList[currv].size(); i++)
            {
                secv = adjList[currv][i];
                if (!seen[secv])
                {
                    q.push(secv);
                    seen[secv] = true;
                }
            }
            q.pop();
        }
        if (seen[end])
        {
            return true;
        }
        return false;
    }
};