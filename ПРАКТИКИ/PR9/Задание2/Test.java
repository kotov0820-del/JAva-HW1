package PR9.Задание2;

public class Test {
    int count;
    // public void main(String args) { // Грамматическая ошибка: main должен быть static
    public static void main(String[] args) { // Исправленный main метод

    }

    public int getCount() { return count; }

    public static int factorial(int n) { // <-- Здесь нужен static
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}