package programmers.level00;

import java.util.ArrayList;
import java.util.List;

public class HateEven {
// 정수 n이 매개변수로 주어질때, n 이하의 홀수가 오름차순으로 담긴 배열을 return
	public static void main(String[] args) {
		System.out.println(solution(12));
		
	}
	static List<Integer> solution(int n) {
//	arraylist로 만들어주기.

		List<Integer> answer = new ArrayList<Integer>();
	
        for(int i = 0; i <= n; i++) {
        	//i부터 n까지의 정수를 2로 나눈값이 0이 아니면 배열에 집어넣기.
        	if( i % 2 != 0 ) {
        		//i가 1일때. answer[0] = 1이 된다. 
        		answer.add(i);
        	}
        }
        return answer;
    }

}
