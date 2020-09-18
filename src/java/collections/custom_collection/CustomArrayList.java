package collections.custom_collection;

public class CustomArrayList<E> implements CustomCollection {
    private int length = 8;
    private E[] array;
    private int pointer = 0;

    public CustomArrayList() {
        this.array = (E[]) new Object[length];
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public void add(Object item) {
        if (length == pointer) {
            swap();
        }
        array[pointer] = (E) item;
        pointer++;
    }

    @Override
    public void remove(int index) {
        if (pointer == 0) {
            return;
        }
        for (int i = index; i < pointer - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.pointer -= 1;
    }

    @Override
    public void remove(Object item) {
        if (pointer == 0) {
            return;
        }
        int index = -1;
        for (int i = 0; i < pointer; i++) {
            if (this.array[i].equals(item)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }

        for (int i = index; i < pointer - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.pointer -= 1;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        this.array = (E[]) new Object[8];
        length = 8;
    }

    private void swap() {
        this.length *= 2;
        E[] temp = (E[]) new Object[length];
        for (int i = 0; i < size(); i++) {
            temp[i] = this.array[i];
        }
        this.array = temp;
    }
}
