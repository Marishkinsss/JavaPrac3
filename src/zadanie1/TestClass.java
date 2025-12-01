package zadanie1;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА ===");

        // 1. Upcast - преобразование Circle к Shape
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println("1. " + s1);                    // Вызовется Circle.toString()
        System.out.println("2. Площадь: " + s1.getArea()); // Вызовется Circle.getArea()
        System.out.println("3. Периметр: " + s1.getPerimeter()); // Circle.getPerimeter()
        System.out.println("4. Цвет: " + s1.getColor());
        System.out.println("5. Закрашен: " + s1.isFilled());

        // ОШИБКА КОМПИЛЯЦИИ:
        // System.out.println(s1.getRadius());
        // Объяснение: У Shape нет метода getRadius(), только у Circle

        // 2. Downcast - обратное преобразование к Circle
        Circle c1 = (Circle) s1;
        System.out.println("6. Радиус: " + c1.getRadius()); // Теперь можно

        // 3. ОШИБКА: нельзя создать объект абстрактного класса
        // Shape s2 = new Shape(); // Раскомментируйте - будет ошибка!

        // 4. Работа с Rectangle
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println("7. " + s3);
        System.out.println("8. Площадь прямоугольника: " + s3.getArea());

        // 5. Работа с Square
        Shape s4 = new Square(6.6);
        System.out.println("9. " + s4);
        System.out.println("10. Площадь квадрата: " + s4.getArea());

        // 6. Преобразования между Square и Rectangle
        Rectangle r2 = (Rectangle) s4; // Square -> Rectangle
        Square sq1 = (Square) r2;      // Rectangle -> Square
        System.out.println("11. Сторона квадрата: " + sq1.getSide());
    }
}
