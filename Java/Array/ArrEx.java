import java.util.Scanner;

public class ArrEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array: ");
    int n = sc.nextInt();

    int[] no = new int[n];
    System.out.println("Enter " + n + " array elements : ");
    for (int i = 0; i < n; i++) {
      System.out.print("Enter " + (i + 1) + " elements : ");
      no[i] = sc.nextInt();
    }

    int[] earr = new int[n];
    int[] oarr = new int[n];
    int j = 0, k = 0;
    for (int i = 0; i < n; i++) {
      if (no[i] % 2 == 0) {
        earr[j] = no[i];
        j++;
      } else {
        oarr[k] = no[i];
        k++;
      }
    }
    System.out.println("Original Arrray : ");
    for (int i = 0; i < n; i++) {
      System.out.print(no[i] + "\t");
    }

    System.out.println("\nEven Arrray : ");
    for (int i = 0; i < j; i++) {
      System.out.print(earr[i] + "\t");
    }

    System.out.println("\nOdd Arrray : ");
    for (int i = 0; i < k; i++) {
      System.out.print(oarr[i] + "\t");
    }
    System.out.println("\nNo of elements in Even Array :" + j);
    System.out.println("No of elements in Odd Array :" + k);

    sc.close();
  }
}
