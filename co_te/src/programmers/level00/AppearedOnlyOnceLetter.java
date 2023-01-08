package programmers.level00;

import java.util.Arrays;

// 문자열 s가 매개변수로 주어질때, s에서 한 번만 등장하는 문자를 사전순으로
// 정렬한 거 return
public class AppearedOnlyOnceLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 문자 배열로 만들어 sort사용해 정렬 
	// answer에 ch를 문자열값으로 만들어 대입
	static String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
		String answer = String.valueOf(ch);
		
		// for문 통해서 i와 i+1이 같은지 비교
		for(int i = 0; i<ch.length; i++) {
			// i가 ch.length-1이 되면 0부터 인덱스 끝 번호 다 돈거니까. 
			// 그때는 빠져나가기!
			if(i!=ch.length-1) {
				// ch[i]와 ch[i+1]이 같은지 비교하고
				if(ch[i] == ch[i+1]) {
					// 같으면 ch[i]를 ""으로 공백처리 해주기..! 어짜피 sort되서 문자가 같다면
					// aabbbbcddddeee이런식으로 정렬되어 어떤거 지우든간 노상관.
					answer = answer.replaceAll(Character.toString(ch[i]), "");
				}
			}
		}
        
        return answer;
    }

}
