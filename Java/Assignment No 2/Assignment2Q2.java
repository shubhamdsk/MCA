// 2)  Create abstract class Shape with abstract method area().Write a Java program to calculate are of Rectangle and Triangle.(Inherit Shape class in classes Rectangle and Triangle )
import java.util.Scanner;
abstract class shape {
  abstract void area();
}
class Rectangle extends shape {
  int l, b;

  Rectangle(int l, int b) {
    this.l = l;
    this.b = b;
  }

  public void area() {
    int area = l * b;
    System.out.println("Area of Rectangle : " + area);
  }
}

class Triangle extends shape {
  int base, height;
  Triangle(int base, int height) {
    this.base = base;
    this.height = height;
  }
  public void area() {
    double area = 0.5 * (base * height);
    System.out.println("Area of Triangle : " + area);
  }
}
public class Assignment2Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length & breadth of Rectangle : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    Rectangle r = new Rectangle(a, b);
    r.area();

    System.out.println("Enter Base & Height of Triangle : ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    Triangle t = new Triangle(x, y);
    t.area();
    sc.close();
  }
}