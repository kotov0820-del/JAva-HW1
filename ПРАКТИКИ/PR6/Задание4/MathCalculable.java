package PR6.Задание4;

// Интерфейс MathCalculable (Задание 4)
public interface MathCalculable {
    // Число PI (public static final по умолчанию) [cite: 111]
    double PI = Math.PI;

    // Объявления математических функций [cite: 111]
    double power(double base, double exponent); // Возведение в степень
    double complexModulus(double real, double imaginary); // Модуль комплексного числа
}