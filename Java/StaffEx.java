import java.util.Scanner;

abstract class Staff {

  String mem_name, address;

  abstract void display();
}

class FullTimeStaff extends Staff {

  String Dept;
  double salary;

  FullTimeStaff(String mem_name, String address, String Dept, double salary) {
    this.mem_name = mem_name;
    this.address = address;
    this.Dept = Dept;
    this.salary = salary;
  }

  public void display() {
    System.out.println(
      mem_name + "\t\t" + address + "\t\t" + Dept + "\t\t\t" + salary
    );
  }
}

class PartTimeStaff extends Staff {

  int NOH, RPH;

  PartTimeStaff(String mem_name, String address, int NOH, int RPH) {
    this.mem_name = mem_name;
    this.address = address;
    this.NOH = NOH;
    this.RPH = RPH;
  }

  public void display() {
    System.out.println(mem_name + "\t\t" + address + "\t\t" + (NOH * RPH));
  }
}

public class StaffEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ch;
    do {
      System.out.println("\n1.Full Time\n2.Part Time");
      System.out.println("Enter staff type:");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          System.out.println("How many staff members : ");
          int n = sc.nextInt();
          FullTimeStaff[] fts = new FullTimeStaff[n];
          String mname, dept, address;
          double salary;
          for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " Member Info:");
            System.out.println("Enter Member name:");
            mname = sc.next();
            System.out.println("Enter Address:");
            address = sc.next();
            System.out.println("Enter Department:");
            dept = sc.next();
            System.out.println("Enter Salary:");
            salary = sc.nextDouble();
            fts[i] = new FullTimeStaff(mname, address, dept, salary);
          }
          System.out.println("Name\t\tAddress\t\tDepartment\tSalary");
          for (int i = 0; i < n; i++) {
            fts[i].display();
          }
          break;
        case 2:
          System.out.println("How many staff members : ");
          int n1 = sc.nextInt();
          PartTimeStaff[] pts = new PartTimeStaff[n1];
          String name, daddr;
          int noh, rph;
          for (int i = 0; i < n1; i++) {
            System.out.println("Enter " + (i + 1) + " Member Info:");
            System.out.println("Enter Member name:");
            name = sc.next();
            System.out.println("Enter Address:");
            daddr = sc.next();
            System.out.println("Enter No of Hour:");
            noh = sc.nextInt();
            System.out.println("Enter Rate per Hour:");
            rph = sc.nextInt();
            pts[i] = new PartTimeStaff(name, daddr, noh, rph);
          }
          System.out.println("Name\t\tAddress\t\tSalary");
          for (int i = 0; i < n1; i++) {
            pts[i].display();
          }
        default:
          break;
      }
    } while (ch < 3);
    sc.close();
  }
}
