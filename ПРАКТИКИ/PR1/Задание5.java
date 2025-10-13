package PR1;

public class Задание5 {
    // Метод для вычисления факториала
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // можно поменять на любое число
        long fact = factorial(number);
        System.out.println("Факториал числа " + number + " = " + fact);
    }
}
