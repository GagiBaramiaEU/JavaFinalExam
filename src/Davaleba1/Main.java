package Davaleba1;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 2, 3},
                {4, 11, 6},
                {21, 8, 9}
        };

        Matrix matrix1 = new Matrix(matrix);

        System.out.println("find max in main diagonal: " + matrix1.findMaxOnMainDiagonal());

        System.out.println("find max in secondary diagonal: " + matrix1.findMaxOnSecondaryDiagonal());

        System.out.println("sum even above main diagonal: " + matrix1.sumEvenAboveMainDiagonal());
    }
}