package doit.Ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//오큰수 구하기
public class Q12 {
// 첫번째 줄에 수열의 크기가 주어지고 2번째줄에 수열 A의 원소가 주어짐!
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// InputStreamReader는 InputStream 객체를 입력으로 가지고 있어야 한다.
		// 그래서 System으로 받은 in을 집어 넣어준다.
		// BufferedReader는 InputStreamReader 의 객체를 입력값으로 받아준다.
		//BufferedReader로 받는 이유는 입력값이 얼마나 주어질지 모르는데 
		// 입력받을 배열크기를 무한정으로 잡아놓을 수 없기 때문이다.
		
		
		
		int n = Integer.parseInt(bf.readLine());
		int[] A = new int[n]; // 수열 배열
		int[] ans = new int[n]; // 정답 배열 생성
		//readLine() -> 한줄의 텍스트를 읽어올 수 있음
		// split을 공백으로 가르는 이유 ""으로받으면 13을 1, 3으로 받아버려서
		// " "으로 갈라준다.
		String[] str = bf.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			// str을 문자열로 받았으므로 정수형으로 바꿔서 수열배열 A에 대입
			A[i] = Integer.parseInt(str[i]);
		}

		
		// 스택 선언
		Stack<Integer> myStack = new Stack<>();
		// 초기엔 스택값이 비어있으므로 최초값을 push해 초기화
		myStack.push(0);
		
		
		for (int i = 1; i < n; i++) {
			// 스택값이 비어 있지 않고 스택의 top값이 A[i]값보다 작으면 계속 돌아간다.
			while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				// stack엔 인덱스만 들어가므로
				// stack을 뽑아 정답배열에 오큰수로 저장!
				
				ans[myStack.pop()] = A[i];
			}
			// 그리고 stack에 다음 인덱스를 push
			myStack.push(i);
		}// 이 for문을 n 전까지 돌린다.
		
		// 스택값이 비었다면 더이상 큰 수가 없는 것이므로
		while (!myStack.empty()) {
			// -1을 ans에 대입
			ans[myStack.pop()] = -1;
		}
		
		//ans에 대입한 값들을 출력해주기 위해 write를 쓴다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		// 현재 버퍼에 저장되어있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
		bw.flush();

	}

}
