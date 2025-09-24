class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        res = [0] * 26
        for char in s:
            res[ord(char) - ord('a')] += 1
        for char in t:
            res[ord(char) - ord('a')] -= 1
        for i in res:
            if i != 0:
                return False
        return True

if __name__=='__main__':
    s = input()
    t = input()
    solution = Solution()
    res = solution.isAnagram(s, t)
    print(res)
