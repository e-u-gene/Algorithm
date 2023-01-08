package programmers.level00;
// my_string이 매개변수로 주어질때, 수식계산한 값을 return
public class StringCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// split을 통해 " "기준으로 나누기.
	// switch-case문 돌려서 '+','-'부호 판단
	static int solution(String my_string) {
		String[] str = my_string.split(" ");
		// answer에 my_string의 첫번째 값인 정수를 이미 대입해줌.
        int answer = Integer.parseInt(str[0]);
        // 따라서 for문 돌려서
        for(int i= 1; i<str.length; i++) {
        // str의 부호만 판단해주면 된다.        	
        	switch(str[i]) {
        	 case"+":
        		 answer += Integer.parseInt(str[i+1]);
        		 break;
        	
        	 case "-":
        		answer -= Integer.parseInt(str[i+1]);
        		break;
        		// 부호 판단후에는 str[i+1]의 마지막값만 연산해주면 됨!
        		
        }
        
    }
        return answer;
	}     
}
