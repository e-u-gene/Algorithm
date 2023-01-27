package doit.Ch01;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		
		
		// for문으로 입력되는 값들을 배열에 넣어준다.
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		// 그 뒤에 이중 포문으로 버블정렬 해줄것임
		for(int i = 0; i<n-1; i++) {
//		변수가 i인 for문은 각 배열값들을 비교해 스왑을 진행하는
//		회차 n-1을 의미하고
			for(int j =0; j<n-1-i; j++) {
//			변수가 j인 for문은 원소값들을 비교하는 횟수를 말한다.
//			회차가 거듭될 수록 배열의 끝에 큰값들이 정렬되므로
//			n-1에 회차 i를 빼주어 진행한다.
				if(a[j]>a[j+1]) {
					// 인접한 두 값들 중 앞의 값이 더 크다면 스왑!
					int big = a[j];
					// a[j] 값이 더 크므로 정수형 변수에 넣어주고
					
					// a[j]는 바로 인접한 값인 a[j+1]로 바꾸어준다.
					a[j] = a[j+1];
					// 그 후에 a[j+1]은 big 값을 넣어주면 스왑완~
					a[j+1]= big;
				}
				
			}
		}
		for (int i =0; i<n; i++) {
			System.out.println(a[i]);
		}
	}

}
