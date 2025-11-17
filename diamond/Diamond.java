import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string:");
    int input = scanner.nextInt();

    if (input % 2 == 0) {
      System.out.println("even");

    } else {

      for (int i = 0; i != input; i++){
        int center = input / 2;

        if (i <= center) {
        int asteriskCounter = (2 * i) + 1;
        int spaceCounter = center - i;

          while (spaceCounter-- > 0) {
            System.out.print(" ");
          }

          while (asteriskCounter-- > 0){
            System.out.print("*");
          }

          System.out.print("\n");

        }else {
        int mirror = (input - 1) - i;
        int asteriskCounter = (2 * mirror) + 1;
        int spaceCounter = center - mirror;

          while (spaceCounter-- > 0) {
            System.out.print(" ");
          }

          while (asteriskCounter-- > 0){
            System.out.print("*");
          }

          System.out.print("\n");
        }
      }
    }
    scanner.close();
  }
}
