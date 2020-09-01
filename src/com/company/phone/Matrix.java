package com.company.phone;

/*1) двумерный массив вещественных чисел;
2) количество строк и столбцов в матрице.

Класс должен иметь следующие методы:
1) сложение с другой матрицей;
2) умножение на число;
3) вывод на печать;
4) умножение матриц - по желанию.*/

public class Matrix {
    private int[][] matrix;

    public Matrix(int column, int line) {
        matrix = createMatrix(column, line);
    }


    public int[][] createMatrix(int column, int line) {
        int max = 9;
        int min = -9;
        matrix = new int[column][line];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int a = (int) Math.round(Math.random() * ((max - min)) + min);
                matrix[i][j] = a;
            }
        }
        return matrix;
    }

    public void showMatrix() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= 0) System.out.print(" " + matrix[i][j] + " ");
                if (matrix[i][j] < 0) System.out.print(matrix[i][j] + " ");
                if (j == matrix[i].length - 1) {
                    System.out.println();
                }
            }
        }
        System.out.println("---------------------------");
    }


    public Matrix matrixAddition(Matrix b) {
        Matrix c = new Matrix(this.matrix.length, this.matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < b.matrix.length; j++) {
                c.matrix[i][j] = matrix[i][j] + b.matrix[i][j];
            }
        }
        return c;
    }

    /***
     * умножает матрицу на число
     * @param x - число на которое умножается матрица
     * @return - результирующая матрица
     */
    public Matrix multiplication(int x) {
        Matrix c = new Matrix(this.matrix.length, this.matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                c.matrix[i][j] = matrix[i][j] * x;
            }
        }
        return c;
    }
}

