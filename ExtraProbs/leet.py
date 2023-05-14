from itertools import combinations


from itertools import combinations


class Solution(object):
    def sumOfPower(self, nums):
        s = 0
        l={};
        for i in range(1, len(nums)+1):
            comb = combinations(nums, i)
            if(l.__contains__(comb)):
                s+=l.values()
                continue
            for c in comb:
                s += max(list(c))**2 * min(list(c))
                l.update({comb,max(list(c))**2 * min(list(c))})
        return s



s = Solution()
nums = [2,1,4]
result = s.sumOfPower(nums)
print(result)
