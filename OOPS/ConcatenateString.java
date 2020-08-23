package StringAndStringBuffer;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		if(a.charAt(a.length()-1)==b.charAt(0)) {
			System.out.println(a+b.substring(1));
		}else {
			System.out.println(a+b);
		}
		sc.close();
	}

}
