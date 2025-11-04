package PR7.Задание1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Task1_DeveloperInfo {

    public static void main(String[] args) {
        System.out.println("--- Тест Задания 1: Сроки работы ---");

        String developerSurname = "Ваша Фамилия"; // Укажите свою фамилию

        // Дата и время получения задания (задана вручную для примера)
        // Используем старый конструктор для демонстрации получения "прошлой" даты,
        // но Date() для текущей даты
        Date receiveDate = new Date(125, 10, 5, 10, 0, 0); // 5 ноября 2025, 10:00:00

        // Дата и время сдачи задания (текущее время)
        Date submissionDate = new Date();

        // Формат для красивого вывода
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + formatter.format(receiveDate));
        System.out.println("Дата и время сдачи задания (текущее): " + formatter.format(submissionDate));
    }
}