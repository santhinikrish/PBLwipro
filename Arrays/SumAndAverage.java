package Arrays;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,3,2,5,2,6,1};
		int sum=0;
		for(int i=0;i<8;i++) {
			sum+=a[i];
		}
		System.out.println(sum+" "+sum/8);
	}

}
