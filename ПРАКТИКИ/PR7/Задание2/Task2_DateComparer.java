package PR7.Задание2;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Task2_DateComparer {

    public static void main(String[] args) {
        System.out.println("--- Тест Задания 2: Сравнение дат ---");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date currentDate = new Date(); // Текущая дата
        Date userDate = null;

        System.out.println("Текущая дата: " + formatter.format(currentDate));
        System.out.print("Введите дату для сравнения в формате ДД.ММ.ГГГГ (напр., 01.01.2025): ");
        String dateString = scanner.nextLine();

        try {
            userDate = formatter.parse(dateString);

            System.out.println("\nСравнение даты " + formatter.format(userDate) + " с текущей:");

            // 1. Сравнение с использованием before/after
            if (userDate.before(currentDate)) {
                System.out.println("1. Дата пользователя раньше текущей (before: true).");
            } else if (userDate.after(currentDate)) {
                System.out.println("1. Дата пользователя позже текущей (after: true).");
            } else {
                System.out.println("1. Даты равны.");
            }

            // 2. Сравнение с использованием compareTo
            int comparison = userDate.compareTo(currentDate);
            System.out.print("2. Результат compareTo(): " + comparison + ". Значение: ");

            if (comparison < 0) {
                System.out.println("Дата пользователя раньше текущей (отрицательное значение).");
            } else if (comparison > 0) {
                System.out.println("Дата пользователя позже текущей (положительное значение).");
            } else {
                System.out.println("Даты равны (0).");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка: Неверный формат даты. Используйте ДД.ММ.ГГГГ.");
        } finally {
            scanner.close();
        }
    }
}