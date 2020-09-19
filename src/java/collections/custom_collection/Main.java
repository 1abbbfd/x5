package collections.custom_collection;

public class Main {
    public static void main(String[] args) {
        CustomCollection<CustomObj> collection = new CustomLinkedList();
        CustomObj customObj1 = new CustomObj(1);
        CustomObj customObj2 = new CustomObj(2);
        CustomObj customObj3 = new CustomObj(3);
        collection.add(customObj1);
        collection.add(customObj2);
        collection.add(customObj3);
        collection.remove(customObj3);
        System.out.println(collection.size());
    }
}
