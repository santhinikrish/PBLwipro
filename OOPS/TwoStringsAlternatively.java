package StringAndStringBuffer;

import java.util.Scanner;

public class TwoStringsAlternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next(),b=sc.next();
		for(int i=0;i<a.length()||i<b.length();i++) {
			if(i<a.length())
				System.out.print(a.charAt(i));
			if(i<b.length())
				System.out.print(b.charAt(i));
		}
		sc.close();
	}

}
