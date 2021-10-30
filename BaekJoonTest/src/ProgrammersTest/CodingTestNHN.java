package ProgrammersTest;

import java.io.*;
import java.util.*;
import java.lang.*;

class CodingTestNHN {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt(); // 송수신 기록의 수
		List<String> list = new ArrayList<String>();
		String[] logs = new String[n]; // 송수신 기록
		int m = n;

		for (int i = 0; i < n; i++) {
			logs[i] = scanner.nextLine().trim();
			
			list.add(logs[i]);
			
			
		}//for
		for(int i =0; i < list.size(); i++) {
			if(i>=1 && list.get(i).equals(list.get(i-1))) {
				int  k= 1;
				
				list.remove(i);
				String str = list.get(i-1);
				k++;
				m--;
				str = str + " ("+ k +")";
				list.set(i-1, str);
				
			}
		}
		System.out.println();
		System.out.print(m);
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}