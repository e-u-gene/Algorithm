package programmers.level00;
// 정수배열 num_list와 정수 n이 매개변수로 주어질때.
// num_list를 n차원 배열로 바꾸기.
public class MakeTwoDimension {

	public static void main(String[] args) {
		int[] numlist= {1,2,3,4,5,6,7,8};
		for (int i : numlist) {
			System.out.println(solution(numlist ,2));
			
		}

	}
	// 만약 abc = new int [2][3]이면
	// {[1,2,3],[4,5,6]} 이다. 길이가 3개짜리 배열이 두개 있는것.
	//  answer 의 [i]= num_list.length/n이 되고, [j] = n 이된다. 
	static int[][] solution(int[] num_list, int n) {
		int i = num_list.length/n;
		int j = n;
		int k = 0;
		
		int[][] answer = {};
		answer = new int[i][j];
		
        // for문으로[i][j]에 numlist n개씩 대입.
        for(i =0; i<answer.length; i++) {
        	for( j = 0; j<answer[i].length; j++) {
//[0][0] = num_list[0], [0][1] = num_list[1] -> [0,1]이 되는것.
        			answer[i][j] = num_list[k];
        			k++;
        		}
        	}
        return answer;
	}
}
