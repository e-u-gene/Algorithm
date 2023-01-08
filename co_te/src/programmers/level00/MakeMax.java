package programmers.level00;

import java.util.Arrays;

public class MakeMax{
// 정수 배열이 매개변수로 주어질때 배열 값중 두개를 곱해 만들 수 있는 최댓값 리턴
//	sort로 정렬한다음 배열 마지막 값이랑 그 전 값 가져와서 곱할래

	static int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        answer = numbers[numbers.length -1]*numbers[numbers.length -2];
        return answer;
    }
}
