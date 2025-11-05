package PR13.Задание4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Класс Student с собственной реализацией интерфейса Comparable (Задание 4).
 * Естественный порядок определен по полю iDNumber.
 */
class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;
    private double gpa;

    public Student(String name, int iDNumber, double gpa) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    /**
     * Реализация метода compareTo из интерфейса Comparable.
     * Этот метод определяет естественный порядок сортировки (по iDNumber).
     * @param other Другой объект Student для сравнения.
     * @return Отрицательное число, если текущий объект меньше (меньший iDNumber), 
     * ноль, если объекты равны, 
     * положительное число, если текущий объект больше.
     */
    @Override
    public int compareTo(Student other) {
        // Сортировка по возрастанию iDNumber
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', iD=%d}", name, iDNumber);
    }
}

/**
 * Тестовый класс для демонстрации работы Comparable.
 */
public class ComparableTask4 {
    public static void main(String[] args) {
        System.out.println("--- Задание 4: Демонстрация реализации Comparable по iDNumber ---");

        Student s1 = new Student("Алекс", 200, 4.0);
        Student s2 = new Student("Зоя", 100, 4.5);
        Student s3 = new Student("Борис", 300, 3.8);

        System.out.println("Сравнение s1 (ID 200) и s2 (ID 100): " + s1.compareTo(s2));
        System.out.println("Сравнение s2 (ID 100) и s1 (ID 200): " + s2.compareTo(s1));

        List<Student> students = Arrays.asList(s1, s2, s3);
        System.out.println("\nСписок до сортировки: " + students);

        // Collections.sort() использует метод compareTo() из Comparable
        Collections.sort(students);

        System.out.println("Список после сортировки (по iDNumber): " + students);
    }
}