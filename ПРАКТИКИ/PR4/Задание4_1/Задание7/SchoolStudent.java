package PR4.Задание4_1.Задание7;
public class SchoolStudent extends Student {
    private String className; // Класс (например, 10 "А")

    public SchoolStudent(String name, int age, String id, String className) {
        super(name, age, id);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String getType() {
        return "Школьник";
    }

    @Override
    public String toString() {
        return super.toString() + ", Класс: " + className;
    }
}