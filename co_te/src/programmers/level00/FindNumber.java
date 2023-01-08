package programmers.level00;
// 정수 num과 k 가 매개 변수로 주어질때, num을 이루는 숫자중 k가 있으면
// 그 숫자 자리수를 return 없으면 -1 return.
public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 1. num과 k 값 모두 String으로 바꾸기
	// 2. String 클래스의 함수 index of로 위치 값 가져오기.
	static int solution(int num, int k) {
        int answer = 0;
        String s = String.valueOf(num);
        String t = String.valueOf(k); 
        
        // 찾는 문자열 값이 0부터 시작하므로 +1을 해줘야 원하는 값이 나온다.
        if(s.indexOf(t) >=0) {
        	answer = s.indexOf(t) +1;
        }else
        	answer = -1;
        return answer;
    }

}
