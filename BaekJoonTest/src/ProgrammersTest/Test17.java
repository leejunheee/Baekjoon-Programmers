package ProgrammersTest;

//이상한 문자 만들기 
public class Test17 {
	public static void main(String[] args) {
		Solution18 s = new Solution18();
		System.out.println(s.solution("try hello world nikce bibib"));
//		String answer = "hello";
//		 char[] arr;
//	       arr = answer.toCharArray();
//	       
//	       for(int i =0; i < arr.length; i ++) {
//	    	   if(i%2 == 1) {
//	    		   arr[i] = (char)(arr[i]-32);
//	    	   }
//	       }
//	       System.out.println(arr);

	}
}

class Solution18 {
	public String solution(String s) {
		String answer = "";

		String[] str = s.split("");
		int cnt = 0;
		String space = " ";
		
		for(int i =0; i<str.length; i++) {
			if(str[i].equals(space)) {
				cnt=0;
			} else {
				if(cnt%2==0) {
					cnt++;
					str[i] = str[i].toUpperCase();
				} else {
					cnt++;
					str[i] = str[i].toLowerCase();
				}
			}
			answer += str[i];
		}
		
		
		return answer;
	}
}
