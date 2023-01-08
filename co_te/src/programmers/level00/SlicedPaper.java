package programmers.level00;

public class SlicedPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int solution(int M, int N) {
        int answer = 0;
        answer = M*N - 1;
        // n-1 +(m-1)*n = n-1 +nm-n
        // = (m*n)-1
        return answer;
    }

}
