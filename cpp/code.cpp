#include <iostream>
#include <vector>
#include <queue>
#include <unordered_map>

using namespace std;

int theGift(int numPeople, int numRelationships, vector<vector<int>> &relationships, int John, int Dave)
{
    unordered_map<int, vector<int>> graph;
    for (int i = 0; i < numRelationships; ++i)
    {
        int u = relationships[i][0];
        int v = relationships[i][1];
        graph[u].push_back(v);
        graph[v].push_back(u);
    }
    unordered_map<int, bool> visited;
    queue<pair<int, int>> q;
    q.push({John, 0});

    while (!q.empty())
    {
        int person = q.front().first;
        int relatives = q.front().second;
        q.pop();
        visited[person] = true;
        if (person == Dave)
        {
            return relatives;
        }
        for (int neighbor : graph[person])
        {
            if (!visited[neighbor])
            {
                q.push({neighbor, relatives + 1});
            }
        }
    }
    return -1;
}

int main()
{
    int numPeople = 7;
    int numRelationships = 5;
    vector<vector<int>> relationships = {{1, 3}, {1, 4}, {2, 5}, {2, 6}, {5, 7}};
    int John = 3;
    int Dave = 7;

    int result = theGift(numPeople, numRelationships, relationships, John, Dave);
    cout << result << endl; // Output: 2 (John -> 2 -> 3 -> Dave)

    return 0;
}