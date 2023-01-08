package programmers.level00;
// 정수 n이 매개변수로 주어질때, 정수 n이 제곱수면 1, 아니면 2 리턴
public class Square {
	//삼항연산자로 판별하기
//	 n나누기 n의 제곱근 해서 0이면 제곱근일것!
//	제곱근은 Math.sqrt()로 구한다.
	static int solution(int n) {
        int answer = 0;
        answer = (n %Math.sqrt(n) ==0)?1:2;
        return answer;
    }
}
