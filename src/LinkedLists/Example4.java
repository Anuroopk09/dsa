package LinkedLists;

import java.util.PriorityQueue;

public class Example4
{
    static class ListNode 
    {
        int val;
        ListNode next;

        ListNode(int val) 
        {
            this.val = val;
        }

        ListNode(int val, ListNode next) 
        {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) 
    {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) 
        {
            if (node != null) 
            {
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) 
        {
            ListNode node = pq.poll();
            tail.next = node;
            tail = tail.next;

            if (node.next != null) 
            {
                pq.offer(node.next);
            }
        }
        return dummy.next;
    }

    public static void printList(ListNode head) 
    {
        while (head != null) 
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) 
    {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = {l1, l2, l3};

        ListNode result = mergeKLists(lists);

        printList(result);
    }
}