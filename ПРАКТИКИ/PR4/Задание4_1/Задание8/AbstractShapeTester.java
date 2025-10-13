package PR4.Задание4_1.Задание8;
public class AbstractShapeTester {
    public static void main(String[] args) {
        // Создание экземпляров подклассов
        AbstractShape circle = new AbstractCircle(7.0, "yellow", true);
        AbstractShape rectangle = new AbstractRectangle(5.0, 10.0, "orange", false);
        AbstractShape square = new AbstractSquare(6.0, "purple", true);

        System.out.println("--- Информация о фигурах ---");
        System.out.println(circle);
        System.out.println("  Площадь: " + circle.getArea());
        System.out.println("  Периметр: " + circle.getPerimeter());

        System.out.println("\n" + rectangle);
        System.out.println("  Площадь: " + rectangle.getArea());
        System.out.println("  Периметр: " + rectangle.getPerimeter());

        System.out.println("\n" + square);
        System.out.println("  Площадь: " + square.getArea());
        System.out.println("  Периметр: " + square.getPerimeter());

        // Демонстрация использования переменной суперкласса для ссылки на объект подкласса
        System.out.println("\n--- Использование полиморфизма ---");
        AbstractShape[] shapes = new AbstractShape[3];
        shapes[0] = new AbstractCircle(3.0, "pink", false);
        shapes[1] = new AbstractRectangle(2.0, 8.0, "brown", true);
        shapes[2] = new AbstractSquare(4.0, "cyan", false);

        for (AbstractShape s : shapes) {
            System.out.println("\n" + s);
            System.out.println("  Площадь: " + s.getArea());
            System.out.println("  Периметр: " + s.getPerimeter());
        }

        // Попытка создать экземпляр абстрактного класса (вызовет ошибку компиляции)
        // AbstractShape invalidShape = new AbstractShape("black", true);
        // System.out.println(invalidShape);
    }
}