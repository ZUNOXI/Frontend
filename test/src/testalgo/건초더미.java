package testalgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 건초더미 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			int sum = 0;
			for(int j = 0; j<n; j++) {
				arr.add(scn.nextInt());
				sum = sum + arr.get(j);
			}
			int avg = sum/n;
			int cnt = 0; 
			if(n == 1) {
				cnt = 0;
			}
			else {
				for(int j = 0; j<n; j++) {
					if(arr.get(j)>avg) {
						cnt = cnt + arr.get(j)-avg;
					}
				}
			}
			System.out.println("#"+(i+1)+" "+cnt);
		}
	}

}
