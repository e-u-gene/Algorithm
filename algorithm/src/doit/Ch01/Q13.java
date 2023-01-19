package doit.Ch01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//카드 게임
public class Q13 {
//N장의 카드가 존재할 때, 1부터 N까지의 카드가 있다.
// 맨 윗장에 있는 카드를 뽑고 그다음 윗장은 뒤로 보낸다고 할 때, 제일
// 마지막에 남을 카드는?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> my = new LinkedList<>();
		
		int N = sc.nextInt();
		for(int i =1; i<=N; i++) {
			//1부터 N까지 카드저장
		 my.add(i);	
		}
		
		//size가 1개가 될 때까지 와일문 실행
		while(my.size()>1) {
			//큐 my의 첫번째갑인 1을 뽑고
			my.poll();
			
			// 그 뒤의 다시 첫번째 값이 된 2를 젤 뒤로 보내버림.
			my.add(my.poll());
			//my.add 안의 my.poll은 25번줄의 my.poll과 다름.. 
			// 1다음 2를 뜻함.
		}
		
		System.out.println(my.poll());
		
	}

}
