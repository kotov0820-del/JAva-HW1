package PR4.Задание4_1.Задание9;
public class ShopTester {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop("Уютный Дом");

        // Добавляем различные виды мебели
        shop.addFurniture(new Chair("Кухонный стул", 1500, "Дерево", 4, true));
        shop.addFurniture(new Table("Обеденный стол", 8000, "МДФ", 1.2, 0.75, 0.8));
        shop.addFurniture(new Sofa("Угловой диван 'Комфорт'", 35000, "Ткань", 5, true));
        shop.addFurniture(new Chair("Офисное кресло", 4500, "Металл/Кожа", 5, true));
        shop.addFurniture(new Table("Журнальный столик", 2500, "Стекло/Металл", 0.6, 0.4, 0.6));

        // Тестируем работу классов
        shop.displayCatalog();

        // Пример поиска
        System.out.println("\n--- Поиск мебели ---");
        Furniture foundItem = shop.findFurniture("Обеденный стол");
        if (foundItem != null) {
            System.out.println("Найдено: " + foundItem);
            System.out.println("Его описание: " + foundItem.getDescription());
        } else {
            System.out.println("Мебель не найдена.");
        }

        foundItem = shop.findFurniture("Кровать");
        if (foundItem != null) {
            System.out.println("Найдено: " + foundItem);
        } else {
            System.out.println("Кровать не найдена.");
        }
    }
}