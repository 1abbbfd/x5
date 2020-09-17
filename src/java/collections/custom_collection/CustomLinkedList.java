package collections.custom_collection;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedList<E> implements CustomCollection {
    private class Node {
        Object next;
        Object prev;
    }

    private List<E> list = new LinkedList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(Object item) {
        list.add((E) item);
    }

    @Override
    public void remove(int index) {
        E temp = list.get(index);
        remove(temp);
    }

    @Override
    public void remove(Object item) {
        list.remove(item);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public void clear() {
        list = new LinkedList<>();
    }
}
