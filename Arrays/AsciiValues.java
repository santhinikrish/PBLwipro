package Arrays;

import java.util.*;

public class AsciiValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.print((char)a[i]+" ");
		}
		sc.close();
	}

}
