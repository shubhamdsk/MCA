package math;

public class pow {
  int N, P;
  public pow(int a, int b) {
    N = a;
    P = b;
  }

  public void disp() {
    int pow = 1;
    for (int i = 1; i <= P; i++) {
      pow = pow * N;
    }
    System.out.println("Power of "+N+ " is :"+pow);
  }
}
