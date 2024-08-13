package lec19_Rec;

import java.util.Scanner;

public class Decreasing_Num {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		Num(n);

	}
	public static void Num(int n ) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		Num(n-1);
	}

}
