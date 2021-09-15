package ProgrammersTest;

import java.util.*;

//에스티씨랩 - 4 
public class Test12 {
	public static void main(String[] args) {
		Solution13 s = new Solution13();
		int[] arr = {2, 1, 3, 1, 4, 2, 1, 3};
//		
		System.out.println(s.solution(arr));
//		
		
//		int answer = -2;
//        
//        List<Integer> list = new ArrayList<Integer>();
//        
//        for(int j = 0 ; j < arr.length; j ++) {
//        	list.add(arr[j]);
//        }
//        
//        //중복 없을경우 
//        if(list.size() == list.stream().distinct().count()) {
//        	
//        	System.out.println(-1);
////        	answer = -1;
//        }
//        
//        List<Integer> list2 = new ArrayList<Integer>();
//        
//        for(int i = 0; i < arr.length; i++) {
//        	for(int k = i+1; k < arr.length; k ++) {
//        		if(arr[i] == arr[k]) {
//        			list2.add(k-1);
//        		}
//        	}
//        	
//        }//for 
//        
//        Collections.sort(list2);
//        
//        System.out.println(list2.get(0));
        
//        for(int i : list2) {
//        	System.out.println(i);
//        }
//        
//        for(int l = 0; l < list2.size(); l++) {
//        	System.out.println(list2.get(0));
//        }
		
	}
}
//{2, 1, 3, 1, 4, 2, 1, 3};
//{2, 1, 3, 1, 4, 2, 1, 3};

class Solution13 {
    public int solution(int[] arr) {
        int answer = -2;
        
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        
        for(int j = 0 ; j < arr.length; j ++) {
        	list.add(arr[j]);
        }
        
        //중복 없을경우 
        if(list.size() == list.stream().distinct().count()) {
        	answer = -1;
        } else {
        	
        	for(int i = 0; i < arr.length; i++) {
        		for(int k = i+1; k < arr.length; k ++) {
        			if(arr[i] == arr[k-1]) {
        				list2.add(k);
        			}
        		}
        		
        	}//for 
        	Collections.sort(list2);
        	answer = list2.get(0);
        }
        
        
        return answer;
    }
}

