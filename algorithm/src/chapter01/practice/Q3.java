package chapter01.practice;

public class Q3 {
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) 
			min = b;
		if(c < min)
			min = c;
		if(d < min);
		return min;
	}

	public static void main(String[] args) {
		System.out.println("min(3,11,56,877) = "+ min4(3, 11, 56, 877));
		
	}

}
