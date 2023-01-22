// 6)  Define an abstract class Staff with members name &address. Define two sub classes FullTimeStaff(Departmet, Salary) and PartTimeStaff(numberOfHours, ratePerHour). Define appropriate constructors. Create n objects which could be of either FullTimeStaff or PartTimeStaff class by asking the user’s choice. Display details of FulltimeStaff and PartTimeStaff.

import java.util.Scanner;
abstract class Staff {

  String mem_name, address;

  abstract void display();

  Staff(String mem_name, String address) {
    this.mem_name = mem_name;
    this.address = address;
  }
}

class FullTimeStaff extends Staff {

  String Dept;
  int Sal;

  FullTimeStaff(String mem_name, String address, String Dept, int Sal) {
    super(mem_name, address);
    this.Dept = Dept;
    this.Sal = Sal;
  }

  @Override
  void display() {
    System.out.println(
      mem_name + "\t\t" + address + "\t\t" + Dept + "\t\t" + Sal
    );
  }
}

class PartTimeStaff extends Staff {

  int NOH, RPH;

  PartTimeStaff(String mem_name, String address, int NOH, int RPH) {
    super(mem_name, address);
    this.NOH = NOH;
    this.RPH = RPH;
  }

  @Override
  void display() {
    System.out.println(mem_name + "\t\t" + address + "\t\t" + (NOH * RPH));
  }
}

public class Assignment2Q6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ch;
    do {
      System.out.println("\n1.FullTimeStaff \n2.PartTimeStaff");
      System.out.println("Enter Your choice : ");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          System.out.println("Enter No of Member : ");
          int n = sc.nextInt();
          FullTimeStaff[] ft = new FullTimeStaff[n];

          for (int i = 0; i < n; i++) {
            System.out.println("\nEnter " + (i + 1) + " member Information : ");
            System.out.print("Enter Member Name : ");
            String name = sc.next();
            System.out.print("Enter Address :");
            String add = sc.next();
            System.out.print("Enter Department : ");
            String dept = sc.next();
            System.out.print("Enter Salary : ");
            int sal = sc.nextInt();
            ft[i] = new FullTimeStaff(name, add, dept, sal);
          }
          System.out.println(
            "Member Name" +
            "\t" +
            "Address" +
            "\t\t" +
            "Department" +
            "\t" +
            "Salary"
          );
          for (int i = 0; i < n; i++) {
            ft[i].display();
          }

          break;
        case 2:
          System.out.println("Enter No of Member : ");
          int n1 = sc.nextInt();
          PartTimeStaff[] pt = new PartTimeStaff[n1];

          for (int i = 0; i < n1; i++) {
            System.out.println("\nEnter " + (i + 1) + " member Information : ");
            System.out.print("Enter Member Name : ");
            String name = sc.next();
            System.out.print("Enter Address :");
            String add = sc.next();
            System.out.print("Enter No of Hour : ");
            int noh = sc.nextInt();
            System.out.print("Enter Rate Per Hour : ");
            int rph = sc.nextInt();
            pt[i] = new PartTimeStaff(name, add, noh, rph);
          }
          System.out.println(
            "\nMember Name" + "\t" + "Address" + "\t\t" + "Salary"
          );
          for (int i = 0; i < n1; i++) {
            pt[i].display();
          }

          break;
      }
    } while (ch < 3);
    sc.close();
  }
}
