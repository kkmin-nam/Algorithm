import java.util.ArrayDeque

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0

        var q = ArrayDeque()

        for(c in s){
            while(q.contains(c)){
                q.removeFirst()
            }
            q.add(c)

            if (result < q.size){
                result = q.size
            }
        }

        return result
    }
}