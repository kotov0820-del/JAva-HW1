package PR13.Задание2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Класс Student для Задания 2.
 */
class Student {
    private String name;
    private int iDNumber;
    private double gpa;

    public Student(String name, int iDNumber, double gpa) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', gpa=%.1f, iD=%d}", name, gpa, iDNumber);
    }
}


/**
 * Класс SortingStudentsByGPA (Задание 2), реализующий Comparator<Student>
 * для сортировки студентов по GPA в порядке убывания.
 */
class SortingStudentsByGPA implements Comparator<Student> {

    /**
     * Сравнивает два объекта Student по их GPA в порядке убывания.
     */
    @Override
    public int compare(Student s1, Student s2) {
        // Сортировка по убыванию: s2 сравнивается с s1
        // Если s2 больше s1, результат > 0, и s2 идет перед s1.
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}

/**
 * Тестовый класс для Задания 2: Использование SortingStudentsByGPA 
 * для быстрой сортировки (Arrays.sort).
 */
public class QuickSortGPATask2 {
    public static void main(String[] args) {
        System.out.println("--- Задание 2: Быстрая сортировка по GPA (Comparator, убывание) ---");

        Student[] students = {
                new Student("Олег", 101, 4.5),
                new Student("Светлана", 202, 3.8),
                new Student("Денис", 303, 4.9),
                new Student("Елена", 404, 4.1),
                new Student("Федор", 505, 4.5)
        };

        System.out.println("Исходный массив (до сортировки):");
        System.out.println(Arrays.toString(students));

        // Arrays.sort() выполняет сортировку с использованием предоставленного компаратора.
        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nОтсортированный массив по GPA (Quick Sort, убывание):");
        System.out.println(Arrays.toString(students));
    }
}