package PR6.Задание7;

// Класс Journal, реализующий Printable
public class Journal implements Printable {
    private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }

    // Статический метод printMagazines (Задание 7) [cite: 120]
    public static void printMagazines(Printable[] printable) {
        System.out.println("\n--- Журналы (Задание 7) ---");
        for (Printable p : printable) {
            // Проверяем, является ли объект журналом
            if (p instanceof Journal) {
                Journal j = (Journal) p;
                System.out.println("Название журнала: " + j.getName());
            }
        }
    }
}