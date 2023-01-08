package programmers.level00;
//세균이 1시간에 2배만큼 증가할때 처음 세균수 n 과 경과한 시간t에 따른 세균 수 리턴
public class Bacteria {

	public static void main(String[] args) {
		System.out.println(solution(7,15));
	}
	static int solution(int n, int t) {
        int answer = 0;
       //세균수 n이 시간당 2배씩 증가하게 하기.
        
       // 세균수 n X 2의 t승... 시간이 1 지날땐 2/ 2 지날땐 4가 될 것. 	
        answer = n*(int)Math.pow(2, t);
        	
        
        return answer;
    }

}
