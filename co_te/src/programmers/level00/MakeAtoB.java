package programmers.level00;

import java.util.Arrays;

// 문자열 before와 after가 매개변수로 주어질때, before순서 바꿔서 after
// 만들 수 있음 1, 아니면 0
public class MakeAtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// before와 after의길이는 같으며 모두 소문자로 이뤄져있다.
	// 1. before, after를 모두 배열로 만들기
	// 2. sort하기!
	// 3. sort한 값 string으로 바꾸고같으면 1리턴 아님 0
	static int solution(String before, String after) {
        int answer = 0;
        char[] barr = before.toCharArray();
        char[] aarr = after.toCharArray();
        
        Arrays.sort(barr);
        Arrays.sort(aarr);
        
        String astr = new String(aarr);
        String bstr = new String(barr);
        
         if(bstr.equals(astr)) {
        	 answer =1;
         }else {
        	 answer = 0;
         }
        return answer;
    }

}
