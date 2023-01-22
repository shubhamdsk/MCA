// Write a program in java to enter the number through command line argument if first and second number is not entered it will generate the exception. Also divide the first number with second number and generate the arithmetic exception .
public class Assignment2Q12 {
  public static void main(String[] args) {
   
    try {
      int i = Integer.parseInt(args[0]);
      int j = Integer.parseInt(args[1]);
      double div = i / j;
      System.out.println("Division of " + i + " & " + j + " is :" + div);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Please Enter Two Numbers through Command Line\n"+e);
    }
  }
}
