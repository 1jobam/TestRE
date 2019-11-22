package test;

public class Test {
	
	public static void main(String[] args){
			
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
			
		System.out.println(1 + x << 33); // 1 + 2 << 33 == 3 << 33(쉬트프 왼쪽으로 33번 ) 
		//int = 32bit 00000000 00000000 000000000 000000000 ==
		System.out.println(y >= 5 || x < 0 && x > 2); // 5는  2 보다 크거나 같다 또는  2는  0보다 작으면서 2는  2보다 크다. 
		// true 논리연산자 가 들어가 true or false 출력 논리연산자는 처음의 출력값이 true 일경우 뒤에껀 제외하고 true로 표시 효율 적인 계산 적용 
		System.out.println(y += 10 - x++); // 5 += 10 - 2++  5 + 10 - 2 15 - 2 [답은 13 ]
		// 
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
			
	}
}
