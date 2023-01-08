package programmers.level00;
// 머쓱이가 할머니한테 편지쓸 때, 글자 한개씩 2cm크기로 적으면 최소 가로길이는?
// 공백도 2cm 로 침
public class Letter {
	//String 클래스의 length()메소드 사용해 문자열개수 추출 *2
	static  int solution(String message) {
        int answer = 0;
        answer = message.length()*2;
        return answer;
	}
}
