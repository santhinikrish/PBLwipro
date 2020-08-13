package FlowControlStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String n1=b.readLine();
		if(n1.equals(""))
		{
			System.out.println("Please enter the month in numbers");
		}else{
			int n=Integer.parseInt(n1);
			switch(n) {
				case 1:
					System.out.println("January");
					break;
				case 2:
					System.out.println("Feburary");
					break;
				case 3:
					System.out.println("March");
					break;
				case 4:
					System.out.println("Apirl");
					break;
				case 5:
					System.out.println("May");
					break;
				case 6:
					System.out.println("June");
					break;
				case 7:
					System.out.println("July");
					break;
				case 8:
					System.out.println("August");
					break;
				case 9:
					System.out.println("September");
					break;
				case 10:
					System.out.println("October");
					break;
				case 11:
					System.out.println("November");
					break;
				case 12:
					System.out.println("December");
					break;
				default:
					System.out.println("Invalid Code");
					break;
			}
		}
	}

}
