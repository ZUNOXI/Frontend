package testalgo;

import java.util.Arrays;
import java.util.Scanner;

public class GNS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			String num = scn.next();
			int n = scn.nextInt();
			int [] arr = new int[n];
			for(int j = 0; j<n; j++) {
				String s = scn.next();
				if(s.equals("ZRO")) {arr[j]=0;}
				else if(s.equals("ONE")) {arr[j]=1;}
				else if(s.equals("TWO")) {arr[j]=2;}
				else if(s.equals("THR")) {arr[j]=3;}
				else if(s.equals("FOR")) {arr[j]=4;}
				else if(s.equals("FIV")) {arr[j]=5;}
				else if(s.equals("SIX")) {arr[j]=6;}
				else if(s.equals("SVN")) {arr[j]=7;}
				else if(s.equals("EGT")) {arr[j]=8;}
				else if(s.equals("NIN")) {arr[j]=9;}
			}
			Arrays.sort(arr);
			
			System.out.print("#"+(i+1)+" ");
			for(int j = 0; j<n; j++) {
				int a = arr[j];
				if(a==0) {System.out.print("ZRO"+" ");}
				else if(a==1) {System.out.print("ONE"+" ");}
				else if(a==2) {System.out.print("TWO"+" ");}
				else if(a==3) {System.out.print("THR"+" ");}
				else if(a==4) {System.out.print("FOR"+" ");}
				else if(a==5) {System.out.print("FIV"+" ");}
				else if(a==6) {System.out.print("SIX"+" ");}
				else if(a==7) {System.out.print("SVN"+" ");}
				else if(a==8) {System.out.print("EGT"+" ");}
				else if(a==9) {System.out.print("NIN"+" ");}
			}
			System.out.println();
		}
		
	}

}
