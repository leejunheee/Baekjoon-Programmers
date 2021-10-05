package ProgrammersTest;

//음양 더하기

public class Test23 {
	public static void main(String[] args) {
		Solution24 s = new Solution24();
		int[] a = { 4, 7, 12 };
		boolean[] b = { true, false, true };

		System.out.println(s.solution(a, b));

	}
}

class Solution24 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		
		for(int i =0 ; i< absolutes.length; i++) {
			answer += absolutes[i] * (signs[i] ? 1 : -1);
		}


		return answer;
	}
}