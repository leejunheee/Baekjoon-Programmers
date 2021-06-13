package forTest;

import java.util.Scanner;

public class Test2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i =0; i< a; i++) {
			for(int j=0; j < (4-i); j++) {
				System.out.print(" ");
			}
			for(int k=0; k <=i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}


