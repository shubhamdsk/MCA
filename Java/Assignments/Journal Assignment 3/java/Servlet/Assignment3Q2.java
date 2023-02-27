package com.Assignment3;

import java.util.*;
import java.util.regex.*;
import java.io.*;
class Assignment3Q2
{
	public static void main(String ar[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String uname,pass;
 		System.out.println("Enter User name:");
		uname=sc.next();
		System.out.println("Enter password:");
		pass=sc.next();

		FileWriter f = new FileWriter("D:\\Shubham\\eclipse\\Assignment 3\\src\\main\\webapp\\password.txt");;
		
		Pattern p=Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%#$]).{8,20})");
		Matcher m=p.matcher(pass);
		if(m.matches())
		{
			f.write(uname+"\n"+pass);
			f.flush();
			System.out.println("Username and Password saved successfully");
			
		}
		else
		{
			System.out.println("Password "+ pass +" is invalid");
		}
	}
}
