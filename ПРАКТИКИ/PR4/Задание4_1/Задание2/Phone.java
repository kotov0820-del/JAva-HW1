package PR4.Задание4_1.Задание2;
public class Phone {
    private String number;
    private String model;
    private double weight;

    // 9) Добавить конструктор без параметров.
    public Phone() {
        this("unknown", "unknown", 0.0);
        System.out.println("Вызван конструктор без параметров.");
    }

    // 8) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
    public Phone(String number, String model) {
        this(number, model, 0.0); // Передаем вес по умолчанию
        System.out.println("Вызван конструктор с двумя параметрами: " + number + ", " + model);
    }

    // 7) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println("Вызван конструктор с тремя параметрами: " + number + ", " + model + ", " + weight);
    }

    // 3) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. 4) Выводит на консоль сообщение “Звонит {name}”.
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // 11) Добавьте перегруженный метод. receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " с номера " + callerNumber);
    }

    // 5) Метод getNumber – возвращает номер телефона.
    public String getNumber() {
        return number;
    }

    // 13) Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
    // 14) Метод выводит на консоль номера этих телефонов.
    public void sendMessage(String... phoneNumbers) {
        System.out.print("Сообщение будет отправлено на номера: ");
        for (String num : phoneNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Геттеры и сеттеры для других полей (не обязательно по заданию, но хорошая практика)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
