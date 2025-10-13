package PR3.Задание2;
public class TestMovable {
    public static void main(String[] args) {
        System.out.println("--- Тестирование MovablePoint ---");
        MovablePoint mp1 = new MovablePoint(0, 0, 10, 5);
        System.out.println(mp1);
        mp1.moveRight();
        mp1.moveDown();
        System.out.println(mp1);

        System.out.println("\n--- Тестирование MovableCircle ---");
        MovableCircle mc1 = new MovableCircle(10, 10, 2, 3, 5);
        System.out.println(mc1);
        mc1.moveUp();
        mc1.moveRight();
        System.out.println(mc1);

        System.out.println("\n--- Тестирование MovableRectangle ---");
        MovableRectangle mr1 = new MovableRectangle(0, 10, 10, 0, 2, 2); // x1, y1, x2, y2, xSpeed, ySpeed
        System.out.println(mr1);
        mr1.moveRight();
        mr1.moveDown();
        System.out.println(mr1);

        // Пример с разными скоростями для MovableRectangle (должно вызвать исключение)
        try {
            System.out.println("\n--- Тестирование MovableRectangle с разными скоростями (ожидаем ошибку) ---");
            MovableRectangle mr2 = new MovableRectangle(0, 10, 10, 0, 2, 3); // xSpeed=2, ySpeed=3 (разные)
            System.out.println(mr2);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n--- Полиморфизм с интерфейсом Movable ---");
        Movable m1 = new MovablePoint(50, 50, 1, 1);
        Movable m2 = new MovableCircle(100, 100, 5, 5, 10);
        Movable m3 = new MovableRectangle(20, 30, 40, 10, 1, 1);

        System.out.println("MovablePoint до движения: " + m1);
        m1.moveUp();
        m1.moveLeft();
        System.out.println("MovablePoint после движения: " + m1);

        System.out.println("MovableCircle до движения: " + m2);
        m2.moveDown();
        m2.moveRight();
        System.out.println("MovableCircle после движения: " + m2);

        System.out.println("MovableRectangle до движения: " + m3);
        m3.moveUp();
        m3.moveLeft();
        System.out.println("MovableRectangle после движения: " + m3);
    }
}