from typing import List

KEYBOARD = {
    "2": "abc",
    "3": "def",
    "4": "ghi",
    "5": "jkl",
    "6": "mno",
    "7": "pqrs",
    "8": "tuv",
    "9": "wxyz",
}
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        res: list[str] = []

        def dfs(start_index: int, path: list[str]) -> None:
            if start_index == len(digits):
                res.append(''.join(path))
                return

            next_number = digits[start_index]
            for letter in KEYBOARD[next_number]:
                path.append(letter)
                dfs(start_index + 1, path)
                path.pop()

        dfs(0, [])
        return res

if __name__ == "__main__":
    digits = input()
    solution = Solution()
    res = solution.letterCombinations(digits)
    print(" ".join(res))