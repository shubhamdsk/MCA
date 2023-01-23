import java.util.Scanner;

public class MultiArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Rows and column : ");
    int r = sc.nextInt();
    int c = sc.nextInt();

    int[][] m = new int[r][c];
    System.out.println("Enter array elements : ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        m[i][j] = sc.nextInt();
      }
    }

    System.out.println("Array elements : ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(m[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
