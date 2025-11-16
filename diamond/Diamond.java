import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string:");
    int input = scanner.nextInt();

    if (input % 2 == 0) {
      System.out.println("even");
    } else {
      for (int j = input / 2, i = 0; i != (input/2); i++, j--){
        int spaceCounter = j;
        int asteriskCounter = (2*i)+1;

        if (i == (input/2)-1){
          System.out.println("ahhhh broke");
        }else{
          while (spaceCounter-- > 0){
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
