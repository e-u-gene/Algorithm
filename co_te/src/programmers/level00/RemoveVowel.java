package programmers.level00;

public class RemoveVowel {
// 문자열 my_string이 매개변수일 때, 모음 a,e,i,o,u를 제거한 문자열 리턴
	public static void main(String[] args) {
		System.out.println(solution("acedf"));
	}
	static String solution(String my_string) {
        String answer = "";
        //제거할 문자열을 문자열배열로 선언
        String []vowel = {"a","e","i","o","u"};
      //for문으로 문자열제거해서 출력해줄 것임.
        for(int i = 0; i < vowel.length; i++) {
        	//for문 안에서 if문으로 aeiou제거하기
        	if(my_string.contains(vowel[i])) {
        		answer = my_string.replaceAll(vowel[i],"");
        		//아직 for문 안이므로 my_string에 aeiou제거한 answer 대입
        		my_string = answer;
        	}
        	else 
        		//안겹치는건 여기서 돌아주기.
        		answer = my_string;
        }
        return answer;
    }

}
