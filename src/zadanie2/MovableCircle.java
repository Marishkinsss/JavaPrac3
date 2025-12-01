package zadanie2;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center; // центр круга - движущаяся точка

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        // Создаем точку-центр с заданными параметрами
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Все методы делегируем точке-центру
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + ", center: " + center;
    }
}