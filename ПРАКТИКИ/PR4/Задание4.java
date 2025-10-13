package PR4;
// Перечисление для марок компьютеров
enum Brand {
    DELL("Dell Technologies"),
    HP("HP Inc."),
    APPLE("Apple Inc."),
    LENOVO("Lenovo Group Limited"),
    ASUS("ASUS Global"),
    ACER("Acer Inc.");

    private final String fullName;

    Brand(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return name() + " (" + fullName + ")";
    }
}

// Класс Процессор
class Processor {
    private String model;
    private int cores;
    private double clockSpeedGHz;

    public Processor(String model, int cores, double clockSpeedGHz) {
        this.model = model;
        this.cores = cores;
        this.clockSpeedGHz = clockSpeedGHz;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public void processData() {
        System.out.println("Процессор " + model + " обрабатывает данные.");
    }

    @Override
    public String toString() {
        return "Процессор: " + model + ", Ядра: " + cores + ", Частота: " + clockSpeedGHz + "GHz";
    }
}

// Класс Память
class Memory {
    private String type; // например, DDR4, DDR5
    private int capacityGB;
    private int frequencyMHz;

    public Memory(String type, int capacityGB, int frequencyMHz) {
        this.type = type;
        this.capacityGB = capacityGB;
        this.frequencyMHz = frequencyMHz;
    }

    public String getType() {
        return type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public int getFrequencyMHz() {
        return frequencyMHz;
    }

    public void readData() {
        System.out.println("Память " + type + " объемом " + capacityGB + "GB считывает данные.");
    }

    public void writeData() {
        System.out.println("Память " + type + " объемом " + capacityGB + "GB записывает данные.");
    }

    @Override
    public String toString() {
        return "Память: " + type + ", Объем: " + capacityGB + "GB, Частота: " + frequencyMHz + "MHz";
    }
}

// Класс Монитор
class Monitor {
    private String model;
    private double screenSizeInches;
    private String resolution; // например, 1920x1080

    public Monitor(String model, double screenSizeInches, String resolution) {
        this.model = model;
        this.screenSizeInches = screenSizeInches;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public String getResolution() {
        return resolution;
    }

    public void displayImage() {
        System.out.println("Монитор " + model + " отображает изображение.");
    }

    @Override
    public String toString() {
        return "Монитор: " + model + ", Диагональ: " + screenSizeInches + ", Разрешение: " + resolution;
    }
}

// Класс Компьютер
class Computer {
    private Brand brand;
    private String modelName;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, String modelName, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.modelName = modelName;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void start() {
        System.out.println("\nКомпьютер " + brand + " " + modelName + " запускается...");
        processor.processData();
        memory.readData();
        monitor.displayImage();
        System.out.println("Система загружена.");
    }

    public void displayInfo() {
        System.out.println("\n--- Информация о компьютере ---");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + modelName);
        System.out.println(processor);
        System.out.println(memory);
        System.out.println(monitor);
    }

    public static void main(String[] args) {
        // Создаем компоненты
        Processor intelI7 = new Processor("Intel Core i7-12700K", 12, 3.6);
        Memory ddr4_16gb = new Memory("DDR4", 16, 3200);
        Monitor samsung27 = new Monitor("Samsung Odyssey G5", 27, "2560x1440");

        Processor amdRyzen5 = new Processor("AMD Ryzen 5 5600X", 6, 3.7);
        Memory ddr4_8gb = new Memory("DDR4", 8, 2666);
        Monitor lg24 = new Monitor("LG UltraGear", 24, "1920x1080");

        // Создаем компьютеры
        Computer gamingPC = new Computer(Brand.ASUS, "ROG Strix G15", intelI7, ddr4_16gb, samsung27);
        Computer officePC = new Computer(Brand.LENOVO, "IdeaCentre 5", amdRyzen5, ddr4_8gb, lg24);

        // Демонстрируем работу
        gamingPC.displayInfo();
        gamingPC.start();

        officePC.displayInfo();
        officePC.start();

        // Пример использования методов компонентов
        System.out.println("\n--- Тестирование компонентов ---");
        gamingPC.getProcessor().processData();
        officePC.getMemory().writeData();
        gamingPC.getMonitor().displayImage();
    }
}
