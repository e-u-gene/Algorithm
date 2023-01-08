package programmers.level00;

public class Cypher {
// 문자열 cipher 중 정수 code의 배수만큼만 문자열 리턴하면 암호해독
	public static void main(String[] args) {
		String a = "pfqallllabwaoclk";
		System.out.println(solution(a, 2));

	}

//toCharArray()로 문자함수로 바꾼다음 code의 배수만큼을 answer에 저장
	static String solution(String cipher, int code) {
		String answer = "";
		String[] str = cipher.split("");
		for (int i = 1; i * code <= str.length; i++) {
//			for문으로 순회하면서 i*code를 해주고 
//			배열은 0인덱스 부터 시작하므로 -1 해줘야 한다.
			answer += str[i * code - 1];
		}
		return answer;
	}
}