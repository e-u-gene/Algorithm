package programmers.level00;
import java.util.Arrays;
public class Median {
// 정수배열 array가 주어질때 중앙값 구하기. array의 길이는 홀수
	public static void main(String[] args) {
		int [] arr = {1,2,4,7,8};
		System.out.println(solution(arr));

	}
	
	static int solution(int[] array) {
        int answer = 0;
        //array sort -> 오름차순 정렬 후 중앙값구하기
        Arrays.sort(array);
        //array는 늘 홀수! array.length/2로 중앙값에 위치한 인덱스 번호 추출
       	answer = array[array.length/2];
        return answer;
    }

}
