package programmers.level00;

public class Ant {
// 개미군단이 사냥나갈때, 장군개미는 공격력 5/ 병정개미는 3/ 일개미는 1 일때, 최소한의 개미들만 데리고 출전!
//	사냥감의 hp가 매개변수일때, 개미는 몇 마리?
	public static void main(String[] args) {
		System.out.println(solution(999));

	}
	static int solution(int hp) {
        int answer = 0;
        answer = hp/5; //장군개미가 몇마리 나가야하는지
        hp = hp%5; // 장군개미 상대하고 남은 hp
        
        answer +=hp/3; // 장군개미 상대후 병정개미 몇 마리 나가야하는지 answer에 더해줌
        hp = hp%3; // 병정개미까지 상대하고 남은 hp
        
        answer += hp/1; // 남은 hp는 일개미로 채우기.
        
        return answer;
    }

}
