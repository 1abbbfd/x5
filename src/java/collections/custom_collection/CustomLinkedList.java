package collections.custom_collection;

public class CustomLinkedList implements CustomCollection {
    private Node root;
    private int length = 0;

    private class Node<T> {
        T element;
        Node next;
        Node prev;

        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


    @Override
    public int size() {
        return length;
    }

    @Override
    public void add(Object item) {
        if (root == null) {
            root = new Node(item, null, null);
            length++;
            return;
        }

        Node node = root;
        while (true) {
            if (node.next == null) {
                node.next = new Node(item, null, node);
                break;
            }
            node = node.next;
        }
        length++;
    }

    @Override
    public void remove(int index) {
        Node node = root;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        //TODO
        length--;

    }

    @Override
    public void remove(Object item) {
        Node node = root;
        while (!node.equals(item)) {
            node = node.next;
        }
        //TODO
        length--;
    }

    @Override
    public Object get(int index) {
        Node node = root;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.element;
    }

    @Override
    public void clear() {
        root = null;
    }
}
