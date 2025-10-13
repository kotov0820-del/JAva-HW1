package PR4.Задание4_1.Задание3;
public class Person {
    private String fullName;
    private int age;

    // а) поля fullName, age.

    // в) Добавьте два конструктора - Person()
    public Person() {
        this.fullName = "Неизвестный";
        this.age = 0;
        System.out.println("Вызван конструктор Person() без параметров.");
    }

    // в) и Person(fullName, age).
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        System.out.println("Вызван конструктор Person(fullName, age) с параметрами: " + fullName + ", " + age);
    }

    // б) методы move()
    public void move() {
        System.out.println(fullName + " двигается.");
    }

    // б) и talk(), в которых просто вывести на консоль сообщение -"Такой-то Person говорит".
    public void talk() {
        System.out.println(fullName + " говорит.");
    }

    // Геттеры и сеттеры (не обязательны по заданию, но полезны)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}