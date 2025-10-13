package PR4.Задание4_1.Задание4;
public class MatrixTester {
    public static void main(String[] args) {
        // Создаем матрицы
        double[][] dataA = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrixA = new Matrix(dataA);
        System.out.println("Матрица A:");
        matrixA.print(); // 3) вывод на печать

        double[][] dataB = {{7, 8, 9}, {10, 11, 12}};
        Matrix matrixB = new Matrix(dataB);
        System.out.println("\nМатрица B:");
        matrixB.print();

        double[][] dataC = {{1, 0}, {0, 1}, {2, 3}};
        Matrix matrixC = new Matrix(dataC);
        System.out.println("\nМатрица C:");
        matrixC.print();

        // 1) Сложение матриц
        try {
            Matrix sumMatrix = matrixA.add(matrixB);
            System.out.println("\nМатрица A + B:");
            sumMatrix.print();
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка при сложении: " + e.getMessage());
        }

        // 2) Умножение на число
        Matrix scaledMatrix = matrixA.multiply(2.5);
        System.out.println("\nМатрица A * 2.5:");
        scaledMatrix.print();

        // 4) Умножение матриц
        try {
            Matrix productMatrix = matrixA.multiply(matrixC);
            System.out.println("\nМатрица A * C:");
            productMatrix.print();
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка при умножении: " + e.getMessage());
        }

        // Попытка сложить матрицы разных размеров
        double[][] dataD = {{1, 2}, {3, 4}};
        Matrix matrixD = new Matrix(dataD);
        System.out.println("\nМатрица D:");
        matrixD.print();

        try {
            matrixA.add(matrixD);
        } catch (IllegalArgumentException e) {
            System.err.println("\nОжидаемая ошибка при сложении матриц разных размеров: " + e.getMessage());
        }

        // Попытка умножить матрицы с несовместимыми размерами
        try {
            matrixC.multiply(matrixA);
        } catch (IllegalArgumentException e) {
            System.err.println("\nОжидаемая ошибка при умножении матриц с несовместимыми размерами: " + e.getMessage());
        }
    }
}