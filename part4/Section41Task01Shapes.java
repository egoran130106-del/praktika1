// Часть 4, раздел 4.1, задание 1: обычный класс Shape
public class Section41Task01Shapes {
    public static void main(String[] args) {
        Shape[] shapes = {new Shape(), new Circle(2), new Rectangle(3, 4), new Square(5)};
        for (Shape shape : shapes) {
            System.out.println(shape.getType() + ": " + shape);
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Периметр: " + shape.getPerimeter());
        }
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
        public String getType() { return "Круг"; }
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
        public String getType() { return "Прямоугольник"; }
    }

    public static class Shape {
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
        public double getArea() { return 0; }
        public double getPerimeter() { return 0; }
        @Override
        public String toString() {
            return "Shape: color=" + color + ", filled=" + filled;
        }
        public String getType() { return "Фигура"; }
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
        public String getType() { return "Квадрат"; }
        @Override
        public double getArea() { return width * width; }
        @Override
        public double getPerimeter() { return 4 * width; }
    }
}
