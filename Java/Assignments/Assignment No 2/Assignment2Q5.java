// 5)   Create an abstract class Shape with methods calc_area() & calc_volume(). Derive two classes Sphere(radius)& Cone(radius, height) from it. Calculate area and volume of both. (Use Method Overriding)
import java.util.Scanner;
abstract class shape {

  final double pi = 3.142;

  abstract void calc_area();

  abstract void calc_volume();
}

class sphere extends shape {

  int radius;

  sphere(int radius) {
    this.radius = radius;
  }

  @Override
  void calc_area() {
    double area = 4 * pi * radius * radius;
    System.out.println("Area of Sphere : " + area);
  }

  @Override
  void calc_volume() {
    double volume = (4 / 3) *( pi * radius * radius * radius);
    System.out.println("Volume of Sphete : " + volume);
  }
}

class cone extends shape {

  int radius, height;

  cone(int radius, int height) {
    this.radius = radius;
    this.height = height;
  }

  @Override
  void calc_area() {
    double area_cone = pi * radius * height;
    System.out.println("Area of Cone : " + area_cone);
  }

  @Override
  void calc_volume() {
    double vol = (pi * radius * radius * height) / 3;
    System.out.println("Volume of Cone is :" + vol);
  }
}

public class Assignment2Q5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius : ");
    int r = sc.nextInt();
    sphere s = new sphere(r);
    s.calc_area();
    s.calc_volume();

    System.out.println("Enter Height : ");
    int h = sc.nextInt();

    cone c = new cone(r, h);
    c.calc_area();
    c.calc_volume();
    sc.close();
  }
}
