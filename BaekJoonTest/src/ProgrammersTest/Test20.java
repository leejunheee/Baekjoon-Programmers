package ProgrammersTest;

import java.util.ArrayList;
import java.util.Arrays;

//제일 작은 수 제거하기 
public class Test20 {
	public static void main(String[] args) {
		Solution21 s = new Solution21();
		int[] a = {10,6,4,1};
		System.out.println(s.solution(a));
		
	}
}

class Solution21 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i =0; i < arr.length; i++) {
        	list.add(i, arr[i]);
        }
        
        if(list.size() == 1) {
        	answer.add(-1);
        } else {
        	
        	for(int i =0; i< list.size(); i++) {
        		if(list.get(i) == Arrays.stream(arr).min().getAsInt()) {
        			list.remove(i);
        		}
        	}
        	answer = list;
        }
		return answer;
        
    }
}