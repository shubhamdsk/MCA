import java.util.Scanner;

public class ArrSub {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Rows and column : ");
    int r = sc.nextInt();
    int c = sc.nextInt();

    int[][] m1 = new int[r][c];
    int[][] m2 = new int[r][c];
    int[][] add = new int[r][c];
    System.out.println("Enter 1st Matrix: ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        m1[i][j] = sc.nextInt();
      }
    }

    System.out.println("Enter 2nd Matrix: ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        m2[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        add[i][j] = m1[i][j] - m2[i][j];
      }
    }

    System.out.println("Subtraction of two Matrix: ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(add[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
