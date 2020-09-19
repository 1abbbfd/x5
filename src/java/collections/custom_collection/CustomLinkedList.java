package collections.custom_collection;

import java.util.Objects;

public class CustomLinkedList implements CustomCollection {
    private Node root;
    private int length = -1;

    private class Node<E> {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(element, node.element);
        }

        @Override
        public int hashCode() {
            return Objects.hash(element);
        }
    }

    @Override
    public int size() {
        return length + 1;
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
        if (index == 0) {
            root = root.next;
            root.prev = null;
            length--;
            return;
        }
        Node node = root;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        length--;
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
        if (root.equals(item)) {
            root = root.next;
            root.prev = null;
            length--;
            return;
        }

        Node node = root;
        for (int i = 0; i < length; i++) {
            node = node.next;
            if (node.equals(item)) {
                break;
            }
            if (i == length - 1) {
                return;
            }
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
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
        length = -1;
    }
}
