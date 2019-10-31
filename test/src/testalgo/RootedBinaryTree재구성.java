package testalgo;

import java.util.Scanner;

public class RootedBinaryTree재구성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int k = scn.nextInt();
			int [] arr = new int[(int) (Math.pow(2, k)-1)];
			for(int j = 0; j<arr.length; j++) {
				arr[j] = scn.nextInt();
			}
			System.out.print("#"+(i+1)+" ");
			for(int j = 0; j<k; j++) {
				for(int x = (int) (Math.pow(2, k-j-1)-1); x<arr.length; x+=Math.pow(2, k-j) ) {
					System.out.print(arr[x]+" ");
				}
				System.out.println();
			}
		}
	}

}
