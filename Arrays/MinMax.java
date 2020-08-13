package Arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,34,78,16,83,95,65};
		int max=a[0],min=a[0];
		for(int i=0;i<7;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min+" "+max);
	}

}
