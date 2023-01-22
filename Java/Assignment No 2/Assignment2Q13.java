// 13) Write a program that generates a custom exception if age entered for voting in election is less than 18 years.
import java.util.Scanner;
class Invalid_Data extends Exception {

}
public class Assignment2Q13 {

  public static void main(String[] args) throws Invalid_Data {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Age : ");
    int age = sc.nextInt();

    if (age < 18) {
      throw new Invalid_Data();
    } else {
      System.out.println("You Can vote !");
    }

  }
}
