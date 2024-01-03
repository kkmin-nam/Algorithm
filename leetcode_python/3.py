from collections import deque

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        result = 0

        q = deque()

        idx = 0
        while idx < len(s):
            if s[idx] not in q:
                q.append(s[idx])
            else:
                while s[idx] in q:
                    q.popleft()
                q.append(s[idx])

            result = max(result, len(q))
            idx += 1

        return result
