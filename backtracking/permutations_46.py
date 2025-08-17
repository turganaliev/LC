from typing import List


class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        path = []
        len_nums = len(nums)
        visited = [False] * len_nums

        def backtrack(start):
            if start == len_nums:
                res.append(path[:])
                return

            for i in range(len_nums):
                if visited[i]:
                    continue
                path.append(nums[i])
                visited[i] = True
                backtrack(start + 1)
                path.pop()
                visited[i] = False

        backtrack(0)
        return res

if __name__ == "__main__":
    input_nums = input()
    nums = []
    for n in input_nums:
        nums.append(int(n))
    solution = Solution()
    res = solution.permute(nums)
    for line in sorted(res):
        print(line)
