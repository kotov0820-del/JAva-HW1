package PR14.Задание1_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class CollectionsApp {

    public static void main(String[] args) {

        // =======================================================
        // 1. Протестировать работу коллекции ArrayList
        // =======================================================
        System.out.println("--- 1. ТЕСТИРОВАНИЕ ArrayList ---");
        testArrayList();

        System.out.println("\n-----------------------------------\n");

        // =======================================================
        // 2. Протестировать работу коллекции LinkedList
        // =======================================================
        System.out.println("--- 2. ТЕСТИРОВАНИЕ LinkedList ---");
        testLinkedList();
    }

    /** Тестирование основных операций ArrayList. */
    public static void testArrayList() {
        ArrayList<String> list = new ArrayList<>();

        // Добавление элементов
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Исходный список (add): " + list); // [Apple, Banana, Cherry]

        // Добавление по индексу
        list.add(1, "Orange");
        System.out.println("После добавления 'Orange' по индексу 1: " + list); // [Apple, Orange, Banana, Cherry]

        // Получение элемента
        String element = list.get(2);
        System.out.println("Элемент по индексу 2 (get): " + element); // Banana

        // Изменение элемента
        list.set(0, "Apricot");
        System.out.println("После изменения элемента 0 на 'Apricot' (set): " + list); // [Apricot, Orange, Banana, Cherry]

        // Удаление элемента
        list.remove("Banana");
        list.remove(2); // Удалит "Cherry"
        System.out.println("После удаления 'Banana' и элемента по индексу 2 (remove): " + list); // [Apricot, Orange]

        // Размер
        System.out.println("Текущий размер (size): " + list.size()); // 2

        // Очистка
        list.clear();
        System.out.println("После полной очистки (clear): " + list); // []
    }

    /** Тестирование операций, специфичных для LinkedList. */
    public static void testLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();

        // Добавление элементов
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Исходный список: " + list); // [10, 20, 30]

        // Добавление в начало и конец (специфичные методы)
        list.addFirst(5);
        list.addLast(35);
        System.out.println("После addFirst(5) и addLast(35): " + list); // [5, 10, 20, 30, 35]

        // Получение первого и последнего элемента
        System.out.println("Первый элемент (getFirst): " + list.getFirst()); // 5
        System.out.println("Последний элемент (getLast): " + list.getLast()); // 35

        // Удаление из начала и конца
        int removedFirst = list.removeFirst();
        int removedLast = list.removeLast();
        System.out.println("Удален первый: " + removedFirst); // 5
        System.out.println("Удален последний: " + removedLast); // 35
        System.out.println("Список после удаления: " + list); // [10, 20, 30]

        // Использование как стека/очереди
        list.push(1); // Добавить в начало (как Stack)
        list.poll(); // Удалить из начала (как Queue)
        System.out.println("После push(1) и poll(): " + list); // [20, 30]
    }
}