import java.util.Scanner;

public class student{

public static void main(String args[]){

Scanner SC=new Scanner(System.in);

System.out.println("Enter the number of students");

int n = SC.nextInt();

String name[] = new String[n];

int roll[] = new int[n];

int[][] marks = new int[n][5];

int[] sum = new int[n];

for(int i=0; i<n; i++){

System.out.println("Student Detail "+i);

System.out.print("Enter Name: ");

SC.nextLine();

name[i]=SC.nextLine();
System.out.print("Enter 5 marks subject of student(one by one): ");

for(int j=0; j<5; j++){

marks[i][j] = SC.nextInt();

sum[i] = sum[i] + marks[i][j];

}

}

int max=0, j=0;

for(int i=0; i<n; i++){

if(sum[i] > max){

max = sum[i];

j = i;

}

}

System.out.println("Student "+name[j]+" having roll no has max marks"+max);

}

}