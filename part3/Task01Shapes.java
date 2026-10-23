// Часть 3, задание 1: абстрактные фигуры
public class Task01Shapes {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // s1.getRadius() нельзя: в Shape такого метода нет.
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        // new Shape() нельзя: Shape является абстрактным классом.
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());
        // У Shape и Rectangle нет getSide(). Нужна ссылка Square.
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
        sq1.setWidth(4);
        System.out.println("После setWidth(4): " + sq1.getWidth() + " x " + sq1.getLength());
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Circle extends Shape {
        protected double radius;
        public Circle() { this(1.0); }
        public Circle(double radius) { this(radius, "blue", false); }
        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }
        public double getRadius() { return radius; }
        public void setRadius(double radius) { this.radius = radius; }
        @Override
        public double getArea() { return Math.PI * radius * radius; }
        @Override
        public double getPerimeter() { return 2 * Math.PI * radius; }
        @Override
        public String toString() {
            return "Circle: radius=" + radius + ", " + super.toString();
        }
    }

    public static class Rectangle extends Shape {
        protected double width;
        protected double length;
        public Rectangle() { this(1.0, 1.0); }
        public Rectangle(double width, double length) { this(width, length, "blue", false); }
        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }
        public double getWidth() { return width; }
        public void setWidth(double width) { this.width = width; }
        public double getLength() { return length; }
        public void setLength(double length) { this.length = length; }
        @Override
        public double getArea() { return width * length; }
        @Override
        public double getPerimeter() { return 2 * (width + length); }
        @Override
        public String toString() {
            return "Rectangle: width=" + width + ", length=" + length + ", " + super.toString();
        }
    }

    public static abstract class Shape {
        protected String color;
        protected boolean filled;

        public Shape() { this("blue", false); }
        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
        public boolean isFilled() { return filled; }
        public void setFilled(boolean filled) { this.filled = filled; }
        public abstract double getArea();
        public abstract double getPerimeter();
        @Override
        public String toString() {
            return "Shape: color=" + color + ", filled=" + filled;
        }
    }

    public static class Square extends Rectangle {
        public Square() { this(1.0); }
        public Square(double side) { this(side, "blue", false); }
        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }
        public double getSide() { return width; }
        public void setSide(double side) {
            width = side;
            length = side;
        }
        // При изменении любой стороны квадрат остается квадратом.
        @Override
        public void setWidth(double side) { setSide(side); }
        @Override
        public void setLength(double side) { setSide(side); }
        @Override
        public String toString() {
            return "Square: side=" + width + ", color=" + color + ", filled=" + filled;
        }
    }
}
