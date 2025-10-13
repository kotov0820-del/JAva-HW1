package PR4.Задание4_1.Задание3;
public class PersonTester {
    public static void main(String[] args) {
        // Создайте два объекта этого класса.
        // Один объект инициализируется конструктором Person()
        Person person1 = new Person();
        // другой - Person(fullName, age).
        Person person2 = new Person("Иванов Иван", 30);

        System.out.println("\n--- Информация о персонах ---");
        System.out.println("Персона 1: ФИО=" + person1.getFullName() + ", Возраст=" + person1.getAge());
        System.out.println("Персона 2: ФИО=" + person2.getFullName() + ", Возраст=" + person2.getAge());

        System.out.println("\n--- Действия персон ---");
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}