package FlowControlStatements;

public class PrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=99;i++) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag++;
				}
			}
			if(flag==0) {
				System.out.print(i+" ");
			}
		}
	}

}
