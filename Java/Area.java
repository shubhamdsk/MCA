import java.util.Scanner;

interface shape {
  final double pi = 3.142d;
  void check(int r);
}

class circle implements shape {
  public void check(int r) {
    double area = pi * r * r;
    System.out.println("Area of Circle : " + area);
  }
}

class sphere implements shape {
  public void check(int r) {
    double area_sp = 4 * pi * r * r;
    System.out.println("Area of Circle : " + area_sp);
  }
}

public class Area {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius : ");
    int rad = sc.nextInt();

    circle c = new circle();
    c.check(rad);

    sphere s = new sphere();
    s.check(rad);

    sc.close();
  }
}
