package programmers.level00;

public class SumOfHiddenNum {
// 문자열 my_string이 매개변수로 주어질 때, 문자열 안의 모든 자연수들의 합 return 하기
	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));
	}
	static int solution(String my_string) {
		int answer = 0;
		//정규식 이용해서 문자열 중에 알파벳 대소문자 있으면 공백으로 바꿔줌
		my_string = my_string.replaceAll("[a-zA-Z]","");
		//for문 통해서 my_string에 남아있는 정수의 갯수만큼 더하기 돌려줌
		for(int i = 0; i < my_string.length(); i++) {
			//마이스트링의 i번째 정수값을 문자로 리턴 -> 문자열로 바꿔줌 -> 정수로 변환
			answer += Integer.valueOf(String.valueOf(my_string.charAt(i)));
			}
		
		
		return answer;
	}

}

//		String [] a = {"1","2","3","4","5","6","7","8","9"};
//		for(int i = 0; i < a.length; i++) {
//		while(my_string.indexOf(a[i]) != -1) {
//		 String value = my_string.substring(my_string.indexOf(answer), my_string.indexOf(answer)-1);
//		 	int result = Integer.parseInt(value);
//		 	answer +=result;
//			}
//		}