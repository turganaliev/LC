from typing import List


class Solution:
    def partition(self, s: str) -> List[List[str]]:
        ans = []
        n = len(s)

        def dfs(start, path):
            if start == n:
                ans.append(path[:])
                return

            for end in range(start + 1, n + 1):
                prefix = s[start: end]
                if prefix == prefix[::-1]:
                    dfs(end, path + [prefix])

        dfs(0, [])
        return ans

if __name__ == "__main__":
    s = input()
    solution = Solution()
    res = solution.partition(s)
    for row in res:
        print(" ".join(row))