package PR4.Задание4_1.Задание9;
import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private String name;
    private List<Furniture> catalog;

    public FurnitureShop(String name) {
        this.name = name;
        this.catalog = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        catalog.add(furniture);
        System.out.println(furniture.getName() + " добавлен в магазин '" + name + "'.");
    }

    public void displayCatalog() {
        System.out.println("\n--- Каталог магазина '" + name + "' ---");
        if (catalog.isEmpty()) {
            System.out.println("В магазине пока нет мебели.");
            return;
        }
        for (Furniture item : catalog) {
            System.out.println(item.getName() + " (" + item.getClass().getSimpleName() + ")");
            System.out.println("  Цена: " + item.getPrice() + " руб.");
            System.out.println("  Материал: " + item.getMaterial());
            System.out.println("  Описание: " + item.getDescription());
            System.out.println("--------------------");
        }
    }

    // Метод для поиска мебели по названию
    public Furniture findFurniture(String furnitureName) {
        for (Furniture item : catalog) {
            if (item.getName().equalsIgnoreCase(furnitureName)) {
                return item;
            }
        }
        return null; // Мебель не найдена
    }
}