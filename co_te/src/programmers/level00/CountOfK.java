package programmers.level00;

// 정수 i,j,k가 매개변수로 주어질때, i~j까지 k가 몇 번 등장하는지 return
public class CountOfK {

	public static void main(String[] args) {
		String str = "1,3,4,5,8,9";
		// 문자형이 int형으로 자동형변환8ㅏ
		System.out.println(str.charAt(0)-'1');
		

	}
	
	static int solution(int i, int j, int k) {
		int answer = 0;
		for(int t = i; t<=j; t++) {
			//버퍼메모리 사용해 정수 i를 j까지 저장...
			StringBuilder sb = new StringBuilder();
			sb.append(t);
		for(int r = 0; r<sb.length(); r++) {
			// 문자값에 연산을 통해서 정수값으로 바꾸어줌
			if(sb.charAt(r) -'0' == k) {
				answer++;
			}
		}
	}
        return answer;
    }

}
