package PR5.Задание11;

public class KelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}