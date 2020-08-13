package FlowControlStatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,sum=0;
		while(temp>0) {
			sum=sum*10+temp%10;
			temp/=10;
		}
		System.out.println(sum);
		sc.close();
	}

}
