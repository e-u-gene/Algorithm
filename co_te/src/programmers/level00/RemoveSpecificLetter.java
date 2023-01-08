package programmers.level00;

public class RemoveSpecificLetter {
//문자열 my_string과 문자 letter가 매개변수일 때, letter를 제거한 my_string리턴
	public static void main(String[] args) {
		System.out.println(solution("abcdf","d"));
		
	}
	static String solution(String my_string, String letter) {
		//문자열 대치 함수인 replace통해 제거하기
        
		String answer = my_string.replace(letter, "");
        
        return answer;
    }

}
