package algoExpert.facile;

public class TransposeMatrix {
    public static void main(String[] args) {

      /*  INPUT
           [ [1,2,3],
            [4,5,6],
            [7,8,9]]

        OUTPUT
         [ [1,4,7],
            [2,5,8],
            [3,6,9]]
*/
        int[][] transposeMatrix = new int[3][3];
        transposeMatrix[0][0] = 1;
        transposeMatrix[0][1] = 2;
        transposeMatrix[0][2] = 3;
        transposeMatrix[1][0] = 4;
        transposeMatrix[1][1] = 5;
        transposeMatrix[1][2] = 6;
        transposeMatrix[2][0] = 7;
        transposeMatrix[2][1] = 8;
        transposeMatrix[2][2] = 9;
        int[][] mat = transposeMatrix(transposeMatrix);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j]);
            }
        }
    }


    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposeMatrix[i][j]= matrix[j][i];
            }
        }
        return transposeMatrix;
    }
}
