import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Please enter the size of your matrix: ");
  int size = scanner.nextInt();

  System.out.println("\nYour matrix is " + size + "x" + size + "\n");

  Matrix m = new Matrix(size);

  System.out.println("Printing matrix with default values:");
  m.printDefultMatrix();

  System.out.print("\nPopulating matrix...");
  m.populateMatrix();
  System.out.println("matrix populated\n");

  System.out.println("Printing matrix:");
  m.printMatrix();

  System.out.println("Flipping matrix...\n");
  m.flipMatrix();
  System.out.println("matrix flipped\n");
  m.printMatrix();


  scanner.close();

  }
}
