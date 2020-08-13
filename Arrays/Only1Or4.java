package Arrays;

import java.util.Scanner;

public class Only1Or4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]==1 || a[i]==4) {
				count++;
			}
		}
		if(count==n) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		sc.close();
	}

}
