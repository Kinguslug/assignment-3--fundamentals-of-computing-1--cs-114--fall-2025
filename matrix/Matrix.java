 public class Matrix {
  private int[][] matrix;

  public Matrix(int size) {

    matrix = new int[size][size];

  }
  public void printDefultMatrix() {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.print (matrix[row][col] + "\t");
      }
      System.out.println();
    }
  }
  public void populateMatrix() {
    int counter = 1;
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = counter;
        counter++;
      }
    }
  }
  public void printMatrix() {
    int size = matrix.length;
    for(int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if ( row + col == size - 1) {
          System.out.print("\u001B[33m" + matrix[row][col] + "\u001B[0m" + "\t");
        }else {
          System.out.print(matrix[row][col] + "\t");
        }
      }
      System.out.println();
    }
  }
  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }
  public void flipMatrix() {
    int size = matrix.length;

    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if (row + col == size - 1) {
          continue;
        }

        if (row + col < size - 1) {
          int flipRow = size - 1 - col;
          int flipcol = size - 1 - row;

          swap(row, col, flipRow, flipcol);
        }
      }
    }
  }
}
