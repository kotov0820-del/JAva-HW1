package PR5.Задание13;

import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder implements Observable {
    private StringBuilder buffer = new StringBuilder();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) { observers.add(o); }
    @Override
    public void removeObserver(Observer o) { observers.remove(o); }

    @Override
    public void notifyObservers() {
        System.out.println("--- Оповещение Наблюдателей ---");
        for (Observer observer : observers) {
            observer.update(buffer.toString());
        }
        System.out.println("------------------------------");
    }

    public ObservableStringBuilder append(String str) {
        buffer.append(str);
        notifyObservers();
        return this;
    }

    @Override
    public String toString() { return buffer.toString(); }

    public static void main(String[] args) {
        System.out.println("\n--- Задание 13: Шаблон «Наблюдатель» (Тест) ---");

        ObservableStringBuilder osb = new ObservableStringBuilder();
        Observer obs1 = new ConsoleObserver("Логгер");
        Observer obs2 = new ConsoleObserver("Системный монитор");

        osb.registerObserver(obs1);
        osb.registerObserver(obs2);

        System.out.println("Начало работы...");
        osb.append("Привет, мир!");

        osb.removeObserver(obs2);

        osb.append(" Добавление.");
    }
}