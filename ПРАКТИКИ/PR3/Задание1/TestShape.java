package PR3.Задание1;
public class TestShape {
    public static void main(String[] args) {
        System.out.println("--- Тестирование Circle ---");
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // Вызывает Circle.toString()
        System.out.println("Area: " + s1.getArea()); // Вызывает Circle.getArea()
        System.out.println("Perimeter: " + s1.getPerimeter()); // Вызывает Circle.getPerimeter()
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        // System.out.println(s1.getRadius()); // Ошибка компиляции: getRadius() не определен в Shape

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius()); // Теперь доступен

        // Shape s2 = new Shape(); // Ошибка компиляции: Shape является абстрактным

        System.out.println("\n--- Тестирование Rectangle ---");
        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", true); // Upcast Rectangle to Shape
        System.out.println(s3); // Вызывает Rectangle.toString()
        System.out.println("Area: " + s3.getArea()); // Вызывает Rectangle.getArea()
        System.out.println("Perimeter: " + s3.getPerimeter()); // Вызывает Rectangle.getPerimeter()
        System.out.println("Color: " + s3.getColor());
        // System.out.println(s3.getLength()); // Ошибка компиляции: getLength() не определен в Shape

        Rectangle r1 = (Rectangle) s3; // Downcast back to Rectangle
        System.out.println(r1);
        System.out.println("Length: " + r1.getLength()); // Теперь доступен

        System.out.println("\n--- Тестирование Square ---");
        Shape s4 = new Square(6.6, "YELLOW", true); // Upcast Square to Shape
        System.out.println(s4); // Вызывает Square.toString()
        System.out.println("Area: " + s4.getArea()); // Вызывает Square.getArea() (унаследовано)
        System.out.println("Color: " + s4.getColor());
        // System.out.println(s4.getSide()); // Ошибка компиляции: getSide() не определен в Shape

        Rectangle r2 = (Rectangle) s4; // Downcast Square to Rectangle
        System.out.println(r2); // Вызывает Square.toString()
        System.out.println("Width (from Square): " + r2.getWidth()); // Использует метод Square
        // System.out.println(r2.getSide()); // Ошибка компиляции: getSide() не определен в Rectangle

        Square sq1 = (Square) r2; // Downcast Rectangle back to Square
        System.out.println(sq1); // Вызывает Square.toString()
        System.out.println("Side: " + sq1.getSide()); // Теперь доступен
        sq1.setSide(8.0);
        System.out.println("New side: " + sq1.getSide());
        System.out.println("New area: " + sq1.getArea());
    }
}
