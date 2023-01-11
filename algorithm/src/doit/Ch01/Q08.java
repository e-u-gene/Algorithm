package doit.Ch01;

import java.util.Arrays;
import java.util.Scanner;

// 좋은 수 구하기
public class Q08 {
// 주어진 n 개의 수에서 다른 2개의 수의 합으로 표현되는 수가 있다면
// count++ 해주기.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 우선 첫 번째 입력 값은 주어진 n개의 수이므로 int n으로 받는다.
		// 첨에 이것도 long 형으로 선언했었는데,, 
		// 그러면 배열크기 선언불가하므로 int 형으로 받아줘야함.
		int n = sc.nextInt();
		// 입력된 값들을 받을 long 배열을 선언한다. 
		// 배열값 크기가 1,000,000,000 제한이므로 long으로 선언해줘야함. 
		long[] num = new long[n];
		// 배열의 크기는 long 값으로 선언할 수 없다...

		// 입력되는 값들을 for문을 통해 배열로 받는다.
		for (int i = 0; i < n; i++) {
			num[i] = (long)(sc.nextInt());
		}
		// 입력되는 값들이 순차적으로 들어오지 않으므로 다 받으면 정렬을 해주고
		Arrays.sort(num);
		// 투포인터로 구한 값과 찾으려는 값이 일치하면 ++해줄 count로 선언한다.
		int count = 0;
		
		// 찾으려는 값이 배열내 값이므로 k를 for문으로 
		// 돌려서 배열값 하나씩 훑을 수 있게 해준다.
		for (int k = 0; k < n; k++) {
			// 찾으려는 값도 long형으로 선언해주고
			long find = num[k];
			// 투포인터 값들을 지정해준다.
			int i = 0;
			int j = n - 1;

			
	// 투포인터 이니까 i와 j가 만나기 전까지 while문을통해 반복해준다.
			while (i < j) {
				// 배열의 i인덱스 값과 j인덱스 값의 합이 찾으려는 find와 일치하면
				if (num[i] + num[j] == find) {
					// count++을 해준다.
					// 다만 i와 j값이 찾으려는 num[k]와 일치하는 경우는 
					// 카운트하지 않기로 했으므로
					
					// 조건연산자를 통해 i와 j가 k가 아닌지 확인한다.
					// 만약 i나 j가 k와 같다면 num[i]와 num[k]가 같은값이 되니까
					// 카운트 해주지 않는다!
					if (i != k && j != k) {
						count++;
						break;
					} 
					// i와 k가 같으면 i++, j와 k가 같으면 j--
					else if (i == k) {
						i++;
					} else if( j == k) {
						j--;
					}
					
				} 
				// num[i] + num[j] > find 면 포인터 j를 줄여주기!
				else if (num[i] + num[j] > find) {
					j--;
				}
				else
					i++;
			}
		}
		System.out.println(count);

	}

}
