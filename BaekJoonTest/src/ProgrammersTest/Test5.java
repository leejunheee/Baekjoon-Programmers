package ProgrammersTest;

//소수 찾기 
public class Test5 {
	public static void main(String[] args) {
		Solution9 s = new Solution9();
		System.out.println(s.solution(10));
	}

}

class Solution9 {
	public int solution(int n) {
		int answer = 1;

		for (int i = 3; i <= n; i++) {
			int cnt = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					cnt++;
					break;
				}
			}
			if(cnt == 0) {
				answer++;
			}
		}
		return answer;
	}
}
