class Main {
  public static void main(String[] args) {
    String str = "abcdea";
    boolean isPalindrome = true;
    // Remove spaces
    String stringWithoutSpaces = str.replaceAll("\\s", "");
    int rightIndex = stringWithoutSpaces.length() - 1;
    for(int i = 0; i < stringWithoutSpaces.length(); i++)
    {
      // System.out.println("i " + i + " rightIndex-i: " + (rightIndex-i));
      if (i < (rightIndex-i))
      {
        if (stringWithoutSpaces.charAt(i) != stringWithoutSpaces.charAt(rightIndex-i))
        {
          isPalindrome = false;
          break;
        }
      }
      else
      {
        break;
      }       
    }

    if (isPalindrome)
      System.out.println("String " + str + " is palindrome!");
    else
      System.out.println("String " + str + " is not palindrome!");
  }
}