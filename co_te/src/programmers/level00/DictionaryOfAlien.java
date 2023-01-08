package programmers.level00;

// 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어질때, spell에 담긴
// 알파벳을 한번씩만 모두 사용한 단어가  dic에 존재한다면 1, 아니라면 2를 리턴
public class DictionaryOfAlien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// spell의 배열값 하나하나씩 for로 가져온 후에
	// dic의 배열값 하나씩 indexof(spell[i])로대조해 
	// indexof가 -1이 아니라면 false
	
	static int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i = 0; i<dic.length; i++) {
        	//외계어 사전배열 돌때 flag를 true상태로 바꾸어주고
        	boolean flag = true;
        	for(int j = 0; j<spell.length; j++) {
        	// spell for문을 돌린다... 돌리면서 외계어 사전배열에서 spell
        		//찾는 값 없으면 바아로,,,false 처리하고 break.
        		if(dic[i].indexOf(spell[j])== -1) {
        			flag = false;
        			break;
        		}
        		
        	}
        	if(flag) {
        		answer = 1;
        		break;
        	}
        }
        return answer;
    }
}
