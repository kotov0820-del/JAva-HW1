package PR7.Задание3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Student {
    private String name;
    private int id;
    private Date birthDate; // Поле для хранения даты рождения

    public Student(String name, int id, Date birthDate) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
    }

    // Метод, возвращающий строковое представление даты по заданному формату
    public String getFormattedBirthDate(String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.getDefault());
        return formatter.format(birthDate);
    }

    // Переписанный метод toString()
    @Override
    public String toString() {
        // Используем средний формат в toString()
        String formattedDate = getFormattedBirthDate("dd MMMM yyyy");

        return String.format(
                "Студент: %s (ID: %d), Дата рождения: %s",
                name, id, formattedDate
        );
    }

    // main для тестирования Задания 3
    public static void main(String[] args) {
        System.out.println("--- Тест Задания 3: Класс Student ---");

        // Создание даты: 15 мая 2003 года (4 - т.к. в Date месяцы 0-11)
        Date bd = new Date(2003 - 1900, 4, 15);
        Student student = new Student("Петров И.С.", 12345, bd);

        System.out.println("1. Вывод toString():");
        System.out.println(student);

        System.out.println("\n2. Примеры форматирования даты:");

        // Короткий формат
        System.out.println("   - Короткий (dd.MM.yyyy): " + student.getFormattedBirthDate("dd.MM.yyyy"));

        // Средний формат
        System.out.println("   - Средний (d MMM yyyy): " + student.getFormattedBirthDate("d MMM yyyy"));

        // Полный формат (включая день недели и время)
        System.out.println("   - Полный (EEEE, d MMMM yyyy): " + student.getFormattedBirthDate("EEEE, d MMMM yyyy"));
    }
}