package Arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		int e=0;
		for(int i=0;i<n;i++) {
			if(a[i]==s) {
				e=i;
			}
		}
		if(e==0)
			System.out.println("-1");
		else
			System.out.println(e);
		sc.close();
	} 
}
