package programmers.level00;

import java.util.Arrays;

// 영어대소문자 이뤄진 문자열 my_string이 매개변수로 주어질때, 모두 소문자로 바꾸고
// 알파벳 순서대로 정렬한 문자열 return
public class StringSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 1.my_string을 소문자로 변경하고
	// 2.split써서 배열로 만든다음에 sort하고
	// 3. for문 써서 answer에 입력.
	static String solution(String my_string) {
        String answer = "";
        my_string= my_string.toLowerCase();
        String []lower = my_string.split("");
        
        Arrays.sort(lower);
        for(int i =0; i< lower.length; i++) {
        	answer += lower[i];
        }
        return answer;
    }

}
