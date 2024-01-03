/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2

        var head = ListNode(0)
        val root = head

        var q = 0
        while(l1 != null || l2 != null || q != 0){
            var sum = 0

            l1?.let{
                sum += it.`val`
                l1 = it.next
            }

            l2?.let{
                sum += it.`val`
                l2 = it.next
            }

            val now = sum + q
            val r = now.rem(10)
            q = now.div(10)
            head.next = ListNode(r)
            head = head.next
        }

        return root.next
    }
}