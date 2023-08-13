package MinSum;

/*
 * Problem statement: Given a matrix of m rows and n columns. You need to find
 * minimum of each rows and return the sum of those elements
 */

import java.util.*;

public class Minsum {

  public static void main(String[] args) {
    var sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++)
        matrix[i][j] = sc.nextInt();

    }

    int[] minElements = findMinEachRow(matrix);
    int minsum = 0;
    for (int el : minElements)
      minsum += el;
    System.out.println(minsum);

    sc.close();
  }

  private static int[] findMinEachRow(int[][] matrix) {
    int[] minElements = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      int minValue = Integer.MAX_VALUE;
      for (int j = 0; j < matrix[i].length; j++)
        if (matrix[i][j] < minValue)
          minValue = matrix[i][j];
      minElements[i] = minValue;
    }
    return minElements;
  }
}