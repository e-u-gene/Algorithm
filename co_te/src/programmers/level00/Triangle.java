package programmers.level00;

import java.util.Scanner;
//*의 높이와 너비를 1이라 했을때, 정수 n이 주어지면 이등변 삼각형 출력하기.
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = "*";
        //중첩된 for문으로 해결
        for(int i = 0 ; i < n; i++) {
        	//i = j 만큼 별찍기. 
        	for(int j =0 ; j <= i; j++) {
        		System.out.print(x);
        	}
        	System.out.println();
        }
	}

}
