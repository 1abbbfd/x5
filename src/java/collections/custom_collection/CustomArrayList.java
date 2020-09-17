package collections.custom_collection;

public class CustomArrayList implements CustomCollection {
    private int length = 8;
    private Object[] array = new Object[8];
    private int pointer = 0;


    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void add(Object item) {
        pointer++;
        if (array.length == pointer) {
            swap(this.array);
        }
        array[pointer] = item;
    }

    @Override
    public void remove(int index) {
        Object[] temp = new Object[length];
        int counter = 0;
        for (Object o : array) {
            if (counter == index) {
                continue;
            }
            temp[counter] = o;
            counter++;
        }
        this.array = temp;
    }

    @Override
    public void remove(Object item) {
        Object[] temp = new Object[length];
        int counter = 0;
        for (Object o : array) {
            if (o.equals(array[counter])) {
                continue;
            }
            temp[counter] = o;
            counter++;
        }
        this.array = temp;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        this.array = new Object[8];
    }

    private void swap(Object[] array) {
        this.length *= 2;
        Object[] temp = new Object[length];
        for (int i = 0; i < size(); i++) {
            temp[i] = this.array[i];
        }
        this.array = temp;
    }
}
