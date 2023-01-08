package programmers.level00;

public class SumEachNumber {
//정수 n이 매개변수로 주어질 때, n의 각자리 숫자 합을 retrun하기.
	public static void main(String[] args) {
		System.out.println(solution(12));

	}
	static int solution(int n) {
        int answer = 0; 
//        매개변수 n이 0이 아닐때까지 돌아가는 while문 생성
        while(n != 0) {
//        매개변수 n을 10으로 나눈 나머지를 구해서 맨오른쪽 끝자리씩 추출해서 더하기
         answer += (n%10);
//        더하고 나서 n/10해줘서 자릿수를 줄여주기. n 정수값이니까 n이 1982면 
//         n이 198.2되고 정수값은 소숫점 걍버리니까...
         n = n/10;
        }
        return answer;
    }

}
