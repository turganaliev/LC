class Solution:
    def hammingWeight(self, n: int) -> int:
        numbit = bin(n)
        total = 0
        for i in numbit:
            if i == '1':
                total += 1
        return total

if __name__=='__main__':
    n = int(input())
    solution = Solution()
    res = solution.hammingWeight(n)
    print(res)