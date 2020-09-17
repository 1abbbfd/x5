package collections.custom_collection;

public class Main {
    public static void main(String[] args) {
        CustomCollection<CustomObj> collection = new CustomArrayList();
        collection.add(new CustomObj());
        CustomCollection<CustomObj> collection1 = new CustomLinkedList<>();
        collection.add(new CustomObj());
    }

}
