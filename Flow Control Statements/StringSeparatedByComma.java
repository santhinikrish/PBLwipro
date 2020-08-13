package FlowControlStatements;

import java.util.Scanner;

public class StringSeparatedByComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] a=s.split(" ");
		if(a.length==0) {
			System.out.println("No Values");
		}else {
			for(int i=0;i<a.length;i++)
				if(i==a.length-1) {
					System.out.print(a[i]);
					break;
				}else{
					System.out.print(a[i]+",");
				}
		}
		sc.close();
	}

}
