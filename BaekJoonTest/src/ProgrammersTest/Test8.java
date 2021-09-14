package ProgrammersTest;

//최대공약수와 최소공배수 
class Solution7 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		int i = 1;
		int k = 1;

		if (n < m) {
			while (true) {
				m = m * k;
				while (n * i > m) {
					i++;
					if (n * i == m) {
						answer[1] = m;
						break;
					} else {
						k++;
						
					}
				}

			}
		}//if 

		return answer;
	}
}

public class Test8 {
	public static void main(String[] args) {
		Solution7 s = new Solution7();
		System.out.println(s.solution(3, 12));
	}
}
