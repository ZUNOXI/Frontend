package testalgo;

import java.util.Scanner;

public class 다솔이의월급상자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			double [] darr = new double[n];
			double [] narr = new double[n];
			double sum = 0.0;
			for(int j = 0; j<n; j++) {
				darr[j] = scn.nextDouble();
				narr[j] = scn.nextDouble();
				sum = sum + darr[j]*narr[j];
				}
			System.out.print("#"+(i+1)+" ");
			System.out.printf("%6f",sum);
			System.out.println();
		}
	}

}
