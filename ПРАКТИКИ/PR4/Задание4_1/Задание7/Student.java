package PR4.Задание4_1.Задание7;
public class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return "Учащийся";
    }

    @Override
    public String toString() {
        return getType() + ": " + name + ", Возраст: " + age + ", ID: " + id;
    }
}