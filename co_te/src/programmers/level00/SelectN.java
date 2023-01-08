package programmers.level00;

public class SelectN {
	//정수 n과 정수 배열이 주어질때, n의 배수만 출력하기!

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		System.out.println(solution(4,a));

	}
	static int[] solution(int n, int[] numlist) {
        int[]arr = new int[numlist.length];
        int count = 0;
        // numlist에서 하나씩 뽑아서 n나눈 값이 0이면 새 배열에 입력하기...
        for(int i = 0; i < numlist.length; i++) {
        	if(numlist[i]%n == 0){
        	arr[count] = numlist[i];
        	count++;}
        }
        // answer의 길이 count만큼 선언하고 for문으로 답 집어넣기
        int [] answer = new int[count];
        for(int i = 0; i < count; i++) {
        	answer[i] = arr[i];
        }
        return answer;
    }

}
