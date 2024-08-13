package lec19_Rec;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		System.out.println(Fac(n));
		

	}
	public static int Fac(int n ) {
		if(n==0) {
			return 1;
		}
		
		int fn = Fac(n-1);
		return fn*n;
	}

}
