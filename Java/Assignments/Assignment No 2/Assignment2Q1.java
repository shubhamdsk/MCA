import java.util.Scanner;

// 1) Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private instance variables routeNumber in Bus and manufacturerName in Car and both of them having showData ( ) method showing all details of Bus and Car respectively with content of the super class’s showData ( ) method.

class vehicle {

  Scanner sc = new Scanner(System.in);
  protected int RegNo, speed;
  protected String color, ownerName;

  public void showData() {
    System.out.println("This is a vehicle class");
  }
}

class Bus extends vehicle {

  private int routenNo;

  public void getData() {
    System.out.print("Enter Reg No: ");
    RegNo = sc.nextInt();
    System.out.print("Enter Speed : ");
    speed = sc.nextInt();
    System.out.print("Enter Color : ");
    color = sc.next();
    System.out.print("Enter Owner Name : ");
    ownerName = sc.next();
    System.out.print("Enter Route No : ");
    routenNo = sc.nextInt();
    super.showData();
  }


  public void showData() {
    System.out.println("\nBus Information\n");
    System.out.println("Reg No: " + RegNo);

    System.out.println("Speed : " + speed);

    System.out.println("Color : " + color);

    System.out.println("Owner Name : " + ownerName);

    System.out.println("Route No : " + routenNo);
  }
}

class Car extends vehicle {

  private String manufacturerName;

  public void getData() {
    
    System.out.print("Enter Reg No: ");
    RegNo = sc.nextInt();
    System.out.print("Enter Speed : ");
    speed = sc.nextInt();
    System.out.print("Enter Color : ");
    color = sc.next();
    System.out.print("Enter Owner Name : ");
    ownerName = sc.next();
    System.out.print("Enter Manufacturer Name : ");
    manufacturerName = sc.next();
    super.showData();
  }

  public void showData() {
    System.out.println("\nCar Information\n");
    System.out.println("Reg No: " + RegNo);

    System.out.println("Speed : " + speed);

    System.out.println("Color : " + color);

    System.out.println("Owner Name : " + ownerName);

    System.out.println("Manufacturer Name : " + manufacturerName);
  }
}

public class Assignment2Q1 {

  public static void main(String[] args) {
    Bus b = new Bus();
    b.getData();
    b.showData();

    Car c = new Car();
    c.getData();
    c.showData();
  }
}
