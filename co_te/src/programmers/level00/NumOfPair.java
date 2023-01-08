package programmers.level00;
	// 자연수 n이 매개변수로 주어질때, 두수의 곱이 n인 자연수 순서쌍의 개수를 return
public class NumOfPair {
	
	public static void main(String[] args) {
		System.out.println(solution(2));

	}
	static int solution(int n) {
        int answer = 0;
        //for문으로 1부터 n까지의 반복문 생성
        for(int i = 1; i <= n; i++) {
        	// n / i의 나머지가 영이면 answer++
        	if(n % i == 0)
        	answer++;
        }
        
         return answer;
    }

}
