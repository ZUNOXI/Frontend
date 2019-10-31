package testalgo;

import java.util.Scanner;

public class 요일맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int temp = scn.nextInt();
			int d = scn.nextInt();
			int sumd = 0;
			int m = temp -1;
			while(m!=0) {
				if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
					sumd = sumd + 31;
					m--;
				}
				else if(m==4||m==6||m==9||m==11) {
					sumd = sumd + 30;
					m--;
				}
				else {
					sumd = sumd + 29;
					m--;
				}
			}
			sumd = sumd + d + 3;
			int result = (sumd%7);
			System.out.println("#"+(i+1)+" "+result);
		}
	}

}
