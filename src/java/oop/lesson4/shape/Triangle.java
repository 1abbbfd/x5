package oop.lesson4.shape;

public class Triangle implements Shape {
    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double square(){
        double square = Math.sqrt(getSemiPerimeter()
                * (getSemiPerimeter() - firstSide)
                * (getSemiPerimeter() - secondSide)
                * (getSemiPerimeter() - thirdSide));
        if (Double.isNaN(square)) {
            try {
                throw new Exception("Треугольника с такими сторонами не существует");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return square;
    }

    private double getSemiPerimeter() {
        return (firstSide + secondSide + thirdSide) / 2.0;
    }
}
