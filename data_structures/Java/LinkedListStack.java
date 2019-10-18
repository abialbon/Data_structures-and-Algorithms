public class LinkedListStack {
    private Node head;
    private int length = 0;

    private class Node {
        int data;
        Node next;

        Node(int element) {
            data = element;
        }
    }

    public void push(int element) {
        if (length == 0) {
            head = new Node(element);;
        } else {
            Node temp = head;
            head = new Node(element);
            head.next = temp;
        }
        length++;
    }

    public int pop() {
        Node temp = head;
        head = head.next;
        length--;
        return temp.data;
    }

    public int length() {
        return length;
    }

    public static void main(String[] args) {

    }
}
