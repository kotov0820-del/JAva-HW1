package PR5.Задание8;

import PR5.Задание6.Printable;

public class ShopPrintable implements Printable {
    private String name;
    public ShopPrintable(String name) { this.name = name; }
    @Override
    public void print() {
        System.out.println("Информация о магазине: " + name);
    }
}