// 3) Write a java program to calculate area of Cylinder and Circle.(Use super keyword)
import java.util.Scanner;
class staff {

  int r, h;
  final double pi = 3.142;

  staff(int r) {
    this.r = r;
  }

  staff(int r, int h) {
    this.r = r;
    this.h = h;
  }
}

class circle extends staff {

  public circle(int r) {
    super(r);
  }

  public void area() {
    double area = pi * r * r;
    System.out.println("Area of Circle : " + area);
  }
}

class cylinder extends staff {

  public cylinder(int r, int h) {
    super(r, h);
  }

  public void area() {
    double area = 2 * pi * r * h + 2 * pi * r * r;
    System.out.println("Area of Cylinder: " + area);
  }
}

public class Assignment2Q3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nCircle");
    System.out.println("Enter Radius : ");
    int r = sc.nextInt();
    circle c = new circle(r);
    c.area();

    System.out.println("\nCylinder");
    System.out.println("Enter Radius : ");
    int rc = sc.nextInt();
    System.out.println("Enter Height : ");
    int h = sc.nextInt();
    cylinder cyl = new cylinder(rc, h);
    cyl.area();

    sc.close();
  }
}
