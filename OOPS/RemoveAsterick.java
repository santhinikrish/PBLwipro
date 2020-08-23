package StringAndStringBuffer;

import java.util.Scanner;

public class RemoveAsterick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int in=s.indexOf('*');
		for(int i=0;i<in-1;i++) {
			System.out.print(s.charAt(i));
		}
		for(int i=in+2;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
		sc.close();
	}

}
