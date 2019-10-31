package testalgo;

import java.util.Scanner;

public class 두가지빵의딜레마 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = scn.nextInt();
			int max = c/(Math.min(a, b));
			
			System.out.println("#"+(i+1)+" "+max);
		}
	}

}
