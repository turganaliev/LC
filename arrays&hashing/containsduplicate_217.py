from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        for n in nums:
            if n in hashset:
                return True
            hashset.add(n)
        return False

if __name__=='__main__':
    nums = input()
    int_nums = []
    for n in nums:
        int_nums.append(int(n))
    solution = Solution()
    res = solution.containsDuplicate(int_nums)
    print(res)