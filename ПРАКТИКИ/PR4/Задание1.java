package PR4;
public enum Задание1 {
    SPRING("Холодное время года", 10),
    SUMMER("Теплое время года", 25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("Холодное время года", 12),
    WINTER("Холодное время года", -5);

    private final String description;
    private final int averageTemperature;

    // Конструктор
    Задание1(String description, int averageTemperature) {
        this.description = description;
        this.averageTemperature = averageTemperature;
    }

    // Геттер для средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Метод getDescription
    public String getDescription() {
        return description;
    }

    // Метод для вывода информации в зависимости от времени года
    public static void printFavoriteSeason(Задание1 season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Осень - красивое время года.");
                break;
            case WINTER:
                System.out.println("Зима - время снега и праздников.");
                break;
            case SPRING:
                System.out.println("Весна - время пробуждения природы.");
                break;
        }
    }

    public static void main(String[] args) {
        // 1) Создать переменную, содержащую ваше любимое время года и распечатать всю информацию о нем.
        Задание1 myFavoriteSeason = Задание1.SUMMER;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + myFavoriteSeason.getDescription());
        System.out.println("Порядковый номер: " + myFavoriteSeason.ordinal());
        System.out.println("Название константы: " + myFavoriteSeason.name());
        System.out.println("--------------------");

        // 2) Создать метод, который принимает на вход переменную созданного вами enum типа...
        printFavoriteSeason(myFavoriteSeason);
        System.out.println("--------------------");

        // 6) В цикле распечатать все времена года, среднюю температуру и описание времени года
        System.out.println("Информация по всем временам года:");
        for (Задание1 s : Задание1.values()) {
            System.out.printf("Время года: %s, Средняя температура: %d°C, Описание: %s%n",
                    s, s.getAverageTemperature(), s.getDescription());
        }
    }
}