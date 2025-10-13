package PR5.Задание12;

public class AppendCommand implements Command {
    private TextProcessor processor;
    private String textToAppend;

    public AppendCommand(TextProcessor processor, String textToAppend) {
        this.processor = processor;
        this.textToAppend = textToAppend;
    }

    @Override
    public void execute() {
        processor.append(textToAppend);
    }

    @Override
    public void undo() {
        int start = processor.length() - textToAppend.length();
        int end = processor.length();
        if (start >= 0) {
            processor.delete(start, end);
        }
    }
}