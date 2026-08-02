abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

class Rectangle extends Shape {
    int length = 4;
    int breadth = 6;

    void area() {
        int a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}