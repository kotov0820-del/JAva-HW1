package PR13.Задание1;

import java.util.Arrays;

/**
 * Класс Student, реализующий Comparable для сортировки по iDNumber.
 * Это также отвечает Заданию 4 (собственная реализация Comparable).
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

    // Задание 4: Реализация Comparable для сортировки по iDNumber (естественный порядок)
    @Override
    public int compareTo(Student other) {
        // Сортировка в порядке возрастания iDNumber
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', iD=%d}", name, iDNumber);
    }
}

/**
 * Тестовый класс для Задания 1: Создает массив Student и сортирует его 
 * по iDNumber с использованием алгоритма сортировки вставками.
 */
public class InsertionSortTask1 {

    /**
     * Алгоритм сортировки вставками для массива Comparable объектов.
     * @param list Массив объектов, реализующих Comparable.
     */
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable currentElement = list[index];
            int scan = index;

            // Сдвигаем элементы отсортированного подсписка вправо, пока не найдем место
            while (scan > 0 && currentElement.compareTo(list[scan - 1]) < 0) {
                list[scan] = list[scan - 1];
                scan--;
            }
            list[scan] = currentElement; // Вставляем текущий элемент на его место
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Задание 1: Сортировка вставками по iDNumber ---");

        Student[] students = {
                new Student("Иван", 123, 4.0),
                new Student("Анна", 456, 4.5),
                new Student("Петр", 321, 3.8),
                new Student("Мария", 111, 4.9)
        };

        System.out.println("Исходный массив (до сортировки):");
        System.out.println(Arrays.toString(students));

        insertionSort(students);

        System.out.println("\nОтсортированный массив по ID (сортировка вставками):");
        System.out.println(Arrays.toString(students));
    }
}