package programmers.level00;

public class StrRepeat {
//문자열 my_string과 매개변수 n이 주어질때, 각문자를 n만큼 반복한 문자열 출력
	public static void main(String[] args) {
		System.out.println(solution("hello", 3));
		System.out.println();
	}
	static  String solution(String my_string, int n) {
        String answer = "";
        //String을 toCharArray로 char로 바꿔줌
        char[]ch = my_string.toCharArray();
        
        //증감식 통해서 char 배열인 ch를 하나씩 떼어줌
        for(int i= 0; i< ch.length; i++){
//      j를 n-1만큼 반복. j가 0부터이므로 n이 3일때, 3만큼 반복되서 출력될 것임.
        	for(int j = 0; j < n; j++) {
        		answer += ch[i];
        	}
        }
        return answer;
    }

}
