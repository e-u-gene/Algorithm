package programmers.level00;
public class SimilarityOfArray {
// 문자열 배열 s1과 s2가 주어질때, 같은 원소의 개수를 return
	public static void main(String[] args) {
		String[]s1 = {"a","b","c"};
		String[]s2 = {"com","b","d","p","c"};
		System.out.println(solution(s1,s2));

	}
	static int solution(String[] s1, String[] s2) {
        int answer = 0;
  // 중첩 for문으로 s1의 0번째 인덱스와
        for(int i =0; i < s1.length; i++) {
//  s2의 0~s2.length-1까지 비교      	
        	for(int j = 0; j<s2.length; j++) {
// 같으면 answer++해주기. 문자열비교니까 꼭 equals해주기.          		
        		if(s1[i].equals(s2[j])) {
        			answer++;
        		 
        		}
        	}
        }
        return answer;
    }

}
