package programmers.level00;
// 가장 큰 수 찾기
// 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열 return
public class FindMAX {

	public static void main(String[] args) {
		int [] array = {1,8,3};
		System.out.println(array);
	}
	
	static int[] solution(int[] array) {
        int[] answer = new int[2];
        // for문으로 array간 크기비교
        	int max = 0;
        	int index = 0;
        	for(int i = 0; i <array.length; i++) {
        	// array중 젤 큰 값과 인덱스를 answer에 대입
        		// max를 선언하고, array[i]중 max보다 큰 값이 있다면
        	if (max < array[i]) {
        		// 젤 큰값은 array[i]의 값이 된다.
        		max= array[i];
        		index = i;
        	}
        }
        		answer[0] = max;
        		answer[1] = index;
        
        return answer;
    }

}
