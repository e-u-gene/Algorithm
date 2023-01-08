package programmers.level00;

//	문자열 배열 strlist가 매개변수로 주어집니다. 
//strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
public class EachArrReturn {

	static int[] solution(String[] strlist) {
//		정수배열 answer에 배열길이를 문자배열 strlist의 길이 대입하기.
		int[] answer = new int[strlist.length];

//     for문으로 answer[i]에 길이 대입
		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
			// length()는 String 클래스의 메소드
		}
		return answer;
	}

}
