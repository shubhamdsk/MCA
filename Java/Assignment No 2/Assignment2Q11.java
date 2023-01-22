// 11)  Write a java program to validate PAN number and Mobile Number. If it is invalid then throw user defined Exception “Invalid Data”, otherwise display it.
import java.util.Scanner;

class Invalid_Data extends Exception {}

public class Assignment2Q11 {

  static int n;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      do {
        System.out.println("\n1.Phone Number \n2.PAN Number ");
        System.out.println("Enter Your Choice : ");
        n = sc.nextInt();
        switch (n) {
          case 1:
            System.out.println("Enter Phone Number : ");
            Long ph = sc.nextLong();
            if (ph.toString().matches("(0/91)?[7-9][0-9]{9}")) {
              System.out.println("Enterred Phone No " + ph + " is Correct");
            } else {
              throw new Invalid_Data();
            }
            break;
          case 2:
            System.out.println("Enter PAN Number : ");
            String pan = sc.next();
            if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
              System.out.println("Enterred Pan No " + pan + " is Correct");
            } else {
              throw new Invalid_Data();
            }
            break;
          default:
            throw new Invalid_Data();
        }
      } while (n < 3);
    } catch (Invalid_Data id) {
      System.out.println("Invalid Credentials");
    } finally {
      sc.close();
    }
  }
}
