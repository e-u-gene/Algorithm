package doit.Ch01;

import java.util.Scanner;

public class Q1 {
// 숫자의 합 구하기
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 첫번째는 숫자의 개수가 나오므로 정수형으로 받기
	int N = sc.nextInt();
	// 두번째는 스트링형으로 받아서 char 어레이로 바꿔서 더해줄거임!
	String sNum = sc.next();
	char[] ch = sNum.toCharArray();
	
	// 리턴할 값인 sum을 선언하고
	int sum = 0;
	// for문으로 ch.length돌리던가 N만큼 돌려도 댐.
	for(int i=0; i<N; i++) {
		// -'0'을 통해서 정수로 자동형변환 시켜줌
		sum += ch[i] -'0';
	}
	System.out.println(sum);
	}

}
