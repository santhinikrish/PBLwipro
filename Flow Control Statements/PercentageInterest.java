package FlowControlStatements;

import java.util.Scanner;

public class PercentageInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		if(n>=1 && n<=58) {
			if(s.equals("Female"))
				System.out.print("8.2%");
			else
				System.out.print("8.4%");
		}else if(n>=59 && n<=100) {
			if(s.equals("Female"))
				System.out.print("9.2%");
			else
				System.out.print("10.5%");
		}
		sc.close();
	}

}
