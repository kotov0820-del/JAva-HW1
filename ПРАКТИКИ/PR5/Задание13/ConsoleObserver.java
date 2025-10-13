package PR5.Задание13;

public class ConsoleObserver implements Observer {
    private String name;

    public ConsoleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String newState) {
        System.out.println("[" + name + "] получил обновление. Новое состояние: " + newState);
    }
}