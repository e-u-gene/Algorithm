package doit.Ch01;

import java.util.Arrays;
import java.util.Scanner;

// 주몽의 명령
public class Q07 {
// 갑옷을 두개의 재료로 만드는데 2가지 재료의 고유한 번호를 합쳐 M이 되면 갑옷이 만들어질때
// N개의 재료와 M이 주어졌을때 몇 개의 갑옷을 만들 수 있는지 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 첫번째에 입력되는 값을 n으로 받고
		int n = sc.nextInt();
		// 두번째 입력되는 값을 m으로 받는다.
		int m = sc.nextInt();
		// 배열을 n만큼 크기 지정해주고
		int [] arr = new int[n];
		
		// for문으로 입력되는 배열 값을 받는다.
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int i = 0;
		int j = n-1;
		int count = 0;
		while(i < j) {
			// 처음에 j-1 !=1
			if(arr[i]+arr[j] < m) {
				i++;
			}
			else if(arr[i]+arr[j] > m) {
				j--;
			}
			else
				i++; j--; count++;
		}
		System.out.println(count);
	}

}
