package PR4.Задание4_1.Задание7;
public class UniversityStudent extends Student {
    private String major; // Специальность
    private int year;     // Курс обучения

    public UniversityStudent(String name, int age, String id, String major, int year) {
        super(name, age, id);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String getType() {
        return "Студент";
    }

    @Override
    public String toString() {
        return super.toString() + ", Специальность: " + major + ", Курс: " + year;
    }
}