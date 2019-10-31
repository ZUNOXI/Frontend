import java.util.LinkedList;
import java.util.Scanner;

public class 원자소멸시뮬레이션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			LinkedList<Integer>[]list = new LinkedList[n+1];
			for(int j = 1; j<=n; j++){
				list[j] = new LinkedList<>();
			}
			for(int j = 1; j<=n; j++) {
				int a = scn.nextInt()+1000;
				int b = scn.nextInt()+1000;
				list[j].add(a);
				list[j].add(b);
				list[j].add(scn.nextInt());
				list[j].add(scn.nextInt());
			}
			
		}
	}

}
