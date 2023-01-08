package programmers.ch01;

public class Share_Pizza {

	public static void main(String[] args) {
		int n= 11;
		double a = n/7 +0.1*(n%7);
		System.out.println(solution(n));//솔루션활용해 ceil잘 실행되는지 확인
		System.out.println(a);//ceil 안쓰고 걍 출력했을때.
	}
	
	static int solution(int n) {
//		피자 한 판이 7조각이고 피자먹을사람 n명일때 , 모두가 최소 1개 이상 먹기위해 필요한 피자의 수.
        
//		n/7 < = 1 이면 answer 은 1, n/7 <= 2이면 answer =2
		int answer = 0;
        
        
        //Math.ceil로 무조건 올려줌
//     n을 7로 나눈값 + n을 7로나눈 나머지 0.1곱해서 소숫점 만들어줌.
        double input =  n/7 +0.1*(n%7);
//      ceil이 double이므로  double로 하나 선언해주고 
     	double result =  Math.ceil(input);
//      answer은 정수값이여야 하므로 강제 형변환해준다.	
      	answer= (int)result;
        
        return answer;
   
    }

}
