from typing import List


class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        new_arr = []
        for n in range(2):
            for num in nums:
                new_arr.append(num)
        return new_arr

if __name__=="__main__":
    input_nums = input()
    nums = []
    for n in input_nums:
        nums.append(int(n))
    solution = Solution()
    res = solution.getConcatenation(nums)
    print(res)