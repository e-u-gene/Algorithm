package programmers.level00;

import java.util.Arrays;

// 삼각형 세변의 길이가 담긴 배열 sides 가 주어질때, 가장 긴변의 길이와 나머지 
//두 변의 길이를 비교해 긴변길이 < 나머지 두 변 길이 합 이면 1출력, 아님 2출력
public class MakeTriangle {
//	sort로 또 정렬해서 인덱스 2의 값과 0,1의 값 비교하기
//	삼항연산자 사용해 리턴

	static int solution(int[] sides) {
		int answer = 0;
		
		Arrays.sort(sides);
		answer = (sides[2] < (sides[1] + sides[0]))? 1:2;
		
		return answer;
	}
}
