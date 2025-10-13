package PR5.Задание9;

import PR5.Задание6.Printable;

public class Magazine implements Printable {
    private String title;
    public Magazine(String title) { this.title = title; }
    @Override
    public void print() {
        System.out.println("Печать журнала: " + title);
    }
}