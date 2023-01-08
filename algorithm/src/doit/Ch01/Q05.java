package doit.Ch01;
//N개의 수가 주어졌을때, 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수를
// 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt(); // n의 수
		int M = sc.nextInt(); // 나눌 수
		
		long[] S = new long[N]; //합배열
		
		// 크기를 M으로 주는 이유는 나머지 값이니까, 결과값들이 M개 이상 나오지 
		// 않기 때문이다. 예를들어 M이 3이면 나머지가 0,1,2이고 그 이상의 값은 
		// 나오지 않으므로 크기를 3으로 설정해도 무방하다
		// 만약 M이 7이면 나머지가 0~6까지 존재하므로 크기가 딱 7이 된다.
		long[] C = new long[M]; //나머지가 같으면 ++해줄 C배열 선언
		long answer =0;
		
		// 합배열의 첫값은 맨 처음 입력되는 값으로 받는다.
		S[0] = sc.nextInt();
		
		// 그 후 for문으로 0-1, 0-2, 0-i번재 인덱스들의 합을 구해논 
		// 합배열을 생성한다.
		for(int i =1; i<N; i++) {
			S[i] = S[i-1]+sc.nextInt();
		}
		
		// 그 후 for문을 통해 합배열의 값과 나누려는 값을 나눈 나머지를 구하고
		for(int i = 0; i<N; i++) {
			int remainder =(int)(S[i]%M);
			
			// 나머지가 0이라면 answer을 ++
			// 첫 판에 M으로 나눠지는 수들을 갈라치기 한다.
			if(remainder == 0) answer++;
			
			//나머지가 같은 값들의 갯수를 센다.
			// remainder가 0이면 C배열의 0번 인덱스 값이 ++된다.
			// 결국 C[0]의 값이 2이면 remainder = 0이 두개라는 소리고
			// C[1]의 값이 3이면 remaider = 1 이 3개라는 소리이다.
			C[remainder]++;
		}
		
		// 같은 나머지를 가진 값이 1 이상이면 콤비네이션으로 경우의 수를 구해
		// answer로 리턴한다.
		for(int i = 0; i<M; i++) {
			if(C[i]>1) {
				answer = answer + (C[i] * (C[i] -1)/2); 
			}
		}
		System.out.println(answer);
	}

}
