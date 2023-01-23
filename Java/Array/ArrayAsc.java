import java.util.Scanner;

public class ArrayAsc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array: ");
    int n = sc.nextInt();

    int[] a = new int[n];
    System.out.println("Enter " + n + " array elements : ");
    for (int i = 0; i < n; i++) {
      System.out.print("Enter " + (i + 1) + " elements : ");
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          int t = a[i];
          a[i] = a[j];
          a[j] = t;
        }
      }
    }
    System.out.println("Ascending Arrray : ");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }

    sc.close();
  }
}
