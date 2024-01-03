# 2. Add Tow Numbers
from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        root = head = ListNode()

        q = 0
        while l1 or l2 or q:
            sum = 0

            if l1:
                sum += l1.val
                l1 = l1.next

            if l2:
                sum += l2.val
                l2 = l2.next

            q, r = divmod(sum + q, 10)
            head.next = ListNode(r)
            head = head.next

        return root.next
