// 4)  Define an Interface Shape with abstract method area(). Write a java program to calculate an area of Circle and Sphere.(use final keyword)
import java.util.*;

interface shape {
  void area(int r);
  final double pi = 3.142;
}

class Circle implements shape {

  public void area(int r) {
    double area = pi * r * r;
    System.out.println("Area of Circle : " + area);
  }
}

class Sphere implements shape {

  public void area(int r) {
    double area = 4 * pi * r * r;
    System.out.println("Area of Sphere : " + area);
  }
}

public class Assignment2Q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius : ");
    int r = sc.nextInt();

    Circle c = new Circle();
    c.area(r);

    Sphere s = new Sphere();
    s.area(r);
    sc.close();
  }
}
