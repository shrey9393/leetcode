#include <iostream>
#include <cMath>
using namespace std;
class Solution
{
public:
    int minFlipsMonoIncr(string s)
    {
        int countf = 0, count1 = 0;
        for (char c : s)
        {
            if (c == '1')
            {
                count1++;
            }
            else
            {
                if (count1 > 0)
                {
                    countf++;
                }
            }
            countf = min(countf, count1);
        }
        return countf;
    }
};
int main()
{
    return 0;
}