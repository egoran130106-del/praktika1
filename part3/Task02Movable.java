// Часть 3, задание 2 и подпункт 2: движущиеся фигуры
public class Task02Movable {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 5, 2, 3);
        System.out.println("Одинаковая скорость: " + rectangle.hasSameSpeed());
        Movable[] objects = {
            new MovablePoint(0, 0, 2, 3),
            new MovableCircle(0, 0, 2, 3, 5), rectangle
        };
        for (Movable object : objects) {
            System.out.println("До: " + object);
            object.moveRight();
            object.moveDown();
            System.out.println("После вправо и вниз: " + object);
            object.moveLeft();
            object.moveUp();
            System.out.println("Обратно: " + object);
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    public static class MovableCircle implements Movable {
        private int radius;
        private MovablePoint center;
        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            center = new MovablePoint(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }
        public void moveUp() { center.moveUp(); }
        public void moveDown() { center.moveDown(); }
        public void moveLeft() { center.moveLeft(); }
        public void moveRight() { center.moveRight(); }
        public String toString() { return "Circle: center=" + center + ", radius=" + radius; }
    }

    public static class MovablePoint implements Movable {
        int x, y, xSpeed, ySpeed;
        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public void moveUp() { y -= ySpeed; }
        public void moveDown() { y += ySpeed; }
        public void moveLeft() { x -= xSpeed; }
        public void moveRight() { x += xSpeed; }
        public String toString() {
            return "(" + x + ", " + y + "), speed=(" + xSpeed + ", " + ySpeed + ")";
        }
    }

    public static class MovableRectangle implements Movable {
        private MovablePoint topLeft;
        private MovablePoint bottomRight;
        public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
            topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }
        public boolean hasSameSpeed() {
            return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
        }
        public void moveUp() {
            if (hasSameSpeed()) { topLeft.moveUp(); bottomRight.moveUp(); }
        }
        public void moveDown() {
            if (hasSameSpeed()) { topLeft.moveDown(); bottomRight.moveDown(); }
        }
        public void moveLeft() {
            if (hasSameSpeed()) { topLeft.moveLeft(); bottomRight.moveLeft(); }
        }
        public void moveRight() {
            if (hasSameSpeed()) { topLeft.moveRight(); bottomRight.moveRight(); }
        }
        public String toString() { return "Rectangle: " + topLeft + "; " + bottomRight; }
    }
}
