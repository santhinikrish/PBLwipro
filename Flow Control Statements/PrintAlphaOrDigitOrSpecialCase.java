package FlowControlStatements;

import java.util.Scanner;

public class PrintAlphaOrDigitOrSpecialCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(Character.isAlphabetic(c)) {
			System.out.println("Alphabet");
		}else if(Character.isDigit(c)) {
			System.out.println("Digit");
		}else {
			System.out.println("Special Character");
		}
		sc.close();
	}

}
