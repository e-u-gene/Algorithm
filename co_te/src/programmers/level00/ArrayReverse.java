package programmers.level00;

public class ArrayReverse {
//	정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
//	num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] num_list) {
//    	answer을 num_list배열로 만들기
        int[] answer = new int[num_list.length];
//        for문으로 뒤집어서 출력
          for(int i = 0; i < num_list.length; i++) {
//        	  answer[i] = num_list[num_list 배열의 길이 -1 -i]면 뒤집어서 입력된다
//        	  ex) num_list 의 길이가 10일 때, answer[0] = num_list[10-0-1]
          	 answer[i] = num_list[num_list.length-i-1];
          }
          return answer;
      }
    
  }

