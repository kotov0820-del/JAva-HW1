package PR4.Задание4_1.Задание2;
public class PhoneTester {
    public static void main(String[] args) {
        // 1) Создайте три экземпляра этого класса.
        Phone phone1 = new Phone("123-45-67", "iPhone 13", 173.0);
        Phone phone2 = new Phone("987-65-43", "Samsung Galaxy S22"); // Используем конструктор с двумя параметрами
        Phone phone3 = new Phone(); // Используем конструктор без параметров

        // 2) Выведите на консоль значения их переменных.
        System.out.println("\n--- Информация о телефонах ---");
        System.out.println("Телефон 1: Номер=" + phone1.getNumber() + ", Модель=" + phone1.getModel() + ", Вес=" + phone1.getWeight() + "г");
        System.out.println("Телефон 2: Номер=" + phone2.getNumber() + ", Модель=" + phone2.getModel() + ", Вес=" + phone2.getWeight() + "г");
        System.out.println("Телефон 3: Номер=" + phone3.getNumber() + ", Модель=" + phone3.getModel() + ", Вес=" + phone3.getWeight() + "г");

        // 6) Вызвать receiveCall() и getNumber() для каждого из объектов.
        System.out.println("\n--- Вызовы методов ---");
        System.out.println("Для телефона 1:");
        phone1.receiveCall("Алиса");
        System.out.println("  Номер: " + phone1.getNumber());

        System.out.println("\nДля телефона 2:");
        phone2.receiveCall("Боб");
        System.out.println("  Номер: " + phone2.getNumber());

        System.out.println("\nДля телефона 3:");
        phone3.receiveCall("Чарли");
        System.out.println("  Номер: " + phone3.getNumber());

        // 12) Вызвать перегруженный метод receiveCall.
        System.out.println("\n--- Вызов перегруженного метода receiveCall ---");
        phone1.receiveCall("Дэвид", "555-12-34");

        // 13) и 14) Создать метод sendMessage с аргументами переменной длины.
        System.out.println("\n--- Отправка сообщений ---");
        phone1.sendMessage("111-22-33", "444-55-66");
        phone2.sendMessage("777-88-99", "000-11-22", "333-44-55");
        phone3.sendMessage("666-77-88");
    }
}