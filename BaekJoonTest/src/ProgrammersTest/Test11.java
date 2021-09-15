package ProgrammersTest;
import java.util.*;
import java.util.stream.*;

//에스티씨랩 -5번 
public class Test11 {
	public static void main(String[] args) {
		int[] cards = {1,3,2,2,5,5,1};
		
	
		
		Arrays.sort(cards);
		
		for(int i : cards ) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("=================");
		
		
		
		for(int i = 0 ; i <cards.length; i ++) {
			if(cards[i] == cards[i+1] ) {
				i = i + 1;
			} else {
				System.out.println(cards[i]);
				
			}
		}
		
	}

}
class Solution12 {
    public int solution(int[] cards) {
        int answer = 0;
        
        //배열 정렬 
        Arrays.sort(cards);
        
        
        //다음 카드와 비교 후 같은 숫자면 한칸 건너뛰기 
        for(int i = 0 ; i <cards.length; i ++) {
			if(cards[i] == cards[i+1] ) {
				i = i + 1;
			} else {
				answer = cards[i];
				
			}
		}
        
        return answer;
    }
}