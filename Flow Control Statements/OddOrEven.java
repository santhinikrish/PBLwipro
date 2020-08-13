package FlowControlStatements;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		sc.close();
	}

}
