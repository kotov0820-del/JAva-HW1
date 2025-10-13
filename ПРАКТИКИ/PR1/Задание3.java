package PR1;

public class Задание3{
        public static void main(String[] args) {
            // Проверяем, есть ли вообще аргументы
            if (args.length == 0) {
                System.out.println("Аргументы командной строки не переданы.");
            } else {
                System.out.println("Аргументы командной строки:");
                // Выводим все аргументы в цикле for
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
                }
            }
        }
    }

