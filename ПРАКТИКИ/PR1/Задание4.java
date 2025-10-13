package PR1;

public class Задание4 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        double sum = 0.0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
            System.out.printf("H%d = %.4f%n", i, sum);
        }
    }
}
