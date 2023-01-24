// 12).Write a program in java to enter the number through command line argument if first and second number is not entered it will generate the exception. Also divide the first number with second number and generate the arithmetic exception .
class Invalid_Input extends Exception {}

public class Assignment2Q12 {

  public static void main(String[] args)  {
    try {
      if (args.length < 2) {
        throw new Invalid_Input();
      } else {
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        if (b == 0) {
          throw new ArithmeticException();
        } else {
          double div = a / b;
          System.out.println("Division of " + a + " & " + b + " is :" + div);
        }
      }
    } catch (Invalid_Input e) {
      System.out.print("Please Enter Two Numbers through Command Line");
    } catch (ArithmeticException e) {
      System.out.print(e);
    }
  }
}
