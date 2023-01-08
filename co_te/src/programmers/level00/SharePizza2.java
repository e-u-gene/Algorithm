package programmers.level00;
// 머쓱이네 피자가게가 피자를 6조각으로 잘라줄 때, 피자 나눠먹을 사람 n이 매개변수로
//주어진다. 이때, n명이 주문한 피자 안남기고 모두 같은 수의 피자 먹으려면 몇 판 시켜야하는지 return
public class SharePizza2 {

	public static void main(String[] args) {
		System.out.println(solution(4));

	}
	// 피자 6조각이니까 while문으로 돌려서 6%n ==0 일때까지 돌리기!
	static int solution(int n) {
        int answer = 0;
        int pan = 1;
        // n이 6명인 경우를 갈라주고
         if(6%n == 0) {
        	 answer = pan;
         }
         // 6%n이 0이 아닐때.
         else if(6%n != 0){
//       while문으로 6*pan을 n으로 나눈값이 0이 될때까지 돌린다. 	 
        	while(!((6*pan) % n ==0)) {
        		// 조건 충족하기 전까지 while(true) 상태가 되니까.
        		//pan++을 해주고
        		pan++;
        		// 조건 충족했을때 pan을 answer로 만들어준다.
        		answer = pan;
        	}
        }
         
        return answer;
    }

}
