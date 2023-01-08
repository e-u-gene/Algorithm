package programmers.level00;
// 좌표값 배열로 dot이 주어질때, dot이 어느 위치에 있는지 알려주기
// x,y가 양수면 1사분면
// x-> 음수, y->양수 2사분면
// x,y 모두 음수면 3사분면
// x-> 양수, y->음수 4사분면
public class WhrerIsDot {

	public static void main(String[] args) {
		
	}
	//if-elseif문으로 풀기.
	
	static int solution(int[] dot) {
        int answer = 0;
        // x가 양수일때,
        if(dot[0] > 0) {
        	
        // y 값이 양순지 음순지 비교하기
        	if(dot[1]>0) {
        		answer = 1;
        	}else answer = 4;
        }
        // x가 음수일때,
        else if(dot[0] < 0) {
        	
        // y가 음수인지 양수인지 비교	
        	if(dot[1] > 0) {
        		answer = 2;
        	}else answer = 3;
        }
        
        return answer;
    }

}
