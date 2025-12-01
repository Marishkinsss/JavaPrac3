package zadanie1;

public abstract class Shape {
    protected String color;      // цвет фигуры
    protected boolean filled;    // закрашена ли фигура

    // Конструктор по умолчанию
    public Shape() {
        this.color = "blue";
        this.filled = false;
    }

    // Конструктор с параметрами
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Геттеры и сеттеры (обычные методы)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // АБСТРАКТНЫЕ методы - без реализации
    public abstract double getArea();      // площадь
    public abstract double getPerimeter(); // периметр

    // Метод для вывода информации
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
