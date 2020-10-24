package collections.fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    private float weight = 0;

    public void addFruits(T fruit) {
        if (fruits.size() > 0) {
            if (fruits.get(fruits.size() - 1).weight != fruit.weight) {
                try {
                    throw new Exception("этот фрукт нельзя положить в коробку");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
        }
        fruits.add(fruit);
        this.weight += fruit.weight;
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Double.compare(weight, box.getWeight()) == 0;
    }

    public void swap(Box<T> box) {
        this.fruits = new ArrayList<>();
        this.fruits.addAll(box.fruits);
        box.fruits = new ArrayList<>();
    }
}
