package programmers.level00;
// 문자열 my_string과 정수 num1, num2 가 매개변수로 주어질때
// my_string에서 num1 인덱스와num2인덱스 바꾼 문자열 return 하기
public class ChangeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 1. my_string을 문자열배열로 바꾼후
	// 2. num1과 num2 인덱스를 바꿔서 my_string에 대입
	// 3. answer += 에 대입. 이건 for문으로 해결
	static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String []str = my_string.split("");
        // 각 인덱스의 문자열을 선언해준후
        String a1 =str[num1];
        String a2 = str[num2];
        // 따로 대입해줘야 값 변경 제대로 잘 된다.
        str[num1] = a2;
        str[num2] = a1;
        
        
        for(int i = 0; i< str.length; i++) {
        	answer += str[i];
        }
        return answer;
    }

}
