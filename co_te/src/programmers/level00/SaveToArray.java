package programmers.level00;
// 문자열 my_str과 n이 매개변수로 주어질때, n개씩 자른 배열을 return
public class SaveToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//substring으로 n개씩 잘라서 answer에 대입.
	//for문으로 answer[i]에 넣어주고 my_str%n이 0이 아니면 
	//(my_str/n)+1로 answer 크기 선언해주기.
	//replace로 자르기... 잘라서 맨 마지막에 넣어주기...!
	static String[] solution(String my_str, int n) {
        String[] answer = {};
        if(my_str.length()%n !=0) {
        	answer = new String[(my_str.length()/n)+1];
        	for(int i =0; i < answer.length; i++) {
        		if(i == 0) {
        		answer[0] = my_str.substring(i,n*(i+1));
        		}
        		else if(i == answer.length-1) {
        		answer[answer.length-1] = my_str.substring(i*n,my_str.length());
        		}
        		else
        			answer[i]= my_str.substring(i*n,n*(i+1));
        	}
        }
        
        else
        	answer = new String[my_str.length()/n];
        for(int i =0; i < answer.length; i++) {
    		if(i == 0) {
    		answer[0] = my_str.substring(i,n*(i+1));
    		}
    		else if(i == answer.length-1) {
        		answer[answer.length-1] = my_str.substring(i*n,my_str.length());
        		}
    		else
    			answer[i]= my_str.substring(i*n,n*(i+1));
    }
        return answer;
	}

}
