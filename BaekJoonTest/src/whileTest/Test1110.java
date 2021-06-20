package whileTest;

import java.util.Scanner;

public class Test1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = a;
		int cnt = 0;
		while(true) {
			
			a = ((a%10)*10) + (((a/10)+(a%10))%10);
			cnt++;
			
			if(b==a) {
				break;
			}
		}
		System.out.println(cnt);
	}
}

// 55 50 5 05 55
// 26 2+6=8 68 6+8=14 84 8+4=12 42 4+2=6 26 
