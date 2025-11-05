package PR13.Задание3;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс Student для Задания 3. 
 * Должен реализовывать Comparable для Collections.sort().
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
     * Сравнение по iDNumber для Comparable (естественный порядок).
     */
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', iD=%d}", name, iDNumber);
    }
}

/**
 * Тестовый класс для Задания 3: Объединение и сортировка слиянием.
 */
public class MergeSortTask3 {

    /**
     * Объединяет два списка студентов и сортирует результат.
     * @param list1 Первый список студентов.
     * @param list2 Второй список студентов.
     * @return Объединенный и отсортированный список.
     */
    public static List<Student> mergeAndSortLists(List<Student> list1, List<Student> list2) {
        // 1. Объединяем оба списка в один
        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // 2. Сортируем объединенный список. Collections.sort() использует Merge Sort.
        Collections.sort(mergedList);

        return mergedList;
    }

    public static void main(String[] args) {
        System.out.println("--- Задание 3: Объединение и сортировка слиянием ---");

        List<Student> students1 = new ArrayList<>(Arrays.asList(
                new Student("Виктор", 50, 4.0),
                new Student("Алиса", 10, 4.5)
        ));

        List<Student> students2 = new ArrayList<>(Arrays.asList(
                new Student("Георгий", 40, 3.8),
                new Student("Надежда", 20, 4.9),
                new Student("Сергей", 30, 4.2)
        ));

        System.out.println("Список 1 (для объединения): " + students1);
        System.out.println("Список 2 (для объединения): " + students2);

        List<Student> finalSortedList = mergeAndSortLists(students1, students2);

        System.out.println("\nОбъединенный и отсортированный список по ID (Merge Sort):");
        System.out.println(finalSortedList);
    }
}