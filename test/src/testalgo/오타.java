package testalgo;

import java.util.ArrayList;
import java.util.Scanner;

public class 오타 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			String s = scn.next();
			long cnt = 1;
			if(s.length()==1) {
				cnt = 1%1000000007;
			}
			else {
				for(int j = 0; j<s.length(); j++) {
					if(j==0) {
						if(s.charAt(j)!=s.charAt(j+1)) {
							cnt = (cnt * 2)%1000000007;
						}
					}
					else if(j==s.length()-1) {
						if(s.charAt(j)!=s.charAt(j-1)) {
							cnt = (cnt * 2)%1000000007;
						}
					}
					else {
						if(s.charAt(j)!=s.charAt(j-1) && s.charAt(j)!=s.charAt(j+1)
								&& s.charAt(j-1) != s.charAt(j+1)){
							cnt = (cnt * 3)%1000000007;
						}
						else if(s.charAt(j)!=s.charAt(j-1) || s.charAt(j)!=s.charAt(j+1)) {
							cnt = (cnt * 2)%1000000007;
						}
					}
				}
			}
			System.out.println("#"+(i+1)+" "+cnt%1000000007);
		}
	}

}
