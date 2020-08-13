package LanguageBasics;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("The sum of "+num1+" and "+num2+" is "+(num1+num2));
		sc.close();
	}

}
