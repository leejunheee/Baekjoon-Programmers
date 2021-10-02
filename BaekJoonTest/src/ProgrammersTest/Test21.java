package ProgrammersTest;

import java.util.ArrayList;

//자연수 뒤집어 배열로 만들기

public class Test21 {
	public static void main(String[] args) {
		Solution22 s = new Solution22();
		System.out.println(s.solution(12345));
		
	}
}

class Solution22 {
    public ArrayList<Integer> solution(long n) {
        int[] answer = {};
        
        //long을 string로 변환 
        String str = Long.toString(n);
        
        //string 쪼개서 배열에 담기 
        String[] str1 = str.split("");
        
        //역순 배열 생성 
        String[] reverserStr1 = new String[str1.length];
        
        //역순 담기 
        for(int i = str1.length -1, j=0; i>=0; i--, j++) {
        	reverserStr1[j] = str1[i];
        }
        
        int[] arr = new int[str1.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i =0 ; i < arr.length; i++) {
        	list.add(Integer.parseInt(reverserStr1[i]));
        }
        
//        for(int i : arr) {
//        	System.out.println(i);
//        }
//        System.out.println(Arrays.toString(arr));
        
        return list;
    }
}
