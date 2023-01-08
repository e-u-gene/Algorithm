package programmers.level00;
// 문자열 letter 가 매개변수로 주어질때 -> letter는 모스부호로 이루어져있다.
public class MorseCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 모스부호가 순서대로 담겨있는 String 배열 선언
	// letter를 " " 공백기준으로 split으로분리해 배열값 비교!
	static String solution(String letter) {
        String answer = "";
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.",
        		"....","..",".---","-.-",".-..","--","-.","---",".--.",
        		"--.-",".-.","...","-","..-","...-",".--","-..-","-.--",
        		"--.."};
        String[] str = letter.split(" ");
        for(int i = 0; i<str.length; i++) {
        	for(int j= 0; j <morse.length; j++) {
        		// str[i]와 morse[j]가 같다면
        		if(str[i].equals(morse[j])) {
        			// answer에 morse의 인덱스 값과 97 더해주기.
        			// 소문자 a가 97이므로!
        			answer += (char)(j+97);
        		}
        	}
        }
        return answer;
    }

}
