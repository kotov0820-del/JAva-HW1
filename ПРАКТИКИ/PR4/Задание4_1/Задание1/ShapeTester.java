package PR4.Задание4_1.Задание1;

public class ShapeTester {
    public static void main(String[] args) {
        // Создаем объекты разных фигур
        Shape s1 = new Circle(5.0, "red", true);
        Shape s2 = new Rectangle(4.0, 6.0, "blue", false);
        Shape s3 = new Square(3.0, "green", true);

        // Демонстрируем вызов методов через родительскую ссылку
        System.out.println("--- Информация о фигурах (через родительскую ссылку) ---");
        printShapeInfo(s1);
        printShapeInfo(s2);
        printShapeInfo(s3);

        // Объяснение работы программы:
        System.out.println("\n--- Объяснение работы ---");
        System.out.println("Мы создаем объекты Circle, Rectangle и Square, но сохраняем их в переменные типа Shape (родительского класса).");
        System.out.println("Это демонстрирует полиморфизм в Java. Хотя переменные имеют тип Shape,");
        System.out.println("вызываемые методы (getType(), getArea(), getPerimeter(), toString()) являются");
        System.out.println("переопределенными версиями из соответствующих дочерних классов (Circle, Rectangle, Square).");
        System.out.println("Это означает, что во время выполнения JVM определяет фактический тип объекта и вызывает правильную реализацию метода.");
        System.out.println("Например, при вызове s1.getArea(), вызывается метод getArea() из класса Circle, а не из класса Shape.");
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println("\nФигура: " + shape.getType());
        System.out.println("  Цвет: " + shape.getColor());
        System.out.println("  Залита: " + shape.isFilled());
        System.out.println("  Площадь: " + shape.getArea());
        System.out.println("  Периметр: " + shape.getPerimeter());
        System.out.println("  toString(): " + shape.toString());
    }
}