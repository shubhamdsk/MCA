/*
  Q1.reate a package Mathematics with two classes Maximum and Power. Write a java program to accept two numbers from user and perform the following operations on it: a. Find Maximum of two numbers. b. Calculate the power (X, Y); 
 */
import mathematics.*;
import java.util.*;
public class Assignment2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two No :" );
        int a=sc.nextInt();
        int b= sc.nextInt();

        Maximum m = new Maximum(a,b);
        m.display();

        Power p = new Power(a,b);
        p.disp();
        sc.close();
    }
}