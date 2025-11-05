package PR14.Задание3;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Упрощенная реализация коллекции, похожей на ArrayList.
 * Использует массив и автоматически увеличивает его размер.
 * @param <E> Тип элементов, которые будут храниться в коллекции
 */
public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    /** Увеличивает внутренний массив в 1.5 раза. */
    private void ensureCapacity() {
        int newCapacity = elementData.length + (elementData.length >> 1); // Увеличение на 50%
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    /** * Добавляет элемент в конец списка.
     * @param element Добавляемый элемент
     */
    public void add(E element) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = element;
    }

    /** * Возвращает элемент по указанному индексу.
     * @param index Индекс элемента
     * @return Элемент по индексу
     */
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elementData[index];
    }

    /**
     * Удаляет элемент по указанному индексу и сдвигает все последующие элементы.
     * @param index Индекс удаляемого элемента
     * @return Удаленный элемент
     */
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        E oldValue = (E) elementData[index];

        // Сдвиг элементов влево
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }

        elementData[--size] = null; // Очистка последней ячейки
        return oldValue;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    // Метод для тестирования
    public static void main(String[] args) {
        System.out.println("--- 3. ТЕСТИРОВАНИЕ MyArrayList ---");
        MyArrayList<String> customList = new MyArrayList<>();

        // Добавление элементов (проверка роста)
        for (int i = 0; i < 12; i++) {
            customList.add("Элемент " + i);
        }
        System.out.println("Список после добавления 12 элементов: " + customList);
        System.out.println("Текущий размер: " + customList.size());

        // Получение элемента
        System.out.println("Элемент по индексу 5 (get): " + customList.get(5));

        // Удаление элемента
        String removed = customList.remove(1);
        System.out.println("Удален элемент по индексу 1: " + removed);
        System.out.println("Список после удаления: " + customList);
        System.out.println("Новый размер: " + customList.size());

        // Проверка сдвига
        System.out.println("Новый элемент по индексу 1: " + customList.get(1)); // Должен быть "Элемент 2"
    }
}