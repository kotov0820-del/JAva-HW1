package PR6.Задание5;

// Интерфейс для работы со строками (Задание 5) [cite: 117]
public interface StringWorker {
    // а) Функция подсчета символов в строке [cite: 117]
    int countCharacters(String s);

    // б) Функция возвращает строку, состоящую из символов на нечетных позициях (1, 3, 5...) [cite: 117]
    String oddPositionChars(String s);

    // в) Функция инвертирования строки [cite: 117]
    String invertString(String s);
}