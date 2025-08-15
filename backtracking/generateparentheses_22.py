from typing import List


class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans: list[str] = []
        path: list[str] = []

        def dfs(start: int, openCount: int, closeCount: int) -> None:
            if start == 2*n:
                ans.append(''.join(path))
                return

            if openCount < n:
                path.append('(')
                dfs(start + 1, openCount + 1, closeCount)
                path.pop()
            if closeCount < openCount:
                path.append(')')
                dfs(start + 1, openCount, closeCount + 1)
                path.pop()

        dfs(0, 0, 0)
        return ans

if __name__ == '__main__':
    n = int(input())
    solution = Solution()
    res = solution.generateParenthesis(n)
    # print(res)
    for line in sorted(res):
        print(line)