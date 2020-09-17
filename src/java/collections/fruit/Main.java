package collections.fruit;

public class Main {
    public static void main(String[] args) {
        Box<Apple> apples = new Box<>();
        apples.addFruits(new Apple());
        apples.addFruits(new Apple());
        apples.addFruits(new Apple());
        Box<Orange> oranges = new Box<>();
        oranges.addFruits(new Orange());
        oranges.addFruits(new Orange());

        System.out.println(oranges.compare(apples));
        System.out.println(apples.compare(oranges));

        oranges.addFruits(new Orange());

        System.out.println(oranges.compare(apples));
        System.out.println(apples.compare(oranges));
    }
}
