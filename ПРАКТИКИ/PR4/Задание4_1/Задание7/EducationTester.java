package PR4.Задание4_1.Задание7;
import java.util.ArrayList;
import java.util.List;

public class EducationTester {
    public static void main(String[] args) {
        // Создать массив объектов суперкласса Учащийся и заполнить этот массив объектами.
        Student[] students = new Student[5];
        students[0] = new SchoolStudent("Иванов Петр", 15, "SS001", "9A");
        students[1] = new UniversityStudent("Сидорова Анна", 20, "US101", "Информатика", 3);
        students[2] = new SchoolStudent("Козлова Мария", 17, "SS002", "11Б");
        students[3] = new UniversityStudent("Смирнов Сергей", 19, "US102", "Математика", 2);
        students[4] = new SchoolStudent("Федоров Олег", 16, "SS003", "10В");

        System.out.println("--- Все учащиеся ---");
        for (Student s : students) {
            System.out.println(s);
        }

        // Показать отдельно студентов и школьников.
        System.out.println("\n--- Только школьники ---");
        for (Student s : students) {
            if (s instanceof SchoolStudent) {
                System.out.println(s);
            }
        }

        System.out.println("\n--- Только студенты ---");
        for (Student s : students) {
            if (s instanceof UniversityStudent) {
                System.out.println(s);
            }
        }

        // Альтернативный способ с использованием списков для разделения
        List<SchoolStudent> schoolStudentsList = new ArrayList<>();
        List<UniversityStudent> universityStudentsList = new ArrayList<>();

        for (Student s : students) {
            if (s instanceof SchoolStudent) {
                schoolStudentsList.add((SchoolStudent) s);
            } else if (s instanceof UniversityStudent) {
                universityStudentsList.add((UniversityStudent) s);
            }
        }

        System.out.println("\n--- Школьники (из списка) ---");
        for (SchoolStudent ss : schoolStudentsList) {
            System.out.println(ss);
        }

        System.out.println("\n--- Студенты (из списка) ---");
        for (UniversityStudent us : universityStudentsList) {
            System.out.println(us);
        }
    }
}