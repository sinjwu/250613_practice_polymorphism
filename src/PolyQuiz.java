abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class PolyQuiz {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);         // 반지름 3인 원
        shapes[1] = new Rectangle(4, 5);   // 4×5 직사각형

        for (Shape shape : shapes) {
            System.out.println("도형의 면적: " + shape.area());
        }
    }
}