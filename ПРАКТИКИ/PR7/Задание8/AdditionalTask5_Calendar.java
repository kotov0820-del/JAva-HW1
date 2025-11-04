package PR7.Задание8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AdditionalTask5_Calendar {

    public static void main(String[] args) {
        System.out.println("--- Тест Задания 8 (Доп. 5): Класс GregorianCalendar ---");

        // 1. Создаем объект GregorianCalendar для текущей даты
        GregorianCalendar calendar = new GregorianCalendar();

        // Отображаем текущий год, месяц и день
        System.out.println("1. Текущая дата:");
        // get(Calendar.MONTH) возвращает месяц от 0 (Январь) до 11 (Декабрь), поэтому прибавляем 1
        System.out.println("   Год: " + calendar.get(Calendar.YEAR));
        System.out.println("   Месяц: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("   День: " + calendar.get(Calendar.DAY_OF_MONTH));

        // 2. Установка заданного времени в миллисекундах
        long specifiedTime = 1234567898765L; // Заданное значение
        calendar.setTimeInMillis(specifiedTime);

        // Отображаем новую дату
        System.out.println("\n2. Дата после установки setTimeInMillis(1234567898765L):");
        System.out.println("   Год: " + calendar.get(Calendar.YEAR));
        System.out.println("   Месяц: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("   День: " + calendar.get(Calendar.DAY_OF_MONTH));
    }
}