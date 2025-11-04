package PR9.Задание4;

public class ИсправныйКод {
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];

        // *** ИСПРАВЛЕНИЕ: Инициализация первого элемента массива ***
        dates[0] = new java.util.Date(); // Теперь dates[0] ссылается на объект текущей даты/времени

        System.out.println(dates[0]);
        // Теперь выведет текущую дату, так как dates[0] не null.

        System.out.println(dates[0].toString());
        // Теперь допустимо и вызовет метод toString() на реальном объекте Date.
    }
}