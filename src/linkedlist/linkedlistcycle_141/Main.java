package linkedlist.linkedlistcycle_141;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(3);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_0 = new ListNode(0);
        ListNode node1_neg4 = new ListNode(-4);

        head1.next = node1_2;
        node1_2.next = node1_0;
        node1_0.next = node1_neg4;
        node1_neg4.next = node1_2;

        System.out.println(solution.hasCycle(head1));
    }
}
