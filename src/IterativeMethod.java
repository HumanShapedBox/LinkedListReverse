public class IterativeMethod {

    public void startIterativeReverse(){
        int[] keys = { 1, 2, 3, 4, 5 };

        Node head = null;
        for (int key: keys) {
            head = push(head, key);
        }

        printList("Before: ", head);
        head = reverseList(head);
        printList("After iterative reverse: ", head);
    }

    private Node push(Node head, int key)
    {
        Node node = new Node();
        node.data = key;
        node.prev = null;
        node.next = head;

        if (head != null) {
            head.prev = node;
        }

        head = node;
        return head;
    }

    private void printList(String msg, Node head)
    {
        System.out.print(msg);
        while (head != null)
        {
            System.out.print(head.data + " —> ");
            head = head.next;
        }

        System.out.println("null");
    }

    private void swap(Node node)
    {
        Node prev = node.prev;
        node.prev = node.next;
        node.next = prev;
    }

    private Node reverseList(Node head)
    {
        Node prev = null;
        Node curr = head;

        while (curr != null)
        {
            swap(curr);
            prev = curr;
            curr = curr.prev;
        }
        if (prev != null) {
            head = prev;
        }
        return head;
    }
}
