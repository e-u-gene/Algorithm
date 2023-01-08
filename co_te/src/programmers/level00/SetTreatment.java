package programmers.level00;

import java.util.Arrays;

//응급실에 온 환자의 응급도를 기준으로 진료 순서 정하기
// 응급도가 높을 수록 작은 숫자 부여,,,
public class SetTreatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//1. 값을 리턴해줄 배열을 만든다.
	//2. 카피한 배열에 emergency 값을 넣어주고 sort 한다음에 
	//3. for문으로 카피배열과 emer배열 값 비교해서 같으면, i+1 대입
	static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int [] asc = new int [emergency.length];
        
        //for문으로 emergency값 하나씩 넣어주기
        for(int i =0; i< emergency.length; i++) {
        	asc[i]= emergency[i];
        }
        
        Arrays.sort(asc);
        
        for(int i =0; i<emergency.length; i++) {
        	for(int j =0; j<emergency.length;j++) {
        		if(asc[i]==emergency[j]) {
// emergency [30,10,23,6,100]일때, asc [6,10,23,30,100]이 되고
// asc[0]= emergency[3] 이 된다.
// 따라서 answer[3] = 5-0; 이므로 잘 처리되었음.
        			answer[j] =emergency.length-i;
        		}
        	}
        }
        return answer;
    }

}
