package Arrays;

import java.util.Scanner;

public class TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			if(i==1) {
				System.out.print(a[i]+" "+b[i]);
			}
		}
		sc.close();
	}

}
