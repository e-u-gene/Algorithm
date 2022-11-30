package programmers.ch01;

public class Q1 {
//	정수 배열 numbers가 매개변수로 주어질때, numbers원소의 평균값 return
//	0<= numbers의 원소 <= 1000
//	1<= numbers의 길이 <= 100
	
	
	public double solution(int[] numbers) {
		double answer = 0;
        int i = 0;
        int sum = 0;
        for(i=0; i < numbers.length; i++){
            sum += numbers[i];
            answer = (double)sum/numbers.length;
        }
        return answer;
    }
//	입출력 예
// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} -> 5.5
// {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99} -> 94.0
}
