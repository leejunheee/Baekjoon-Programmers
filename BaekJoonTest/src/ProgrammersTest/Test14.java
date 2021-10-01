package ProgrammersTest;

import java.util.*;
import java.util.stream.*;

public class Test14 {
	public static void main(String[] args) {
		
		String s = "BA";
		
		//소문자 변환 
		s = s.toLowerCase();

		char[] list =s.toCharArray();
		
		
		
		//정렬 
		Arrays.sort(list);
		 
		
		String result = new String(list);
		
		System.out.println("result : " + result);
		

		//알파벳 갯수 
		int[] arr = new int[26]; 
		
		for (int i = 0; i < s.length(); i++){
			 
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { // 대문자 범위
				arr[s.charAt(i) - 97]++;	// 해당 인덱스의 값 1 증가
			}

		}
		
		int max = -1;
		char ch = '?';
		String str = "";
		 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 97); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				
//				ch = (char) result;
			}
		}
		
		
		System.out.println(ch);
		
	}
}

class Solution15 {
	 public String solution(String s){
	        String answer = "a";

	        //전부 소문자 변환 
	        s = s.toLowerCase();
	        char[] list =s.toCharArray();


	        //정렬 
	        Arrays.sort(list);  

	        //문자열로 만들기 
	        String result = new String(list);


	        //알파벳 갯수 26개 
	        int[] arr = new int[26]; 

	        for (int i = 0; i < s.length(); i++){

	            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { // 대문자 범위
	                arr[s.charAt(i) - 97]++;    // 해당 인덱스의 값 1 증가
	            }

	        }

	        int max = 0;
	        char ch = '?';
	        String str = "";


	        //배열 원소값이 max보다 큰경우 해당 원소값을 max로 설정 
	        for (int i = 0; i < 26; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	                ch = (char) (i + 97); // 소문자 출력을 위한 97 더하기 
	                answer = Character.toString(ch); // 문자 -> 문자열 

	            }
	            else if (arr[i] == max) {

	                answer = result; 
	            }
	        }


	        return answer;
	    }
}