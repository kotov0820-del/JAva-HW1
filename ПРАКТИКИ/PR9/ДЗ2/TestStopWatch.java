package PR9.ДЗ2;

import java.util.Random;

public class TestStopWatch {

    public static void main(String[] args) {
        final int SIZE = 100000;
        int[] numbers = generateRandomArray(SIZE);

        System.out.println("Начало измерения времени сортировки...");
        System.out.println("Количество элементов для сортировки: " + SIZE);

        // Создаем секундомер. Конструктор уже запустил его (установил startTime)
        StopWatch timer = new StopWatch();

        // Перезапускаем таймер, чтобы быть уверенными, что время отсчитывается с этого момента
        timer.start(); // [cite: 271]

        // Выполняем сортировку
        selectionSort(numbers);

        // Останавливаем таймер
        timer.stop(); // [cite: 272]

        // Вычисляем и отображаем результат
        long elapsed = timer.getElapsedTime(); // [cite: 273]

        System.out.println("Сортировка завершена!");
        System.out.println("Время, затраченное на сортировку (методом выбора):");
        System.out.println("-> " + elapsed + " миллисекунд.");
        System.out.println("-> " + (elapsed / 1000.0) + " секунд.");
    }

    /**
     * Создает массив указанного размера со случайными числами.
     */
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000000); // Случайное число до 1,000,000
        }
        return arr;
    }

    /**
     * Метод сортировки выбором (Selection Sort).
     */
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Найти минимум в оставшейся части list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Поменять местами list[i] с list[currentMinIndex], если необходимо
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
