package zadanie2;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРУЕМ ДВИЖУЩИЕСЯ ОБЪЕКТЫ ===");

        // Тестируем точку
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println("Начальная позиция: " + point);
        point.moveRight();
        point.moveUp();
        System.out.println("После движения: " + point);

        // Тестируем круг
        MovableCircle circle = new MovableCircle(10, 10, 2, 2, 5);
        System.out.println("\nКруг: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Круг после движения: " + circle);
    }
}