package collections.custom_collection;

public class CustomLinkedList implements CustomCollection {
    private Node root;
    private int pointer = -1;

    private class Node<E> {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public int size() {
        return pointer + 1;
    }

    @Override
    public void add(Object item) {
        if (root == null) {
            root = new Node(item, null, null);
            pointer++;
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
        pointer++;
    }

    @Override
    public void remove(int index) {
        if (pointer == 0) {
            root = null;
            pointer--;
            return;
        }

        if (index == 0) {
            root = root.next;
            root.prev = null;
            pointer--;
            return;
        }

        if (index == pointer) {
            root = root.next;
            root.prev = null;
            pointer--;
            return;
        }

        Node node = root;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        pointer--;
    }

    public void print() {
        Node node = root;
        while (true) {
            if (node.next == null) {
                System.out.println(node.element);
                break;
            }
            System.out.println(node.element);
            node = node.next;
        }
    }

    @Override
    public void remove(Object item) {
        if (pointer == 0 && root.element.equals(item)) {
            root = null;
            pointer = -1;
            return;
        }

        if (root.element.equals(item)) {
            root = root.next;
            root.prev = null;
            pointer--;
            return;
        }

        Node node = root;
        for (int i = 0; i < pointer; i++) {
            node = node.next;
            if (node.element.equals(item)) {
                if (i == pointer - 1) {
                    node.prev.next = null;
                    pointer--;
                    return;
                }
                break;
            }
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        pointer--;
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
        pointer = -1;
    }
}
