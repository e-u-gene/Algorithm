package doit.Ch01;

import java.util.Scanner;
import java.util.Stack;

// 스택으로 오름차순 수열 만들기
public class Q11 {
// 1번째 줄엔 수열의 개수 주어지고 그 크기만큼
	// 나머지 줄에 정수들이 주어질때!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 처음 입력되는 수를 n으로 받고
		int n = sc.nextInt();
		// 정수배열 a를 선언해 n으로 크기를 지정
		int[] a = new int[n];
		//for문을 통해 입력되는 값을 배열값으로 받는다.
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		// 값을 대입할 stack을 선언
		Stack<Integer> stack = new Stack<>();
		
		// 출력값을 출력해줄 스트링버퍼 선언
		StringBuffer bf = new StringBuffer();
		// 스택에 1부터 n까지 오름차순으로 대입할 것이므로 
        //num은 1로 선언과 동시에 초기화해준다.
		int num = 1;
		boolean result = true;
		for(int i =0; i<a.length; i++) {
			int su = a[i]; // a[0]은 입력받은 수열의 첫번째 값
			// su를 입력받은 수열값 하나하나씩 돌면서 초기화 해준다.
			if(su >= num) {
				// su가 num보다 크거나 같다면
				// while문을 su가 num보다 크거가 같을때까지 돌린다.
				while(su >= num) {
					// 예제에서 a[0]은 4이므로 num이 5가 될때 멈춘다.
					stack.push(num++);
					bf.append("+\n");// +출력해주고 줄바꿈 \n
				}
				// while문 끝나고 아직 if문 안에 있음!
				// su가 num보다 크거나 같을때 까지 대입해주면
				// stack의 top은 찾으려는 su의 값이므로 pop으로 뽑아내준다.
				stack.pop();
				bf.append("-\n");
			}
			
			else { //su < num 인경우
				int t = stack.pop();
				//정수 t를 스택의 top값으로 초기화해준다.
				
				if(t>su) {
	//여기서 수는 계속 a[i]다. for문안에 if-else로 조건을 준것이니까!
	// 이때 스택의 top값이 su값보다 크면 찾으려는 su는 top의 아래에 있으므로
	//꺼내올 수 없다.. 따라서 no가 출력되게 해야한다.
					System.out.println("NO");
					result = false;
					break;
					//그리곤 빠져나온다.
				}
				else {// t<=su 일경우엔
					bf.append("-\n");
					//이미 if절 위에서 pop을 진행했으므러로 pop 불필요
				}
				
			}
		}
		if(result)//result가 true일때만 돌아간다!
			System.out.println(bf.toString());
 
	}

}
