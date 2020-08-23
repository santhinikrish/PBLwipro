package StringAndStringBuffer;

import java.util.Scanner;

public class RemoveFirstNdLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(s.substring(1,s.length()-1));
		sc.close();
	}
}
