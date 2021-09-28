package ProgrammersTest;

import java.util.*;
//제일 작은수 제거 
public class Test15 {
	public static void main(String[] args) {
		
		
		int[] a = {4,3,2,1};
		
		
		Solution16 s = new Solution16();
		System.out.println(s.solution(a));
		
	}

}

class Solution16 {
    public int[] solution(int[] arr) {
        int[] answer = null;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
        	list.add(arr[i]);
        }
        
        Collections.sort(list);
        
        for(int i : list) {
        	System.out.print(i);
        }
        
        
        System.out.println();
        System.out.println("=======");
        
        if(list.size() == 1 ) {
//        	answer = -1;
        } else {
        	list.remove(0);
//        	answer = 
        }
        
     
        return answer;
    }
}

