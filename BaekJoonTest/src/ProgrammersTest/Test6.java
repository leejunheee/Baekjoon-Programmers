package ProgrammersTest;
//시저 암호 
public class Test6 {
	public static void main(String[] args) {

		Cijer c = new Cijer();
		System.out.println(c.solution(" s      s", 4));

	}
}

class Cijer {
	public String solution(String s, int n) {
		String answer = "";
		char c;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				if ((char) (s.charAt(i) + n) > 'Z') {
					answer += (char) (s.charAt(i) + n - 26);
				} else {
					answer += (char) (s.charAt(i) + n);
				}
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				if ((char) (s.charAt(i) + n) > 'z') {
					answer += (char) (s.charAt(i) + n - 26);
				} else {
					answer += (char) (s.charAt(i) + n);
				}

			} else if (s.charAt(i) == ' ') {
				answer += " ";
			}

		} // for
		return answer;
	}
}
