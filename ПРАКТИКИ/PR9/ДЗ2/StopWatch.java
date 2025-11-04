package PR9.ДЗ2; // Используем подходящий пакет или удаляем, если не нужен

/**
 * Класс StopWatch для представления секундомера.
 */
public class StopWatch {
    // Скрытые поля данных для хранения времени.
    // Хранят время в миллисекундах (System.currentTimeMillis()).
    private long startTime; // [cite: 269]
    private long endTime; // [cite: 269]

    /**
     * Безаргументный конструктор, который инициализирует startTime текущим временем. [cite: 270]
     */
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // --- Getter-методы [cite: 269] ---

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // --- Методы функционала секундомера ---

    /**
     * Метод с именем start(), который сбрасывает startTime до текущего времени. [cite: 271]
     */
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * Метод с именем stop(), который присваивает endTime текущее время. [cite: 272]
     */
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    /**
     * Метод с именем getElapsedTime(), который возвращает прошедшее
     * время на секундомере в миллисекундах (endTime - startTime). [cite: 273]
     */
    public long getElapsedTime() {
        return endTime - startTime;
    }
}