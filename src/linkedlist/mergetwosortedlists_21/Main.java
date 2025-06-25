package linkedlist.mergetwosortedlists_21;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1_1 = new ListNode(1, new ListNode(2, new ListNode(4)));
//        ListNode list1_2 = new ListNode(2);
//        ListNode list1_4 = new ListNode(4);
        ListNode list2_2 = new ListNode(1, new ListNode(3, new ListNode(4)));
//        ListNode list2_3 = new ListNode(3);
//        ListNode list2_4 = new ListNode(4);

//        list1.next = list1_2;
//        list1_2.next = list1_4;
//        list2.next = list2_3;
//        list2_3.next = list2_4;

        System.out.println(solution.mergeTwoLists(list1_1, list2_2));
    }
}
