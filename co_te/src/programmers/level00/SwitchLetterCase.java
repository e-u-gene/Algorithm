package programmers.level00;

public class SwitchLetterCase {
// 대문자와 소문자. 문자열이 주어질때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열 리턴!
	public static void main(String[] args) {
	}
	 static String solution(String my_string) {
	        String answer = "";
	        // 입력되는 문자열을 char 배열로 변환
	        char[] arr = my_string.toCharArray();
	        
	       String result = "";
	       // 문자 배열 arr을 인덱스 0부터 순회하면서 대소문자를 판별
	       //아스키 코드로 a-z -> 97-122
	       //		   A-Z -> 65-90이므로 
	       for(int i = 0; i < arr.length; i++) {
	    	   //97과 122사이인 소문자라면 대문자로 바꾸는 조건식을 써주고
	    	   if(arr[i] >= 97 && arr[i] <=122) {
	    		   result = arr[i]+"";
	    		   answer += result.toUpperCase();
	    	   }else
	    		   // 아니라면 대문자이므로 소문자로 바꿔준다.
	    		   answer += (arr[i]+"").toLowerCase();
	       }
	       return answer;
	    }

}
