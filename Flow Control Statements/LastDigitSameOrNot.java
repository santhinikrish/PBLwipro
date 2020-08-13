package FlowControlStatements;

import java.util.Scanner;

public class LastDigitSameOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if((num1%10)==(num2%10)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		sc.close();
	}

}
