package zadanie2;

public class MovablePoint implements Movable {
    private int x;        // координата X
    private int y;        // координата Y
    private int xSpeed;   // скорость по X
    private int ySpeed;   // скорость по Y

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // РЕАЛИЗУЕМ методы интерфейса:
    @Override
    public void moveUp() {
        y -= ySpeed; // двигаем ВВЕРХ - уменьшаем Y
    }

    @Override
    public void moveDown() {
        y += ySpeed; // двигаем ВНИЗ - увеличиваем Y
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; // двигаем ВЛЕВО - уменьшаем X
    }

    @Override
    public void moveRight() {
        x += xSpeed; // двигаем ВПРАВО - увеличиваем X
    }

    @Override
    public String toString() {
        return "Point at (" + x + ", " + y + ") with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}