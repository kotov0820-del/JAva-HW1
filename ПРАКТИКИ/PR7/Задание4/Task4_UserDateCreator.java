package PR7.Задание4;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Task4_UserDateCreator {

    public static void main(String[] args) {
        System.out.println("--- Тест Задания 4: Создание Date и Calendar ---");
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Ввод даты и времени
            System.out.print("Введите год: ");
            int year = scanner.nextInt();
            System.out.print("Введите месяц (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Введите число: ");
            int day = scanner.nextInt();

            System.out.print("Введите часы (0-23): ");
            int hour = scanner.nextInt();
            System.out.print("Введите минуты: ");
            int minute = scanner.nextInt();

            // Создание объекта Calendar (месяцы в Calendar 0-11, поэтому month - 1)
            Calendar calendar = new GregorianCalendar(year, month - 1, day, hour, minute);

            // Создание объекта Date из Calendar
            Date date = calendar.getTime();

            // Форматирование для вывода
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            System.out.println("\n--- Результаты ---");
            System.out.println("Объект Date: " + formatter.format(date));
            System.out.println("Объект Calendar (getTime()): " + formatter.format(calendar.getTime()));

        } catch (Exception e) {
            System.out.println("Произошла ошибка при вводе данных. Убедитесь, что вводите числа.");
        } finally {
            scanner.close();
        }
    }
}