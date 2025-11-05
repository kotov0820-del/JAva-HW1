package PR14.Задание1_2_3_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesApp {

    private static final String FILE_NAME = "data.txt";

    public static void main(String[] args) {

        // Используем один Scanner для всей программы
        Scanner scanner = new Scanner(System.in);

        // =================================================================
        // 1. Реализовать запись в файл введённой с клавиатуры информации
        // (Создает/перезаписывает файл)
        // =================================================================
        System.out.println("--- ЗАДАНИЕ 1: ЗАПИСЬ (СОЗДАНИЕ) ФАЙЛА ---");
        writeToNewFile(scanner);

        // =================================================================
        // 2. Реализовать вывод информации из файла на экран
        // =================================================================
        System.out.println("\n--- ЗАДАНИЕ 2: ЧТЕНИЕ И ВЫВОД ФАЙЛА ---");
        readAndDisplayFileContent();

        // =================================================================
        // 3. Заменить информацию в файле на информацию, введённую с клавиатуры
        // (Это по сути то же, что и Задание 1, но с другим названием)
        // =================================================================
        System.out.println("\n--- ЗАДАНИЕ 3: ЗАМЕНА (ПЕРЕЗАПИСЬ) ФАЙЛА ---");
        writeToNewFile(scanner);
        System.out.println("\nПроверяем файл после замены:");
        readAndDisplayFileContent();

        // =================================================================
        // 4. Добавить в конец исходного файла текст, введённый с клавиатуры
        // =================================================================
        System.out.println("\n--- ЗАДАНИЕ 4: ДОБАВЛЕНИЕ (APPEND) В КОНЕЦ ФАЙЛА ---");
        appendToFile(scanner);
        System.out.println("\nПроверяем файл после добавления:");
        readAndDisplayFileContent();

        scanner.close();
    }

    /** Получает строку от пользователя для файловых операций. */
    private static String getUserInput(Scanner scanner) {
        System.out.print("Введите текст: ");
        return scanner.nextLine();
    }

    /**
     * Записывает (перезаписывает) информацию в файл.
     * Использует FileWriter с флагом append=false по умолчанию.
     */
    private static void writeToNewFile(Scanner scanner) {
        String data = getUserInput(scanner);
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) { // false = перезаписать
            writer.write(data);
            System.out.println("[Успех] Файл '" + FILE_NAME + "' успешно записан/перезаписан.");
        } catch (IOException e) {
            System.out.println("[Ошибка] Не удалось записать файл: " + e.getMessage());
        }
    }

    /**
     * Добавляет информацию в конец существующего файла.
     * Использует FileWriter с флагом append=true.
     */
    private static void appendToFile(Scanner scanner) {
        String data = getUserInput(scanner);
        // Добавляем перенос строки, чтобы новый текст был с новой строки
        String contentToAppend = "\n" + data;

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) { // true = добавить в конец (append)
            writer.write(contentToAppend);
            System.out.println("[Успех] Текст успешно добавлен в конец файла '" + FILE_NAME + "'.");
        } catch (IOException e) {
            System.out.println("[Ошибка] Не удалось добавить в файл: " + e.getMessage());
        }
    }

    /**
     * Считывает и выводит содержимое файла на экран.
     * Использует FileReader.
     */
    private static void readAndDisplayFileContent() {
        System.out.println("--- СОДЕРЖИМОЕ ФАЙЛА '" + FILE_NAME + "' ---");
        try (FileReader reader = new FileReader(FILE_NAME)) {
            int character;
            // Читаем посимвольно (read()) до тех пор, пока не встретится -1 (конец файла)
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\n--- КОНЕЦ ФАЙЛА ---");
        } catch (IOException e) {
            System.out.println("[Ошибка] Не удалось прочитать файл: " + e.getMessage());
        }
    }
}