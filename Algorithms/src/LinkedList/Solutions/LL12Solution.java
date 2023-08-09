package LinkedList.Solutions;


import LinkedList.LinkedList;

public class LL12Solution extends LinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        System.out.println(findMiddleNode().value);
    }

    public LL12Solution(int value) {
        super(value);
    }

    public static Node findMiddleNode() {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
