package programmers.level00;

public class RockScissorsPaper {
// 가위 바위 보. 가위가 2 바위가 0 보가 5일때, 가위바위보를 순서대로 나타낸 문자열 rsp가 
// 주어질때, 가위바위보 모두 이기는 경우를 순서대로 나타낸 문자열을 return 하기.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static String solution(String rsp) {
        String answer = "";
        // 문자열 배열을 선언하고 문자열 rsp를 split으로 나눠서 대입해주기.
        String[] str= rsp.split("");
        // 배열 str을 순회하면서 2일때 ->0/ 5->2 / 0 -> 5를 문자열 answer에 더해주기.
        for(int i = 0; i <str.length; i++) {
        if(Integer.parseInt(str[i]) == 2){
        	answer += "0";
        	}
        if(Integer.parseInt(str[i]) == 5){
        	answer += "2";
        }
        if(Integer.parseInt(str[i]) == 0){
        	answer += "5";
        }
        }
        return answer;
    }

}
