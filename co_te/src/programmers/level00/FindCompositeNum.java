package programmers.level00;

// 약수가 3개 이상인 수를 합성수라 할 때, 자연수 n이 주어질때 합성수 몇갠지 찾기.
public class FindCompositeNum {

	public static void main(String[] args) {
		System.out.println(solution(10));
	}

	// 1. for문으로 1부터 n까지 나누기 돌리기
	// 2. 거기서 합성수가 인거 찾기.. 나눈값이 0이되는 횟수를 flag로 세워서
	// 3. flag >= 3이면 answer++
	static int solution(int n) {
		int answer = 0;
		int flag = 0;
		
		for (int i = 1; i <= n; i++) {
			flag = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					flag++;
				}

			}
			if (flag >= 3) {
				answer++;
			}
		}
		return answer;
	}

}
