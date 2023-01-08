package programmers.level00;
// 숫자와 "Z"가 공백으로 구분되 담긴 문자열이 주어질때, 문자열에 있는 숫자 더하기
// 이 때, "Z"가 나오면 바로전에 더했던 숫자 뺴기!
public class ConZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//1. string s를 ""공백으로 나누기!
	//2. for문으로 z가 나오면
	//3. 바로 그전 인덱스 값을 빼서 해결
	static int solution(String s) {
        int answer = 0;
        String []str = s.split(" ");
        for(int i = 0; i< str.length; i++) {
        	if(str[i].equals("Z")) {
        		answer -= Integer.parseInt(str[i-1]);
        	}else {
        		answer += Integer.parseInt(str[i]);
        	}
        }
        return answer;
    }

}
