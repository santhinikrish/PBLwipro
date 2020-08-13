package Arrays;

import java.util.Scanner;

public class SumCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int in1=-1,in2=-1;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]==6) {
				in1=i;
			}
			if(a[i]==7) {
				in2=i;
			}
		}
		int sum=0;
		if(in1<in2) {
			if(in1!=-1 && in2!=-1) {
				for(int i=0;i<in1;i++) {
					sum+=a[i];
				}
				for(int i=in2+1;i<n;i++) {
					sum+=a[i];
				}
			}else {
				for(int i=0;i<n;i++) {
					sum+=a[i];
				}
			}
		}else {
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
