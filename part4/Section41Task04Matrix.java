// Часть 4, раздел 4.1, задание 4: матрица
public class Section41Task04Matrix {
    public static void main(String[] args) {
        Matrix a = new Matrix(new double[][] {{1, 2}, {3, 4}});
        Matrix b = new Matrix(new double[][] {{5, 6}, {7, 8}});
        System.out.println("A + B:");
        a.add(b).print();
        System.out.println("A * 2:");
        a.multiply(2).print();
        System.out.println("A * B:");
        a.multiply(b).print();
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Matrix {
        private double[][] data;
        private int rows;
        private int columns;
        public Matrix(double[][] values) {
            if (values.length == 0 || values[0].length == 0) {
                throw new IllegalArgumentException("Матрица не должна быть пустой");
            }
            rows = values.length;
            columns = values[0].length;
            data = new double[rows][columns];
            for (int i = 0; i < rows; i++) {
                if (values[i].length != columns) {
                    throw new IllegalArgumentException("Строки должны иметь одинаковую длину");
                }
                for (int j = 0; j < columns; j++) data[i][j] = values[i][j];
            }
        }
        public Matrix add(Matrix other) {
            if (rows != other.rows || columns != other.columns) {
                throw new IllegalArgumentException("Размеры матриц должны совпадать");
            }
            double[][] result = new double[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) result[i][j] = data[i][j] + other.data[i][j];
            }
            return new Matrix(result);
        }
        public Matrix multiply(double number) {
            double[][] result = new double[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) result[i][j] = data[i][j] * number;
            }
            return new Matrix(result);
        }
        // Дополнительный пункт: умножение двух матриц.
        public Matrix multiply(Matrix other) {
            if (columns != other.rows) {
                throw new IllegalArgumentException("Число столбцов слева должно равняться числу строк справа");
            }
            double[][] result = new double[rows][other.columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < other.columns; j++) {
                    for (int k = 0; k < columns; k++) result[i][j] += data[i][k] * other.data[k][j];
                }
            }
            return new Matrix(result);
        }
        public void print() {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) System.out.print(data[i][j] + " ");
                System.out.println();
            }
        }
    }
}
