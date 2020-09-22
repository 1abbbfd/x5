package oop.lesson4.shape;

public class Triangle implements Shape {
    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;
    private final int semiPerimeter;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
    }

    @Override
    public double square(){
        double square = Math.sqrt(semiPerimeter
                * (semiPerimeter - firstSide)
                * (semiPerimeter - secondSide)
                * (semiPerimeter - thirdSide));
        if (Double.isNaN(square)) {
            try {
                throw new Exception("Треугольника с такими сторонами не существует");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return square;
    }
}
