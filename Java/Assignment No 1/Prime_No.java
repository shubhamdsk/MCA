import  java.util.*;
public class Prime_No {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No : ");
        int n = sc.nextInt();
        int count = 0;
        if (n <= 1) {
            System.out.println("The number is not prime");
        }
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("The number is not prime");
        }
        else {
            System.out.println("The number is prime");
        }
        sc.close();
    }
}
