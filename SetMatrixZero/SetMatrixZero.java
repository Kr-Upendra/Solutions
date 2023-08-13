package SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    matrix.add(new ArrayList<>(Arrays.asList(-1)));
    matrix.add(new ArrayList<>(Arrays.asList(2)));
    matrix.add(new ArrayList<>(Arrays.asList(3)));

    int m = matrix.size();
    int n = matrix.get(0).size();
    setMatrixZero(matrix, m, n);

  }

  private static void setMatrixZero(ArrayList<ArrayList<Integer>> matrix, int m, int n) {

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix.get(i).get(j) == 0) {
          markRow(matrix, m, n, i);
          markCol(matrix, m, n, j);
        }
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix.get(i).get(j) == -9999)
          matrix.get(i).set(j, 0);
        ;
      }
    }

    System.out.println("result Matrix: " + matrix);

  }

  private static void markCol(ArrayList<ArrayList<Integer>> matrix, int m, int n, int j) {
    for (int i = 0; i < m; i++) {
      if (matrix.get(i).get(j) != 0)
        matrix.get(i).set(j, -9999);
    }
  }

  private static void markRow(ArrayList<ArrayList<Integer>> matrix, int m, int n, int i) {
    for (int j = 0; j < n; j++) {
      if (matrix.get(i).get(j) != 0)
        matrix.get(i).set(j, -9999);
    }
  }

}
