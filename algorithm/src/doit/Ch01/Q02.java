package doit.Ch01;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
// 평균구하기
	
	// 첫줄에 시험 몇 개 봤는지 출력
	// 배열선언 후 크기를 시험개수만큼 선언
	// 배열에 저장하고 sort한다음 젤 마지막 값 나눠
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i =0; i<n; i++) {
			num[i]= sc.nextInt();
		}
		double sum = 0;
		Arrays.sort(num);
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		double score = sum*100/num[n-1]/n;
		 System.out.println(score);
	}

}
