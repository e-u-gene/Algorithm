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
		// i와 j가 만날때까지 while문으로 반복시켜준다.
		while(i < j) {
			// 처음에 j-1 !=1로 했는데 에러 발생해서,,, 바꾸었읍니다.
			// 투포인터 이용해 두 인덱스가 만날때 종결해준다.
			// arr[i]의 값과 arr[j]를 더했을때, m보다 작으면
			// i++ 해줘서 두 배열요소값의 합을 크게 만들어준다.
			if(arr[i]+arr[j] < m) {
				i++;
			}
			// arr[i]의 값과 arr[j]의 값을 더했을때, m보다 크면
			// j--를 해주어 두 배열요소값의 합을 작게 만들어준다.
			else if(arr[i]+arr[j] > m) {
				j--;
			}
			else 
				// 그외의 경우는 arr[i]+arr[j]== m인경우 이므로
				// count++을 해주고, i++, j--를 해준다.
				// j--를 해주는 이유는 i++만 해주면 어짜피 두 배열요소의 합이 계속 m보다 크게나오므로
				// i++과 j--를 통해 시작점과 끝점을 변화 시켜준다.
				count++;
				i++;
				j--;
		}
		System.out.println(count);
	}

}
