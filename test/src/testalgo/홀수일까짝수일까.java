package testalgo;

import java.util.Scanner;

public class 홀수일까짝수일까 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			String s = scn.next();
			int n = (s.charAt(s.length()-1)-'0');
			System.out.println("#"+(i+1)+" ");
			if(n%2==0) {
				System.out.print("Even");
			}
			else {
				System.out.print("Odd");
			}
			System.out.println();
		}
	}

}
