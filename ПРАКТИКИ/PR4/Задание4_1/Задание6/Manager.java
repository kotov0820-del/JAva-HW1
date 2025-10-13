package PR4.Задание4_1.Задание6;
public class Manager extends Employer {
    private double averageSumSales; // Средняя сумма дополнительных выплат за продажи

    public Manager(String firstName, String lastName, double income, double averageSumSales) {
        super(firstName, lastName, income);
        this.averageSumSales = averageSumSales;
    }

    public double getAverageSumSales() {
        return averageSumSales;
    }

    // г) Переопределить этот метод в классе Manager и добавить к доходу сумму с продаж.
    @Override
    public double getIncome() {
        return super.getIncome() + averageSumSales; // Добавляем сумму с продаж к доходу родителя
    }

    @Override
    public String toString() {
        return "Manager [Name=" + getFirstName() + " " + getLastName() + ", Income=" + getIncome() + ", SalesBonus=" + averageSumSales + "]";
    }
}