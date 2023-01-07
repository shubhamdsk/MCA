import java.util.Scanner;

class Account {

  Scanner sc = new Scanner(System.in);
  int AccNo;
  double Bal;

  public void accOpen() {
    System.out.println("Enter Account No: ");
    AccNo = sc.nextInt();
    System.out.println("Enter Balance");
    Bal = sc.nextDouble();
  }
}

class saving extends Account {

  float interest_rate;

  public void Int_rate() {
    System.out.println("Enter Interest rate:");
    interest_rate = sc.nextFloat();
  }

  public void deposit() {
    System.out.println("How much amount you want to deposit : ");
    double dep = sc.nextDouble();
    Bal = Bal + dep;
    System.out.println("Balance after deposit amount : " + Bal);
  }

  public void checkbalance() {
    Bal = Bal + (Bal * (interest_rate / 100));
    System.out.println("Your Balance : " + Bal);
  }

  public void withdraw() {
    System.out.println("How much money you want to withdraw : ");
    double withdawamt = sc.nextDouble();
    if (withdawamt > Bal) {
      System.out.println("Insufficient Balance");
    } else {
      System.out.println("Rs." + withdawamt + " withdraw Successfully");
      Bal = Bal - withdawamt;
      System.out.println("Balance after withdrawing money : " + Bal);
    }
  }

  public void operation() {
    int ch;
    do {
      System.out.println("1.Deposit\n2.Check Balance\n3.Withdraw");
      System.out.println("Enter your choice : ");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          deposit();
          break;
        case 2:
          checkbalance();
          break;
        case 3:
          withdraw();
          break;
      }
    } while (ch <= 3);
  }
}

class current extends Account {

  int over_draft_limit;

  public void draft_limit() {
    System.out.println("Enter Limit :");
    over_draft_limit = sc.nextInt();
  }

  public void withdraw() {
    System.out.println("How much money you want to withdraw : ");
    double withdawamt = sc.nextDouble();
    if (over_draft_limit > Bal) {
      System.out.println("Insufficient Balance");
    } else {
      if (withdawamt > over_draft_limit) {
        System.out.println("Insufficient Balance");
      } else {
        System.out.println("Rs." + withdawamt + " withdraw Successfully");
        Bal = Bal - withdawamt;
        System.out.println("Balance after withdrawing money : " + Bal);
      }
    }
  }
}

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("1.Saving\n2.Current");
      System.out.println("Enter Account type :");
      int acc = sc.nextInt();
      switch (acc) {
        case 1:
          saving s = new saving();
          s.accOpen();
          s.Int_rate();
          s.operation();
          break;
        case 2:
          current c = new current();
          c.accOpen();
          c.draft_limit();
          c.withdraw();
          break;
        default:
          System.exit(0);
      }
    }
  }
}
