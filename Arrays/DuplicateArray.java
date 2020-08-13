package Arrays;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]!=-1) {
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						a[j]=-1;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]!=-1)
				System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
