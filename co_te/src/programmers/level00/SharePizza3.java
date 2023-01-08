package programmers.ch01;

public class SharePizza3 {

	public static void main(String[] args) {
		System.out.println(solution(7,8));
		
	}
	
	 static int solution(int slice, int n) {
	        int answer = 0;
	        //Math.ceil로 무조건 올려줌
//	     n을 slice로 나눈값 + n을 slice로나눈 나머지 0.1곱해서 소숫점 만들어줌.
	        double input =  n/slice +0.1*(n%slice);
//	      ceil이 double이므로  double로 하나 선언해주고 
	     	double result =  Math.ceil(input);
//	      answer은 정수값이여야 하므로 강제 형변환해준다.	
	      	answer= (int)result;
	        
	        return answer;
	    }

}
