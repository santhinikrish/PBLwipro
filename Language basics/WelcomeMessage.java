package LanguageBasics;

import java.util.Scanner;

public class WelcomeMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Welcome "+name);
		sc.close();
	}

}
