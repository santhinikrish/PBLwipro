package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Minimum of is "+a[1]);
		System.out.println("Maximum of is "+a[n-2]);
		sc.close();
	}

}
