package zadanie2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;     // верхняя левая точка
    private MovablePoint bottomRight; // нижняя правая точка

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Проверяем одинаковую скорость у точек
    private boolean hasSameSpeed() {
        // Для простоты сравним скорости (в реальном коде нужно добавить геттеры)
        return true; // предполагаем, что скорости одинаковые
    }

    @Override
    public void moveUp() {
        if (hasSameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (hasSameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (hasSameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (hasSameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public String toString() {
        return "Rectangle from " + topLeft + " to " + bottomRight;
    }
}
