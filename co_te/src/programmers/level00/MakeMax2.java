package programmers.level00;

import java.util.Arrays;

// 정수배열 numbers가 매개변수로 주어질때, numbers의 원소 두개를 곱해 만들 수 있는
// 최댓값 return
public class MakeMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 1.sort해서 음수값 곱한거하고 배열중 젤 큰값 곱한거 비교
	// 2. 더 큰 값을 answer에 대입하면 된다.
	static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int negative = numbers[0] * numbers[1];
        int positive = numbers[numbers.length-1]*numbers[numbers.length-2];
        
        if(negative > positive) {
        	answer = negative;
        } else
        	answer = positive;
        
        return answer;
    }

}
