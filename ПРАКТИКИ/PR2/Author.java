package PR2; // Убедитесь, что имя пакета соответствует вашей структуре папок

public class Author {
    private final String name; // Сделано final, так как не меняется
    private String email;
    private final char gender; // Сделано final, так как не меняется

    // Конструктор
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        // Проверяем корректность пола
        if (gender == 'M' || gender == 'F' || gender == 'U') {
            this.gender = gender;
        } else {
            // Можно установить значение по умолчанию или выбросить исключение
            System.err.println("Invalid gender specified. Setting to 'U' (Unknown).");
            this.gender = 'U'; // По умолчанию неизвестно
        }
    }

    // Геттер для name
    public String getName() {
        return name;
    }

    // Геттер для email
    public String getEmail() {
        return email;
    }

    // Сеттер для email (имя и пол не изменяются)
    public void setEmail(String email) {
        this.email = email;
    }

    // Геттер для gender
    public char getGender() {
        return gender;
    }

    // Метод toString()
    @Override
    public String toString() {
        String genderRepresentation;
        if (gender == 'M') {
            genderRepresentation = "(m)";
        } else if (gender == 'F') {
            genderRepresentation = "(f)";
        } else {
            genderRepresentation = "(u)"; // Для неизвестного пола
        }
        return name + " " + genderRepresentation + " at " + email;
    }
}