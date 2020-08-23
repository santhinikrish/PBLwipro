package StringAndStringBuffer;

import java.util.Scanner;

public class RemoveX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		if(a.charAt(0)==a.charAt(a.length()-1)) {
			if(a.charAt(0)=='x'||a.charAt(0)=='X') {
				System.out.println(a.substring(1,a.length()-1));
			}else {
				System.out.println(a);
			}
		}else {
			System.out.println(a);
		}
		sc.close();
	}
}
