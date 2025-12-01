package zadanie1;

public class Square extends Rectangle {

    // Конструкторы
    public Square() {
        super(); // вызываем конструктор Rectangle
    }

    public Square(double side) {
        super(side, side); // у квадрата width = length = side
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Дополнительные методы для квадрата
    public double getSide() {
        return width; // или length - они одинаковые
    }

    public void setSide(double side) {
        // Устанавливаем обе стороны одинаковыми
        this.width = side;
        this.length = side;
    }

    // Переопределяем сеттеры из Rectangle
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[side=" + width + ", color=" + color + ", filled=" + filled + "]";
    }
}
