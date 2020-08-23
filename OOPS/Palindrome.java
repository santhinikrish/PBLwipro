package StringAndStringBuffer;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		StringBuffer s=new StringBuffer(a);
		if(s.reverse().toString().equals(a)) {
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		sc.close();
	}

}
