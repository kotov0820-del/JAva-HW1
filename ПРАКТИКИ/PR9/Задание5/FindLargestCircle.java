package PR9.Задание5;

import PR3.Задание1.Circle;

import java.util.Random;

// Предполагаем, что класс Shape определен и доступен.

public class FindLargestCircle {

    /**
     * Создает массив объектов типа Circle со случайными радиусами (от 1.0 до 10.0).
     * @param size Размер массива.
     * @return Массив объектов Circle.
     */
    public static Circle[] createCircleArray(int size) {
        Circle[] circleArray = new Circle[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Генерируем случайный радиус от 1.0 до 10.0
            double randomRadius = 1.0 + (10.0 - 1.0) * random.nextDouble();

            // Используем конструктор Circle(double radius)
            circleArray[i] = new Circle(randomRadius);
        }
        return circleArray;
    }

    /**
     * Находит и возвращает круг с наибольшей площадью в массиве.
     * @param circleArray Массив кругов.
     * @return Объект Circle с наибольшей площадью.
     */
    public static Circle findLargestCircle(Circle[] circleArray) {
        if (circleArray == null || circleArray.length == 0) {
            return null;
        }

        Circle largestCircle = circleArray[0];
        double maxArea = largestCircle.getArea();

        for (int i = 1; i < circleArray.length; i++) {
            Circle currentCircle = circleArray[i];
            double currentArea = currentCircle.getArea();

            if (currentArea > maxArea) {
                maxArea = currentArea;
                largestCircle = currentCircle;
            }
        }
        return largestCircle;
    }

    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;

        // 1. Создаем массив объектов Circle
        Circle[] circles = createCircleArray(ARRAY_SIZE);

        // Отображаем все созданные круги
        System.out.println("--- Список созданных кругов ---");
        for (int i = 0; i < circles.length; i++) {
            System.out.printf("Круг %d: Радиус = %.2f, Площадь = %.2f%n",
                    i + 1, circles[i].getRadius(), circles[i].getArea());
        }
        System.out.println("--------------------------------");

        // 2. Находим круг с самой большой площадью
        Circle largest = findLargestCircle(circles);

        if (largest != null) {
            System.out.println("\n🎉 Круг с самой большой площадью найден!");
            System.out.printf("Радиус: %.2f%n", largest.getRadius());
            System.out.printf("Площадь: %.2f%n", largest.getArea());
            System.out.println("Детали объекта: " + largest.toString());
        } else {
            System.out.println("Массив кругов пуст.");
        }
    }
}
