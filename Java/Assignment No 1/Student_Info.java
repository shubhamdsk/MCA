import java.util.Scanner;

class info {

  Scanner sc = new Scanner(System.in);
  String name;
  int s1, s2, s3, s4, s5;
  float Per, Total;

  public void getDetails() {
    System.out.println("Enter Student Name :");
    name = sc.nextLine();
    System.out.println("Enter 5 subject Marks : ");
    System.out.println("Enter 1st subject mark :");
    s1 = sc.nextInt();
    System.out.println("Enter 2nd subject mark :");
    s2 = sc.nextInt();
    System.out.println("Enter 3rd subject mark :");
    s3 = sc.nextInt();
    System.out.println("Enter 4th subject mark :");
    s4 = sc.nextInt();
    System.out.println("Enter 5th subject mark :");
    s5 = sc.nextInt();
  }

  public void display() {
    Total = s1 + s2 + s3 + s4 + s5;
    Per = Total / 5;
    System.out.println("Student Name : " + name);
    System.out.println("Total : " + Total);
    System.out.println("Percentage : " + Per);
  }
}

public class Student_Info {

  public static void main(String[] args) {
    info stud = new info();
    stud.getDetails();
    stud.display();
  }
}
