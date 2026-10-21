
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Solution {

        private ArrayList<Integer> list;
        private Random random;

        public Solution(ListNode head) {
            list = new ArrayList<>();
            random = new Random();

            ListNode current = head;

            while (current != null) {
                list.add(current.val);
                current = current.next;
            }
        }

        public int getRandom() {
            int index = random.nextInt(list.size());
            return list.get(index);
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        Solution solution = new Solution(head);

        System.out.println("Linked List: 10 -> 20 -> 30 -> 40 -> 50");

        System.out.println("\nRandomly Selected Nodes:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                "Selection " + i + ": " + solution.getRandom()
            );
        }
    }
}
