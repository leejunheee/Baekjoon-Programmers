package ProgrammersTest;
//부족한 금액 계산하기
public class Test16 {
	public static void main(String[] args) {
		
		Solution17 s = new Solution17();
		System.out.println(s.solution(3, 20, 4));
		
	}
}


class Solution17 {
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