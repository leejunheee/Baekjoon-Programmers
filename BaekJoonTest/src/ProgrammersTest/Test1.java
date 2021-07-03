package ProgrammersTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>(); 
		String s = new String();
        s = "Zbcdefg";
        		
        for(int i =0; i< s.length(); i++) {
        	list.add(s.charAt(i));
        }

        Collections.sort(list, Collections.reverseOrder());
        
        for(int i =0; i<list.size(); i++) {
        	System.out.print(list.get(i));
        }
        
        
	}
}

class Solution {
    public String solution(String s) {
    	String answer ="";
    	ArrayList<Character> list = new ArrayList<Character>(); 
        		
        for(int i =0; i< s.length(); i++) {
        	list.add(s.charAt(i));
        }

        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i<list.size(); i++) {
        	
        	answer += list.get(i);
        }
        
        return answer;
    }
}
