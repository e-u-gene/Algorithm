package programmers.level00;

public class AgeOfAlien {
// a는 0,b는 1,,,j는 9일때, 왹져식으로 나이 말하기!
	// 자연수age 가 매개변수로 주어짐
	public static void main(String[] args) {
	System.out.println(solution(77));
	

	}
	// 소문자 a는 97의 값을 가지고 z는 122이므로 나이값을 하나씩 떼서 97을 더하면
	// 알파벳 값이 나올 것이다. 0일때 97더하면 a 나오니까!
	static String solution(int age) {
        String answer = "";
        String a = String.valueOf(age);
        // age 값을 String으로 바꿔준 후, 한 글자씩 split으로 자름
        String []arr = a.split("");
        // 그 후에 for문을 돌려서 arr 배열 값에 97씩 더해서 소문자로 만들어준다.
        for(int i =0; i < arr.length; i++) {
        	answer += (char)((Integer.parseInt(arr[i])+97));
        }
        return answer;
    }

}
