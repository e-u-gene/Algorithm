package programmers.level00;
//문자열 str1, str2 매개변수일때, str1안에 str2가 있다면 1을 아니면 2를 리턴
public class StringInString {
	static int solution(String str1, String str2) {
        int answer = 0;
//    String의 메소드 중 문자열 안에 타겟 문자열이 있으면 정수를 반환, 없으면 -1반환하는 
//    indexOf() 메소드를 사용해 문자열이 있으면 정수를 반환하게 하는 조건문 작성
//      있으면 1반환하고
        if(str1.indexOf(str2) >= 0){
            answer = 1;
        }
//     없으면 2반환하게 작성   
        else answer = 2;
        return answer;
    }
}
