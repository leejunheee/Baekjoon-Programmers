package arrayTest;

import java.util.Scanner;

public class Test2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int k = a * b * c;
		String str = Integer.toString(k);
		sc.close();
		
		for(int i =0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j< str.length(); j++) {
				if((str.charAt(j) -'0')== i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
}
