package StringAndStringBuffer;

import java.util.Scanner;

public class ShortLongString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next(),b=sc.next();
		int l1=a.length(),l2=b.length();
		if(l1<l2) {
			System.out.println(a+b+a);
		}else {
			System.out.println(b+a+b);
		}
		sc.close();
	}
}