package programmers.ch01;

public class Q2 {
//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때
// array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
	   public int solution(int []arr, int n) {
			int answer = 0;
	       
			for(int i = 0; i < arr.length; i++) {
				if(n == arr[i]) {
					answer++;	//조건 충족할 때만 answer에 ++해줄거임!
	            }
	        }
			return answer;
		}
}
