package ProgrammersTest;
//부족한 금액 계산하기
public class Test15 {
	public static void main(String[] args) {
		
		Solution16 s = new Solution16();
		System.out.println(s.solution(3, 20, 4));
		
	}
}


class Solution16 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        
        long totalcount = (count * (1 + count))/2;
        
        long totalmoney = price * totalcount;
        
        if(money >= totalmoney) {
        	return 0;
        } else {
        	return totalmoney - money;
        }
        
    }
    
}