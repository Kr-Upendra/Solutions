package SetMatrixZero;

public class SetMatrixZero2 {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 0, 6 },
        { 7, 8, 1 }
    };
    var result = setMatrixZero(matrix);
    printResult(result);

  }

  private static int[][] setMatrixZero(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          markRowsZero(matrix, i);
          markColsZero(matrix, j);
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == -9999)
          matrix[i][j] = 0;
      }
    }

    return matrix;

  }

  private static void markColsZero(int[][] matrix, int j) {
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][j] != 0)
        matrix[i][j] = -9999;
    }
  }

  private static void markRowsZero(int[][] matrix, int i) {
    for (int j = 0; j < matrix[i].length; j++) {
      if (matrix[i][j] != 0)
        matrix[i][j] = -9999;
    }
  }

  private static void printResult(int[][] result) {
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");

      }
      System.out.println();

    }

  }

}
