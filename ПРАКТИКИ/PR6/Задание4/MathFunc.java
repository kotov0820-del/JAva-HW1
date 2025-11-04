package PR6.Задание4;

// Класс MathFunc, реализующий MathCalculable (Задание 4) [cite: 112]
public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        // |z| = sqrt(a^2 + b^2)
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Дополнительный метод: вычисление длины окружности [cite: 112]
    public double circleLength(double radius) {
        // Используем PI из интерфейса
        return 2 * PI * radius;
    }

    // main для тестирования Задания 4
    public static void main(String[] args) {
        System.out.println("--- Тест Задания 4: MathFunc ---");

        MathCalculable mc = new MathFunc(); // Правильно [cite: 115]

        // 1. Тест PI
        System.out.println("Значение PI из интерфейса: " + MathCalculable.PI);

        // 2. Тест возведения в степень
        System.out.println("2 в степени 10: " + mc.power(2, 10)); // 1024.0

        // 3. Тест модуля комплексного числа (4 + 3i)
        System.out.println("Модуль числа 4 + 3i: " + mc.complexModulus(4, 3)); // 5.0

        // 4. Тест длины окружности
        MathFunc mf = (MathFunc) mc;
        System.out.println("Длина окружности (R=5): " + mf.circleLength(5));
    }
}