package FlowControlStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FloydsTriangle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String c=b.readLine();
		if(c.equals("")) {
			System.out.print("Enter the Integer value");
		}else {
			int n=Integer.parseInt(String.valueOf(c));
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

}
