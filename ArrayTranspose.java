package ödev;
import java.util.Arrays;

public class ArrayTranspose {

    public static void main(String[] args) {

        int a = 3;
        int b = 2;
        int[][] matrix = new int[a][b];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        matrix[2][0] = 5;
        matrix[2][1] = 6;

        int[][] transpose = new int[b][a];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
        for (int[] row : transpose) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
