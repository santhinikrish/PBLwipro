package FlowControlStatements;

import java.util.Scanner;

public class AlphabetToggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(Character.isLowerCase(a)) {
			System.out.print(a+"->"+Character.toUpperCase(a));
		}else {
			System.out.print(a+"->"+Character.toLowerCase(a));
		}
		sc.close();
	}

}
