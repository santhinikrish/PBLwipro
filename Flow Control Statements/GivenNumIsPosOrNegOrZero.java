package FlowControlStatements;

import java.util.*;

public class GivenNumIsPosOrNegOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Negative Integer");
		}else if(n>0) {
			System.out.println("Positive Integer");
		}else {
			System.out.println("Zero");
		}
		sc.close();
	}

}
