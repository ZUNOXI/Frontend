import java.util.Arrays;
import java.util.Scanner;

public class 셔플오매틱 {
	static int result, n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			n = scn.nextInt();
			result = 0;
			int [] arr = new int[n];
			for(int j = 0; j<n; j++) {
				arr[j] = scn.nextInt();
			}
			int [] tarr = new int [n];
			for(int j = 0; j<n; j++) {
				tarr[j] = arr[j];
			}
			Arrays.sort(tarr);
			int cntt = 0;
			for(int j = 0; j<n; j++) {
				if(tarr[j] == arr[j]) {
					cntt++;
				}
				else {
					break;
				}
			}
			if(cntt == n) {
				result = 0;
			}
			else {
				int cnt = 0;
				int k = 1;
				check(arr,k,cnt);
			}
			System.out.println(result);
		}
	}
	public static void check(int arr[],int k, int x) {
		if(x==5) {
			result = -1;
			return;
		}
		for(int i = 0; i<k; i++) {
			if(x==0) {
				for(int z = 0; z<n; z++) {
					
				}
			}
		}
	}
	public static void check1(int arr[],int x) {
		
	}
	public static void check2(int arr[],int x) {
		
	}
	public static void check3(int arr[],int x) {
		
	}
	public static void check4(int arr[],int x) {
		
	}
	public static void check5(int arr[],int x) {
		
	}
}
