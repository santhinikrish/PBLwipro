package StringAndStringBuffer;

import java.util.Scanner;

public class LastNchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		String a=s.substring(s.length()-n);
		for(int i=0;i<n;i++)
		System.out.print(a);
		sc.close();
	}

}
