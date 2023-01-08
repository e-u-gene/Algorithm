package programmers.level00;

import java.util.Arrays;
//약수구하기
public class Divisor {
// 정수 n이 매개변수일 때, n의 약수를 오름차순으로 담은 배열 return
	public static void main(String[] args) {
		System.out.println(solution(24));
	}
	static int[] solution(int n) {
		//count 만들고 for문으로 n부터 i까지 돌려서 count ++
		int count = 0;
		int [] result = new int [10000];
        for(int i = 1; i <= n; i++) {
        	// n을 i로 나눈 나머지가 0이면 result 배열에 집어넣고, 카운트 ++
        	if(n%i == 0) {
        		result[count] = i;
        		count++;
        	}
        }
        // return 해줘야하는 answer의 크기를 count만큼 설정
		int[] answer = new int[count];
        for(int i =0; i < count; i++) {
        	// result[i]가 값이 0이 아니면 answer 배열에 대입.
        	if(result[i] != 0) {
        		answer[i] = result[i];
        	}
        }
        return answer;
    }

}
