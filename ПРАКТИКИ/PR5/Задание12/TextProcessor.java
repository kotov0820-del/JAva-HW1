package PR5.Задание12;

public class TextProcessor {
    private StringBuilder text = new StringBuilder();

    public void append(String str) { text.append(str); }
    public void delete(int start, int end) { text.delete(start, end); }
    public int length() { return text.length(); }

    @Override
    public String toString() { return text.toString(); }
}