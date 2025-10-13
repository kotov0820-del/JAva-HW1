package PR4;
enum Size {
    XXS("Детский размер", 32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    private final String description;
    private final int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }
}

// Интерфейсы
interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

// Абстрактный класс Clothes
abstract class Clothes {
    private Size size;
    private double cost;
    private String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Размер: " + size + " (" + size.getDescription() + ", Euro: " + size.getEuroSize() +
                "), Стоимость: " + cost + ", Цвет: " + color;
    }
}

// Классы наследники
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в футболку: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в футболку: " + this);
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в штаны: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в штаны: " + this);
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в юбку: " + this);
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в галстук: " + this);
    }
}

// Класс Ателье
class Atelier {
    public void dressMan(Clothes[] clothes) {
        System.out.println("\nОдеваем мужчину:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        System.out.println("\nОдеваем женщину:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothesArray = {
                new TShirt(Size.M, 25.99, "Синий"),
                new Pants(Size.L, 49.99, "Черный"),
                new Skirt(Size.S, 35.50, "Красный"),
                new Tie(Size.XS, 15.00, "Зеленый"),
                new TShirt(Size.XXS, 10.00, "Желтый") // Детская футболка
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(clothesArray);
        atelier.dressWomen(clothesArray);
    }
}