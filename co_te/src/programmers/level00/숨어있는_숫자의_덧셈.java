package programmers.level00;
// 문자열 my_string 이 주어질때, 그 안에 섞여있는 자연수들의 합 return
public class 숨어있는_숫자의_덧셈(2) {

	public static void main(String[] args) {
		int result= 0;
		String my_string = "andsjfb12ndkg56afjgjdfhfjSSSS99";
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
       String [] str = my_string.split(" ");
        for (int i = 0; i < str.length; i++) {
			result += Integer.parseInt(str[i]);
		}
        System.out.println(result);

	}
 
	static int solution(String my_string) {
        int answer = 0;
        // 문자열을 정규식 통해서 대소문자 제거하고 공백으로 바꿈...
        // split으로 공백으로 나눠서 문자열생성
        String[]str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for (String string : str) {
        	// 문자배열 값이 공백이 아니면 숫자로 변환해 대입하기...!
			if(!string.equals("")) {
				answer += Integer.parseInt(string);
			}
		}
       
        return answer;
	}

}
