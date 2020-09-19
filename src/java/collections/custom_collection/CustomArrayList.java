package collections.custom_collection;

public class CustomArrayList<E> implements CustomCollection {
    private int length = 8;
    private E[] array;
    private int pointer = -1;

    public CustomArrayList() {
        this.array = (E[]) new Object[length];
    }

    @Override
    public int size() {
        return this.pointer + 1;
    }

    @Override
    public void add(Object item) {
        if (length - 1 == pointer) {
            swap();
        }
        array[++pointer] = (E) item;
    }

    @Override
    public void remove(int index) {
        if (pointer >= 0 && index <= pointer) {
            for (int i = index; i < pointer; i++) {
                array[i] = array[i + 1];
            }
            array[pointer] = null;
            pointer--;
        }
    }

    @Override
    public void remove(Object item) {
        if (pointer >= 0) {
            int index = -1;
            for (int i = 0; i <= pointer; i++) {
                if (array[i].equals(item)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                return;
            }
            for (int i = index; i < pointer; i++) {
                array[i] = array[i + 1];
            }
            array[pointer] = null;
            pointer--;
        }
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        array = (E[]) new Object[8];
        pointer = -1;
        length = 8;
    }

    private void swap() {
        length *= 2;
        E[] temp = (E[]) new Object[length];
        for (int i = 0; i < size(); i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}
