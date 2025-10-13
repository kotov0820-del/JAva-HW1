package PR4.Задание4_1.Задание6;
public class CompanyTester {
    public static void main(String[] args) {
        // б) Создать переменную типа Employer, которая ссылается на объект типа Manager.
        Employer managerAsEmployer = new Manager("Олег", "Иванов", 50000, 10000);
        System.out.println("Менеджер как Employer: " + managerAsEmployer.getIncome());

        // г) Создать массив типа Employer, содержащий объекты класса Employer и Manager.
        Employer[] employees = new Employer[4];
        employees[0] = new Employer("Анна", "Петрова", 30000);
        employees[1] = new Manager("Борис", "Сидоров", 60000, 15000);
        employees[2] = new Employer("Светлана", "Кузнецова", 35000);
        employees[3] = new Manager("Дмитрий", "Морозов", 70000, 20000);

        System.out.println("\n--- Информация о сотрудниках ---");
        // г) Вызвать метод getIncome() для каждого элемента массива.
        for (Employer emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " (Тип: " + emp.getClass().getSimpleName() + "): Годовой доход = " + emp.getIncome());
        }

        System.out.println("\n--- Подробная информация (используя toString) ---");
        for (Employer emp : employees) {
            System.out.println(emp);
        }
    }
}