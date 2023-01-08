package programmers.level00;
// 구슬의 수인 balls와
public class ShareBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//1. for문으로 balls를 +1씩해서 곱해주기
	//2. balls - share를 for문으로 +1씩해서 곱하기
	//3. for문으로 share를 +1씩해서 곱하기.
	static int solution(int balls, int share) {
        int answer = 0;
        long re_balls = 0;
        long re_share = 0;
        long b_s = 0;
        for(int i = 1; i<=balls; i++) {
        	re_balls *= i; 
        }
        for(int i = 1; i<=balls-share; i++) {
        	b_s *=i;
        }
        for(int i= 1; i<=share; i++) {
        	re_share *=i;
        }
        answer = (int)(re_balls/(b_s*re_share));
        return answer;
    }

}
