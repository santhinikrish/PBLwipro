package FlowControlStatements;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Not a prime");
				sc.close();
				return;
			}
		}
		System.out.println("Prime Number");
		sc.close();
	}

}
