package programmers.level00;
// 머쓱이가 친구들과 369게임 할때, 매개변수 order에 369 몇개 있는지 찾기
public class GameOf369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 1. order를 문자열로 바꾸기 -> split으로 문자배열 만들기
	// 2. for문으로 문자배열 돌리고 정수값으로 바꿔서 3나눈값이 0이면 count++
	static int solution(int order) {
		  int answer = 0;
	        String s = String.valueOf(order);
	        String []str = s.split("");
	        
	        int count =0;
	        for(int i = 0; i< str.length; i++) {
	        	
	        	// Integer.parseInt(str[i]) 얘가 0일때도 생각해줘야 함.
	        	if(Integer.parseInt(str[i]) == 0) {
	        		break;
	        	}
	        	else if(Integer.parseInt(str[i])% 3 == 0) {
	        		count++;
	        	}
	        }
	        answer = count;
	        return answer;
    }

}
