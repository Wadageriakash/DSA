package Arrays;


//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args){
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode result =    addTwoNumbers( l1,  l2);
    List finalResult = new LinkedList<>();
    while(result != null) {
    	finalResult.add(result.value);
    	result = result.next;
    }
    Collections.reverse(finalResult);
    System.out.println(finalResult);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
       
           while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum = sum+l1.value;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum + l2.value;
                l2 = l2.next;
            }
            
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            
           }
        return dummy.next;
    }
}
class ListNode {
    int value;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.value = val;
    }

    ListNode(int val, ListNode next) {
        this.value = val;
        this.next = next;
    }
}

