//10)Write a java program to accept a number from user, If it is greater than 100 then throw user defined exception “Number is out of Range” otherwise do the addition of digits of that number. (Use static keyword)
import java.util.Scanner;

class NoOutOfRange extends Exception {}

public class Assignment2Q10 {

  static int n;

  public static void main(String[] args) throws NoOutOfRange {
    Scanner sc = new Scanner(System.in);
    int sum = 0, r;
    System.out.println("Enter No : ");
    int no = sc.nextInt();
    n = no;
    if (no > 100) {
      throw new NoOutOfRange();
    } else {
      while (no > 0) {
        r = no % 10;
        sum = sum + r;
        no = no / 10;
      }
      System.out.println("Sum of digits in " + n + " is : " + sum);
    }
    
  }
}
