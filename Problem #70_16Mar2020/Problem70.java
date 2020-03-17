import java.util.*;

class Problem70 {
  public static void main(String[] args) {
    int n = readInt("Enter a number: ");
    int perfectNum = 0, digit = 0;
    if (n <= 10)
    {
      digit = 10 - n;
      String s = Integer.toString(n) + Integer.toString(digit);
      perfectNum = Integer.parseInt(s);
      System.out.println("Result: " + perfectNum);
    }
    else{
      System.out.println("n is more than 10!");
    }


  }

  public static int readInt(String prompt) {
    int input = 0;
    boolean valid = false;
    while (!valid) {
      try {
        input = Integer.parseInt(readString(prompt));
        valid = true;
      } catch (NumberFormatException e) {
        System.out.println("*** Please enter an integer ***");
      }
    }
    return input;
  }

  public static String readString(String prompt) {
    System.out.print(prompt);
    return new Scanner(System.in).nextLine();
  }
}
