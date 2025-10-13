package PR5.Задание10;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer c) { computers.add(c); }
    public void removeComputer(Computer c) { computers.remove(c); }

    public List<Computer> findComputerByBrand(ComputerBrand brand) {
        List<Computer> found = new ArrayList<>();
        for (Computer c : computers) {
            if (c.getBrand() == brand) {
                found.add(c);
            }
        }
        return found;
    }

    public void displayAll() {
        System.out.println("--- Ассортимент магазина ---");
        computers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("\n--- Задание 10: Интернет-магазин (Тест) ---");
        Shop shop = new Shop();

        // Данные для заполнения массива компьютеров вводятся с клавиатуры пользователем.
        // Для простоты тестирования, я использую статические данные.
        // Для ввода с клавиатуры нужно использовать Scanner.
        shop.addComputer(new Computer(ComputerBrand.APPLE, 1500.00));
        shop.addComputer(new Computer(ComputerBrand.DELL, 850.50));
        shop.addComputer(new Computer(ComputerBrand.APPLE, 2100.00));

        shop.displayAll();

        List<Computer> applePcs = shop.findComputerByBrand(ComputerBrand.APPLE);
        System.out.println("\nНайдены компьютеры APPLE:");
        applePcs.forEach(System.out::println);
    }
}