package ru.arl;

public class Matrix {

    private int columnCount;
    private int rowCount;

    private int[][] matrix = new int[rowCount][columnCount];

    public Matrix(int columnCount, int rowCount) {
        this.columnCount = columnCount;
        this.rowCount = rowCount;
    }

    public void addMatrix(Matrix another) {
        if (another.columnCount == this.columnCount && another.rowCount == this.rowCount) {
            for (int column = 0; column < columnCount; column++) {
                for (int row = 0; row < rowCount; row++) {
                    this.matrix[row][column] = this.matrix[row][column] + another.matrix[row][column];
                }
            }
        } else {
            // Тут сообщить об ошибке
        }
    }

    public void multiplyMatrix(int multiplier) {
        for (int column = 0; column < columnCount; column++) {
            for (int row = 0; row < rowCount; row++) {
                this.matrix[row][column] = multiplier * this.matrix[row][column];
            }
        }
    }

    public static void main(String[] args) {
//
//        matrix1[0][0] = 1;
//        matrix1[0][1] = 2;
//        matrix1[1][0] = 3;
//        matrix1[1][1] = 4;
//
//        int[][] matrix2 = new int[2][2];
//        matrix2[0][0] = 4;
//        matrix2[0][1] = 3;
//        matrix2[1][0] = 2;
//        matrix2[1][1] = 1;

//        for (int a = 0; a < matrix1.length; a++) {
//            for (int s = 0; s < matrix1[a].length; s++) {
//                for (int n = 0; n < matrix2.length; n++) {
//                    for (int m = 0; m < matrix2[n].length; m++) {
//                        if (matrix1[a][s]==matrix2[n][m]) {
//                            System.out.println();
//                        }
//                    }
//                }

//                for (int i = 0; i < matrix1.length; i++) {
//                    for (int j = 0; j < matrix1[1].length; j++) {
//                        System.out.print(matrix1[i][j] * 2 + " "); //Умножение матрицы на 2
//                    }
//                    System.out.println();
//                }
    }
}
//    }
//}
