package programmers.level00;

public class NumberOfDice {
// 머쓱이가 직육면체 상자 하나를 가질때, 이 상자안에 모서리가 n인 주사위 몇개가 들어갈 수 있는지
// 직육면체 상자는 {가로, 세로, 높이} 길이로 주어지는 정수 배열
	public static void main(String[] args) {
		int [] box = {10,8,6};
		System.out.println(solution(box, 3));

	}
	static int solution(int[] box, int n) {
        int answer = 0;
        
        int width = box[0]/n; //가로를 n으로 나눈값
        int vertical = box[1] /n;//세로를 n으로 나눈값
        int height = box[2] / n; //높이를 n으로 나눈값
        answer = width*vertical* height; // 다 곱하면 정답이 된다!
        return answer;
	}

}
