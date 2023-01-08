package programmers.level00;

public class TurnArray {
// 정수가 담긴 배열 numbers 와 문자열 direction이 매개변수로 주어질때, 
// 배열 numbers의 원소를 direction 방향으로 한 칸씩 회전시킨 배열 return	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// direction은 문자열이니까 equal로 비교해서  왼쪽, 오른쪽시에 if문으로 가르기
	//if로 가른 경우에 for문 돌려서 배열한칸씩 밀기
	static int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
        if(direction.equals("right")) {
        	for(int i = 1; i <numbers.length  ; i++) {
        		answer[0] = numbers[numbers.length -1];
        		answer[i] = numbers[i-1];
        	}
        }else
        	for(int i = 1; i<numbers.length; i++) {
        		answer[numbers.length -1] = numbers[0];
        		answer[i-1]= numbers[i];
        	}
        return answer;
	}

}
