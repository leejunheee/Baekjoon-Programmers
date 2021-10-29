package ProgrammersTest;

//정수 제곱근 판별
public class Test19 {
	public static void main(String[] args) {
		Solution20 s = new Solution20();
		System.out.println(s.solution(9));

	}
}

class Solution20 {
	public long solution(long n) { 
		
		Double sqrt = Math.sqrt(n);
		
		if(sqrt == sqrt.intValue()) {
			return (long)Math.pow(sqrt +1, 2);
		} else {
			return -1;
		}

		
	}
}