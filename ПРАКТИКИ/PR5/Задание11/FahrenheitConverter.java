package PR5.Задание11;

public class FahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    public static void main(String[] args) {
        System.out.println("\n--- Задание 11: Convertable (Тест) ---");
        double celsius = 25.0;

        Convertable kelvinConverter = new KelvinConverter();
        Convertable fahrenheitConverter = new FahrenheitConverter();

        System.out.println("Исходная температура: " + celsius + "°C");
        System.out.println("В Кельвинах: " + kelvinConverter.convert(celsius) + "K");
        System.out.println("В Фаренгейтах: " + fahrenheitConverter.convert(celsius) + "°F");
    }
}