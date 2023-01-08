package programmers.ch01;

public class StrArrReverse {

	public static void main(String[] args) {
		System.out.println(solution("December"));

	}

	static String solution(String my_string) {
//		문자열 my_string을 역으로 뒤집어 리턴
		
//		StringBuilder -> 단일스레드 환경에서 사용.
//		StringBuilder의 reverse()메소드 이용해 뒤집기
		String answer = new StringBuilder(my_string).reverse().toString();
		return answer;
	}
}
