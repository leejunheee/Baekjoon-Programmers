package ProgrammersTest;
//x만큼 간격이 있는 n개의 숫자


public class Test22 {
	public static void main(String[] args) {
		Solution23 s = new Solution23();
		System.out.println(s.solution(-4, 2));
	}
}

class Solution23 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        
        for(long i = 0; i < n; i++) {
        	answer[(int) i] = x * (i+1);
        }
        
        
        return answer;
    }
}