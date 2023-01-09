package doit.Ch01;

import java.util.Scanner;

// Q06 연속된 자연수의 합구하기
public class Q06 {
// N = 15일때, 연속된 자연수의 합이 15인 가짓수 리턴
	public static void main(String[] args) {
		// 투포인터 사용
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		// 모든 N값은 1부터 시작하므로 일단 부분합을 1로 설정
		int sum = 1;
		// N을 이루는 값이 N일 경우를 미리빼놔서 카운트를 1로 미리 설정
		// 예시 N이 17이면 17혼자 N을 이룰때.
		int count = 1;
		int s = 1;
		int e = 1;
		// sum > N 이면 s++, sum < N 이면 e++, sum==N이면 count++
		// 포인터를 e가 N과 동일할때까지 돌린다.
		while(e!= N) {
			// 부분합이 N과 같으면
			if(sum == N) {
				// count ++, 그리고 e++
				count++; e++;
				// 그 후 부분합값 변경해줌
				sum = sum + e;
			}
			// 부분합이 N보다 크면
			else if(sum > N) {
				sum = sum - s;
				// 기존 스타트값을 빼준다음에
				s++;
				//s 증가
			}
			else {
				// 그외엔 부분합이 N보다 작은거니까 sum값 변경후 e++
				e++;
				// 인덱스값 ++ 해주고 
				// sum 값 변경
				sum = sum + e;
			}
		}
		System.out.println(count);
	}

}
