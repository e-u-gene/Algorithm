package programmers.level00;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		

	}
	static int[] solution(String my_string) {
        int count = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        
        //split() 써서 하나씩 때주기.
        String[] str = my_string.split("");
        for(int i = 0; i < str.length; i++) {
        //split으로 str에 하나씩 대입해준 my_string 각문자열이 정수로 0보다 클때
        	if(Integer.parseInt(str[i]) >= 0) {
        		//str값 대입하고 그 수만큼 count 증가
        		str[i] = str[i];
        		count++;
        	}
        }
        //리턴해줘야 하는 answer의 길이를 count만큼 지정
        int[] answer = new int[count];
        for(int i = 0; i <count; i++) {
        	// answer 배열에 문자열배열인 str값 하나씩 정수로 변환해서대입
       	 	answer[i] = Integer.parseInt(str[i]);
        }
        // 그후에 오름 차순으로 정렬
        Arrays.sort(answer);
        return answer;
    }

}
