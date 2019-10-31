import java.util.Scanner;

public class 사각형칠하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int k = scn.nextInt();
			int [][] arr = new int[n][m];
			for(int j = 0; j<k; j++) {
				int x1 = scn.nextInt();
				int y1 = scn.nextInt();
				int x2 = scn.nextInt();
				int y2 = scn.nextInt();
				int col = scn.nextInt();
				int cnt = 0;
				for(int x = x1; x<x2+1; x++) {
					for(int y = y1; y<y2+1; y++) {
						if(arr[x][y]<=col) {
							cnt++;
						}
					}
				}
				int land = (x2-x1+1)*(y2-y1+1);
				if(cnt==land) {
					for(int x = x1; x<x2+1; x++) {
						for(int y = y1; y<y2+1; y++) {
							if(arr[x][y]<=col) {
								arr[x][y]=col;
							}
						}
					}
				}
			}
			int [] narr = {0,1,2,3,4,5,6,7,8,9,10};
			int cntr;
			int max = 0;
			for(int z = 0; z<11; z++) {
				cntr = 0;
				for(int x = 0; x<n; x++) {
					for(int y = 0; y<m; y++) {
						if(arr[x][y]==narr[z]) {
							cntr++;
						}
					}
				}
				if(cntr>max) {
					max = cntr;
				}
			}
			System.out.println("#"+(i+1)+" "+max);
		}
	}

}
