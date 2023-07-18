public class Node {
        int data;
        Node next, prev;

        public Node(int data)
        {
                this.data = data;
                this.next = this.prev = null;
        }

        public Node()
        {
                this.data = 0;
                this.next = null;
                this.prev = null;
        }
}
