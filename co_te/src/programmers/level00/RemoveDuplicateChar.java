package programmers.level00;


// 문자열 my_string이 매개변수로 주어질때, 중복된 문자를 제거하고 하나의 문자만
// 남겨서 리턴하기.. 공백도 하나의 문자로 구분
public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str = "abbscagdac";
		System.out.println(str.indexOf('c'));
	}
	// indexof -> 특정문자나 문자열이 위치한 인덱스 값을 반환하고, 없다면 -1을 반환
	//charAt -> int형 변수를 넣어 원하는 위치의 문자 리턴
	static String solution(String my_string) {
		String answer = "";
		for(int i =0; i<my_string.length(); i++) {
			// 이게가능한 이유는,,,
			//indexof()가 중복된 문자 여러개가 있다면, 젤 앞에있는 문자의 인덱스값을 리턴
			if(my_string.indexOf(my_string.charAt(i))== i) {
				answer += my_string.charAt(i);
			}
		}
        return answer;
	}
}
