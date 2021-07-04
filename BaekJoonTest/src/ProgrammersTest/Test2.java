package ProgrammersTest;
//문자열 내 p와 y의 개수 
public class Test2 {
	public static void main(String[] args) {
		String s = "pPoooyY";
		
		s = s.toLowerCase();
		
		boolean answer = true;
		int cntP = 0;
		int cntY = 0;
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == 'p') {
				cntP++;
			} else if(s.charAt(i)=='y') {
				cntY++;
			}
			
			if(cntP == cntY) {
				answer = true;
			} else {
				answer = false;
			}
		}
		
		System.out.println(answer);
	}
}
