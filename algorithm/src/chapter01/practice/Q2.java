package chapter01.practice;

public class Q2 {
	 static int min3 (int a, int b, int c) {
		 int min = a;
		 
		 if(b < min)
			 min = b;
		 
		 if(c < min)
			 min = c;
		 
		 return min;
	 }
	public static void main(String[] args) {
		System.out.println("min(9, 6, 11) = "+ min3(9, 6, 11));
	}

}
