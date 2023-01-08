package programmers.level00;

import java.util.Arrays;

// 정수배열 array와 정수 n이 매개변수 주어질때, array에 들어있는 정수 중 
// n과 가장 가까운수를 return
public class NearNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// array 값들 하나씩 가져와서 타겟값인 n과 뺀값의 절댓값을 구한다.
	// 젤 작은 절댓값이면 젤 가깝다는 것이므로 그 값을 가진 인덱스가 answer이 된다.
	static int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
        	int a = Math.abs(n-array[i]);
        	if(min>a) {
        		min =a;
        		answer = array[i];
        	}
        }
       
        return answer;
    }

}
