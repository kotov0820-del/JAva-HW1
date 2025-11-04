package PR7.Задание6;

import java.util.Date;

public class AdditionalTask3_DateSetter {

    public static void main(String[] args) {
        System.out.println("--- Тест Задания 6 (Доп. 3): Класс Date (setTime) ---");

        // Перечень миллисекунд с 1 января 1970 г., 00:00:00 GMT
        long[] elapsedTimes = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L
        };

        Date date = new Date();

        System.out.println("Установка времени (мс с 01.01.1970 GMT):");

        for (long time : elapsedTimes) {
            // Устанавливаем новое время
            date.setTime(time);

            // Выводим результат с помощью метода toString()
            System.out.printf("Time: %12d ms -> Date: %s\n", time, date.toString());
        }
    }
}