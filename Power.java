package lec19_Rec;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.1;
		int n = 3;
		System.out.println(Power(x,n));

	}
	public static double Power(double x,int n) {
		if(n==0) {
			return 1;
		}
		double ans = Power(x,n-1);
		return ans*x;
		
	}

}
