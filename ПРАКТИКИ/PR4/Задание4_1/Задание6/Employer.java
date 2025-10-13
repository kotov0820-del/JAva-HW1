package PR4.Задание4_1.Задание6;
public class Employer {
    private String firstName;
    private String lastName;
    protected double income; // Поле для заработной платы

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // в) Создать метод getIncome() для класса Employer, который возвращает заработную плату.
    // Если средняя количество отработанных дней, то сумма дохода умножается на 12.
    // (Предполагается, что "средняя количество отработанных дней" - это абстрактное условие.
    // Для простоты, допустим, если income > 1000, то это условие выполнено, и доход годовой)
    public double getIncome() {
        // Упрощенная логика: если income уже большая, считаем ее месячной и умножаем на 12
        if (income < 10000) { // Примерный порог, чтобы не умножать уже годовой доход
            return income * 12; // Предполагаем месячную зарплату
        }
        return income; // Если доход уже большой, считаем его годовым
    }

    @Override
    public String toString() {
        return "Employer [Name=" + firstName + " " + lastName + ", Income=" + getIncome() + "]";
    }
}
