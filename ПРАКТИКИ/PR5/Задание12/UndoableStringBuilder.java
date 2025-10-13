package PR5.Задание12;

import java.util.Stack;

public class UndoableStringBuilder {
    private TextProcessor processor = new TextProcessor();
    private Stack<Command> history = new Stack<>();

    public UndoableStringBuilder append(String str) {
        Command cmd = new AppendCommand(processor, str);
        cmd.execute();
        history.push(cmd);
        return this;
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
            System.out.println("Операция отменена.");
        } else {
            System.out.println("Нет операций для отмены.");
        }
    }

    @Override
    public String toString() { return processor.toString(); }

    public static void main(String[] args) {
        System.out.println("\n--- Задание 12: Шаблон «Команда» (Undo) (Тест) ---");
        UndoableStringBuilder usb = new UndoableStringBuilder();

        usb.append("Начало.");
        System.out.println("1. Текст: " + usb);

        usb.append(" Привет.");
        System.out.println("2. Текст: " + usb);

        usb.undo();
        System.out.println("3. После UNDO: " + usb);

        usb.undo();
        System.out.println("4. После UNDO: '" + usb + "'");

        usb.undo();
    }
}