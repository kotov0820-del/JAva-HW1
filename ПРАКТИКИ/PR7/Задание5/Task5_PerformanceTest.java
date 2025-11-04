package PR7.Задание5;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task5_PerformanceTest {

    private static final int NUM_ELEMENTS = 100000;

    // Вспомогательный метод для замера времени операции
    private static void measure(String operation, List<Integer> list, Runnable action) {
        long startTime = System.currentTimeMillis();
        action.run();
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.printf("  %s: %d ms\n", operation, estimatedTime);
    }

    private static void runTest(List<Integer> list, String name) {
        System.out.println("\n--- Тест для " + name + " (N=" + NUM_ELEMENTS + ") ---");

        // 1. Добавление в конец (Операция добавления)
        list.clear();
        measure("1. Добавление в конец", list, () -> {
            for (int i = 0; i < NUM_ELEMENTS; i++) {
                list.add(i);
            }
        });

        // 2. Вставка в начало (Операция вставки)
        list.clear();
        measure("2. Вставка в начало", list, () -> {
            for (int i = 0; i < NUM_ELEMENTS; i++) {
                list.add(0, i);
            }
        });

        // 3. Поиск по образцу (имитация поиска get(N/2))
        // Сначала заполним список для корректного поиска
        list.clear();
        for (int i = 0; i < NUM_ELEMENTS; i++) { list.add(i); }

        measure("3. Поиск по образцу (get(N/2))", list, () -> {
            // Имитация поиска - получение элемента по индексу
            list.get(NUM_ELEMENTS / 2);
        });

        // 4. Удаление из начала (Операция удаления)
        // Удаляем небольшое количество для демонстрации, сохраняя большую часть списка
        measure("4. Удаление из начала (1000 элементов)", list, () -> {
            for (int i = 0; i < 1000; i++) {
                list.remove(0);
            }
        });
    }

    // main для тестирования Задания 5
    public static void main(String[] args) {
        System.out.println("--- Тест Задания 5: Сравнение производительности ---");

        runTest(new ArrayList<>(), "ArrayList");
        runTest(new LinkedList<>(), "LinkedList");

        System.out.println("\n*** Выводы (зависят от машины): ***");
        System.out.println("- ArrayList обычно быстрее для 'Добавления в конец' и 'Поиска по индексу'.");
        System.out.println("- LinkedList обычно быстрее для 'Вставки' и 'Удаления' из начала/середины.");
    }
}