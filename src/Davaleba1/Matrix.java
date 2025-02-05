package Davaleba1;

public class Matrix {
    int [][] matrix;

    public Matrix(int [][] matrix) {
        this.matrix = matrix;
    }

    public int findMaxOnMainDiagonal() {
        int max = matrix[0][2];

        int x = matrix.length - 1;

        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][x] > max){
                max = matrix[i][x];
                x--;
            }
        }

        return max;
    }

    public int findMaxOnSecondaryDiagonal() {
        int x = matrix.length - 1;
        int max = matrix[0][x];

        for (int i = 1; i < matrix.length; i++) {
            if(matrix[i][x-1] > max){
                max = matrix[i][x-1];
                x--;
            }
        }

        return max;
    }

    public int sumEvenAboveMainDiagonal() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if(matrix[i][j] % 2 == 0){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
