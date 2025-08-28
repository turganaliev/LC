class Solution:
    def numDecodings(self, s: str) -> int:
        memo: dict[int, int] = {}

        def backtrack(start: int):
            if start in memo:
                return memo[start]
            if start == len(s):
                return 1

            ways = 0
            if s[start] == '0':
                return ways

            ways += backtrack(start + 1)

            if 10 <= int(s[start:start + 2]) <= 26:
                ways += backtrack(start + 2)

            memo[start] = ways
            return ways

        return backtrack(0)

if __name__ == "__main__":
    digits = input()
    solution = Solution()
    res = solution.numDecodings(digits)
    print(res)