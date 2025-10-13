package PR2; // Убедитесь, что имя пакета соответствует вашей структуре папок

public class TestAuthor {
    public static void main(String[] args) {
        // Создаем несколько объектов Author
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        Author author2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');
        Author author3 = new Author("Unknown Author", "unknown@example.com", 'U');
        Author author4 = new Author("Invalid Gender", "invalid@example.com", 'X'); // Проверка обработки некорректного пола

        // Выводим информацию об авторах
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println(author4);

        System.out.println("\n--- Проверка геттеров и сеттеров ---");
        // Проверяем геттеры
        System.out.println("Author 1 Name: " + author1.getName());
        System.out.println("Author 1 Email: " + author1.getEmail());
        System.out.println("Author 1 Gender: " + author1.getGender());

        // Изменяем email у author1
        author1.setEmail("newAhTeck@somewhere.com");
        System.out.println("Author 1 New Email: " + author1.getEmail());
        System.out.println(author1); // Проверяем toString после изменения email
    }
}