package programmers.level00;
// 문자열 numbers가 주어질때, numbers를 정수로 바꿔 return
public class IHateEnglish {

	public static void main(String[] args) {
		String str = "onetwothreefourfivesixseveneightnine";
		System.out.println(solution(str));

	}
	// 1. zero부터 nine까지 문자열 배열 선언
	// 2. 0부터 9까지 문자열 배열 선언
	// 3. numbers를 replaceAll돌려서 다숫자로 바꿔주기
	
	static long solution(String numbers) {
        long answer = 0;
        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
       
        answer=Long.parseLong(numbers);
        return answer;
    }

}

//long answer = 0;
//String result = "";
//String[]str = {"zero", "one", "two", "three", 
//		"four", "five", "six", "seven", "eight", "nine"};
//String[] num = {"0","1","2","3","4","5","6","7","8","9"}; 
//for(int i = 0; i<str.length; i++) {
//   result += str[i];
//   result = result.replaceAll(str[i],num[i]);
//}
//answer=(long)Long.parseLong(result);
//return answer;