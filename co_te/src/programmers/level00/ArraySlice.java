package programmers.level00;

import java.util.Arrays;
// 정수 배열 numbers를 num1부터 num2까지 잘라서 리턴
public class ArraySlice {

	public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
//        Arrays클래스의 배열복사를 통해 num1부터 num2번째 인덱스 값을 가진 배열을 리턴
       answer = Arrays.copyOfRange(numbers, num1, num2+1);
       return answer;
	}
}
