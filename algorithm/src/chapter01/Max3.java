package chapter01;

import java.util.Scanner;

public class Max3 {
	//a,b,c 비교하기
		public static void main(String []args) {
			Scanner stdIn = new Scanner(System.in); // Scanner 통해서 콘솔창에 입력되는 값 받음.
			
			System.out.println("세 정수의 최댓값을 구합니다.");
			System.out.println("a의 값: "); int a = stdIn.nextInt();//nextInt() -> 콘솔창에 입력되는 다음토큰 받음.
			System.out.println("b의 값: "); int b = stdIn.nextInt();
			System.out.println("c의 값: "); int c = stdIn.nextInt();
			
			int max = a;
			if(b > max) max = b;
			if(c > max) max = c; //a, b, c의 최댓값 구해서 max에 대입
			
			System.out.println("최댓값은 " + max + "입니다.");
		}
}
