package StringAndStringBuffer;

import java.util.Scanner;

public class CopiesString {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String a=s.substring(0,2);
		int l=s.length();
		for(int i=0;i<l;i++)
		System.out.print(a);
		sc.close();
	}
}
