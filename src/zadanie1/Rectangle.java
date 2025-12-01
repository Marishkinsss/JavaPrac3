package zadanie1;

public class Rectangle extends Shape {
    protected double width;  // ширина
    protected double length; // длина

    // Конструкторы
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Геттеры и сеттеры
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Реализуем абстрактные методы
    @Override
    public double getArea() {
        return width * length; // площадь = ширина × длина
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length); // периметр = 2×(ширина+длина)
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length +
                ", color=" + color + ", filled=" + filled + "]";
    }
}
