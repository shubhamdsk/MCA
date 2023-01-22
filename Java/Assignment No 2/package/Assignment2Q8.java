// 8)  Create a package vehicle which will have 2 classes as class two-wheeler and four-wheeler. Twowheeler with method disp. (cc, price), Four-wheeler with method show (regno., regyear).
import java.util.*;
import math.*;

public class Assignment2Q8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter CC : ");
    int cc = sc.nextInt();
    System.out.println("Enter Price : ");
    int price = sc.nextInt();

    TwoWheeler tw = new TwoWheeler();
    tw.disp(cc, price);

    System.out.println("Enter Reg No : ");
    int regNo = sc.nextInt();
    System.out.println("Enter Reg Year : ");
    int regYear = sc.nextInt();
    FourWheeler fw = new FourWheeler();
    fw.show(regNo, regYear);
    sc.close();
  }
}
