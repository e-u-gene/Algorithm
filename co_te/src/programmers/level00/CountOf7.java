package programmers.level00;
//정수 배열 array가 매개변수로 주어질때, 7이 총 몇개 있는지 리턴
public class CountOf7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 정수 배열 요소값을 split으로나누기.. 그리고 7과 같은지 비교
	// 같으면 answer ++
	static int solution(int[] array) {
        int answer = 0;
        // array의 요소값 하나하나를 string배열로 변환
        for(int i =0; i<array.length; i++) {
        	String [] str =String.valueOf(array[i]).split("");
        	// str의 인덱스값들을 가져와 정수로 변환한후 7이랑 같으면 answer++
        	for(int j =0; j<str.length; j++) {
        		if(Integer.parseInt(str[j])==7){
        			answer++;
        			// answer 0으로 매번초기화해줄 필요없음.. 어짜피 array에서 7이 몇개 있는지 
        			//count하는거니까
        		}
        	}
        }
        return answer;
    }

}
