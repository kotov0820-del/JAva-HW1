package PR6.Задание6;

import PR6.Задание5.StringWorker;

// Класс ProcessStrings, реализующий StringWorker (Задание 6) [cite: 118]
public class ProcessStrings implements StringWorker {

    // а) Подсчет символов
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    // б) Символы на нечетных позициях (1, 3, 5... -> индексы 0, 2, 4...)
    @Override
    public String oddPositionChars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    // в) Инвертирование строки
    @Override
    public String invertString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // main для тестирования Заданий 5, 6
    public static void main(String[] args) {
        System.out.println("--- Тест Заданий 5, 6: ProcessStrings ---");

        StringWorker sw = new ProcessStrings();
        String testString = "ABCDEFGHIJ";

        // 1. Тест подсчета символов
        System.out.println("Длина '" + testString + "': " + sw.countCharacters(testString)); // 10

        // 2. Тест нечетных позиций (A, C, E, G, I)
        System.out.println("Символы (1, 3, 5...): " + sw.oddPositionChars(testString)); // ACEGI

        // 3. Тест инвертирования
        System.out.println("Инвертированная строка: " + sw.invertString(testString)); // JIHGFEDCBA
    }
}