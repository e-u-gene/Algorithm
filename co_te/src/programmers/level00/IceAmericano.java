package programmers.ch01;
//	아이스 아메리카노가 한 잔에 5500일 때, 머쓱이가 가진 money로 마실 수 있는
//   최대 잔수와 그 나머지를 구하기.
public class IceAmericano {
    public int[] solution(int money) {
        //커피값이랑 잔수를 변수로 선언
        int coffee = 5500;
        int cup = money/coffee;
        //나머지를 정수값으로 선언
        int remainder = money%coffee;
        
        int [] answer = {cup, remainder};
        return answer;
    }
}
