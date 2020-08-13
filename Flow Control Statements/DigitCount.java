package FlowControlStatements;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		while(n>0) {
			c+=n%10;
			n/=10;
		}
		System.out.println(c);
		sc.close();
	}
}
