package ProgrammersTest;

public class Test10 {
	public static void main(String[] args) {
		
		Solution11 s = new Solution11();
		System.out.println(s.solution(6, 1));
		
		
	}

}

class Solution11 {
    public int[] solution(int day, int k) {
        int[] answer = new int[12];
        
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sumDay = 0; 
        
        for( int i = 0 ; i<months.length; i ++) {
        	if( i != 0) {
        		sumDay += months[i -1];
        	} else {
        		sumDay = day + k -1;
        	}
        	
        	int currentDay = sumDay % 7;
        	
        	if(currentDay == 5 || currentDay == 6) {
        		answer[i] = 1;
        	} else {
        		answer[i] = 0;
        	}
        	
        }
        
        
        return answer;
    }
}
