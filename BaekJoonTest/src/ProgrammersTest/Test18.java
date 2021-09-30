package ProgrammersTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

//정수 내림차순으로 배치하기 
public class Test18 {
	public static void main(String[] args) {
		Solution19 s = new Solution19();
		System.out.println(s.solution(636432));
		
	}
}
class Solution19 {
    public long solution(long n) {
        long answer = 0;
        
        //n 을 문자열로 변환
        String str = String.valueOf(n);
        
        //문자열 하나씩 쪼개기
        String[] str1 = str.split("");
        
        //쪼갠 문자열 내림차순 정렬
        Arrays.sort(str1,Collections.reverseOrder());
        
        
        //문자 배열 > 문자열로 변환 
        String arrayToString = Arrays.stream(str1).collect(Collectors.joining());
        
        //문자열 > 정수 변환 
        long l = Long.parseLong(arrayToString);
        
        return l;
    }
}