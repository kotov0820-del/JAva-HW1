package PR7.Задание7;

import java.util.Random;

public class AdditionalTask4_RandomGenerator {

    public static void main(String[] args) {
        System.out.println("--- Тест Задания 7 (Доп. 4): Класс Random ---");

        // Создаем объект Random с начальным значением (seed) 1000
        Random generator = new Random(1000);

        System.out.println("Первые 50 случайных целых чисел (0-99) с seed=1000:");

        for (int i = 0; i < 50; i++) {
            // nextInt(100) генерирует числа от 0 до 99 включительно
            int randomNumber = generator.nextInt(100);

            // Форматированный вывод
            System.out.printf("%3d ", randomNumber);

            // Переход на новую строку после каждых 10 чисел
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}