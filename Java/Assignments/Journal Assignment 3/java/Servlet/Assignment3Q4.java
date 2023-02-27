package com.Assignment3;

class Customer {

  int amount = 10000;

  synchronized void withdraw(int amount) {
    System.out.println("Going to Withdraw..");
    if (this.amount < amount) {
      System.out.println("Less Balance , waiting for deposit");
      try {
        wait();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    this.amount = this.amount - amount;
    System.out.println("Withdrawal Completed");
  }

  synchronized void deposit(int amount) {
    System.out.println("Going to Deposit");
    this.amount = this.amount + amount;
    System.out.println("Deposit Completed");
    notify();
  }
}

public class Assignment3Q4 {

  public static void main(String[] args) {
    Customer c = new Customer();
    
    new Thread() {
      public void run() {
        c.withdraw(15000);
      }
    }
      .start();
    new Thread() {
      public void run() {
        c.deposit(10000);
      }
    }
      .start();
  }
}
