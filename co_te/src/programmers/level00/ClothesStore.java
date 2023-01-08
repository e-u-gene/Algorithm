package programmers.level00;
public class ClothesStore {
	//머쓱이네 옷가게에서는 10이상은 5%, 30이상은 10%, 50만원 이상은 20%할인해줄때, 지불할 금액은? 

	public static void main(String[] args) {
		System.out.println(solution(10));

	}
	static int solution(int price) {
        int answer = 0;
        //if else if로 조건 설정해서 실행해줌
        if(price >= 500000) {
        	answer =(int)(price*0.8);
        }
        else if(price >= 300000) {
        	answer =(int)(price*0.9);
        }
        else if(price >= 100000) {
        	answer = (int)(price*0.95);
        }
        //price가 100000보다 작으면 할인 안들어가니까 이것도 빼지 않고 고려하기.
        else answer = price;
        return answer; 	
	}
}
