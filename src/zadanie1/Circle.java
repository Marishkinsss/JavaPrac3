package zadanie1;

public class Circle extends Shape {
    protected double radius; // радиус круга

    // Конструкторы
    public Circle() {
        super(); // вызываем конструктор родителя
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // передаем параметры в родительский класс
        this.radius = radius;
    }

    // Геттер и сеттер для радиуса
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // РЕАЛИЗУЕМ абстрактные методы:
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // πr²
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // 2πr
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }
}
