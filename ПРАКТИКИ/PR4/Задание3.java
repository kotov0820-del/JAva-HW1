package PR4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//Пароль и логин"user1", "pass1"
// Пароль и логин"admin", "admin"

// Перечисление для категорий товаров
enum ProductCategory {
    ELECTRONICS("Электроника"),
    BOOKS("Книги"),
    CLOTHING("Одежда"),
    FOOD("Продукты");

    private final String displayName;

    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}

class Product {
    private String name;
    private double price;
    private ProductCategory category;

    public Product(String name, double price, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " - " + price + " руб. (" + category.getDisplayName() + ")";
    }
}

class User {
    private String username;
    private String password;
    private List<Product> cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void addToCart(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " добавлен в корзину.");
    }

    public List<Product> getCart() {
        return cart;
    }

    public void clearCart() {
        cart.clear();
    }
}

class OnlineShop {
    private Map<String, User> registeredUsers;
    private List<Product> allProducts;
    private User currentUser;
    private Scanner scanner;

    public OnlineShop() {
        registeredUsers = new HashMap<>();
        allProducts = new ArrayList<>();
        scanner = new Scanner(System.in);
        // Добавляем тестовых пользователей
        registeredUsers.put("user1", new User("user1", "pass1"));
        registeredUsers.put("admin", new User("admin", "admin"));

        // Добавляем тестовые товары
        allProducts.add(new Product("Ноутбук", 75000, ProductCategory.ELECTRONICS));
        allProducts.add(new Product("Смартфон", 30000, ProductCategory.ELECTRONICS));
        allProducts.add(new Product("Книга по Java", 1200, ProductCategory.BOOKS));
        allProducts.add(new Product("Футболка", 800, ProductCategory.CLOTHING));
        allProducts.add(new Product("Хлеб", 50, ProductCategory.FOOD));
        allProducts.add(new Product("Молоко", 90, ProductCategory.FOOD));
        allProducts.add(new Product("Джинсы", 3500, ProductCategory.CLOTHING));
    }

    public void start() {
        System.out.println("Добро пожаловать в наш интернет-магазин!");
        authenticateUser();
        if (currentUser != null) {
            mainMenu();
        }
        System.out.println("Спасибо за покупки! До свидания!");
    }

    private void authenticateUser() {
        System.out.println("--- Аутентификация ---");
        while (currentUser == null) {
            System.out.print("Введите логин: ");
            String login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();

            User user = registeredUsers.get(login);
            if (user != null && user.authenticate(password)) {
                currentUser = user;
                System.out.println("Добро пожаловать, " + currentUser.getUsername() + "!");
            } else {
                System.out.println("Неверный логин или пароль. Попробуйте еще раз.");
            }
        }
    }

    private void mainMenu() {
        int choice;
        do {
            System.out.println("\n--- Главное меню ---");
            System.out.println("1. Просмотр каталогов");
            System.out.println("2. Просмотр корзины");
            System.out.println("3. Оформить заказ");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    viewCatalogs();
                    break;
                case 2:
                    viewCart();
                    break;
                case 3:
                    checkout();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        } while (choice != 0);
    }

    private void viewCatalogs() {
        System.out.println("\n--- Каталоги товаров ---");
        ProductCategory[] categories = ProductCategory.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i].getDisplayName());
        }
        System.out.println("0. Назад");

        System.out.print("Выберите категорию для просмотра товаров: ");
        int categoryChoice = Integer.parseInt(scanner.nextLine());

        if (categoryChoice > 0 && categoryChoice <= categories.length) {
            ProductCategory selectedCategory = categories[categoryChoice - 1];
            viewProductsInCategory(selectedCategory);
        } else if (categoryChoice != 0) {
            System.out.println("Неверный выбор категории.");
        }
    }

    private void viewProductsInCategory(ProductCategory category) {
        List<Product> productsInCategory = new ArrayList<>();
        System.out.println("\n--- Товары в категории '" + category.getDisplayName() + "' ---");
        for (Product p : allProducts) {
            if (p.getCategory() == category) {
                productsInCategory.add(p);
            }
        }

        if (productsInCategory.isEmpty()) {
            System.out.println("В этой категории пока нет товаров.");
            return;
        }

        for (int i = 0; i < productsInCategory.size(); i++) {
            System.out.println((i + 1) + ". " + productsInCategory.get(i));
        }
        System.out.println("0. Назад");

        System.out.print("Выберите товар для добавления в корзину (или 0 для возврата): ");
        int productChoice = Integer.parseInt(scanner.nextLine());

        if (productChoice > 0 && productChoice <= productsInCategory.size()) {
            currentUser.addToCart(productsInCategory.get(productChoice - 1));
        } else if (productChoice != 0) {
            System.out.println("Неверный выбор товара.");
        }
    }

    private void viewCart() {
        System.out.println("\n--- Ваша корзина ---");
        List<Product> cart = currentUser.getCart();
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        double totalCost = 0;
        for (int i = 0; i < cart.size(); i++) {
            Product item = cart.get(i);
            System.out.println((i + 1) + ". " + item);
            totalCost += item.getPrice();
        }
        System.out.printf("Общая стоимость: %.2f руб.%n", totalCost);
    }

    private void checkout() {
        List<Product> cart = currentUser.getCart();
        if (cart.isEmpty()) {
            System.out.println("Ваша корзина пуста. Нечего покупать.");
            return;
        }

        viewCart();
        System.out.print("Подтвердите покупку (да/нет): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("да")) {
            System.out.println("Поздравляем! Ваш заказ оформлен.");
            System.out.println("Купленные товары:");
            for (Product item : cart) {
                System.out.println("- " + item.getName());
            }
            currentUser.clearCart();
        } else {
            System.out.println("Покупка отменена.");
        }
    }

    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();
        shop.start();
    }
}