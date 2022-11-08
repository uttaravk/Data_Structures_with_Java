//Problem: https://leetcode.com/problems/add-two-numbers/

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int tempval = l1.val + l2.val;
        if (tempval > 9) {
            tempval = tempval - 10;
            carry = 1;
        } else {
            carry = 0;
        }
        ListNode result = new ListNode(tempval);
        ListNode head = result;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            tempval = l1.val + l2.val + carry;
            if (tempval > 9) {
                tempval = tempval - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode tempNode = new ListNode(tempval);
            result = head;
            while (result.next != null) {
                result = result.next;
            }
            result.next = tempNode;
            l1 = l1.next;
            l2 = l2.next;
        }

        result = head;
        while (result.next != null) {
            result = result.next;
        }

        while (l1 != null) {
            tempval = carry + l1.val;
            if (tempval > 9) {
                carry = 1;
                tempval = tempval - 10;
            } else {
                carry = 0;
            }
            ListNode tempNode = new ListNode(tempval);
            result = head;
            while (result.next != null) {
                result = result.next;
            }
            result.next = tempNode;
            l1 = l1.next;
        }
        while (l2 != null) {
            tempval = carry + l2.val;
            if (tempval > 9) {
                carry = 1;
                tempval = tempval - 10;
            } else {
                carry = 0;
            }
            ListNode tempNode = new ListNode(tempval);
            result = head;
            while (result.next != null) {
                result = result.next;
            }
            result.next = tempNode;
            l2 = l2.next;
        }
        if (carry != 0) {
            ListNode tempNode = new ListNode(carry);
            result = head;
            while (result.next != null) {
                result = result.next;
            }
            result.next = tempNode;
        }
        result = head;
        return result;

    }
}
