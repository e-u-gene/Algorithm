package programmers.level00;
// 정수 n이 주어질때, 정수n보다 작거나 같은 팩토리얼결과 값이 나오는 i 구하기
public class Factorial {

	public static void main(String[] args) {
	
		
	}
	static int fac(int n) {
		if(n<=1) {
        	return 1;
        }
        else        	
        return fac(n-1)*n;
    }
// 최대 팩토리얼이 10!이므로 10부터 팩토리얼 냅다 돌려서 돌린 재귀함수가 n과 같거나 작을때
// 그 i값을 리턴함.
	public  int solution(int n) {
        int answer = 0;
        for(int i =10; i>0; i--) {
        	if(fac(i)<=n) {
        		answer = i;
        		break;
        	}
        }
        return answer;
    }
}
