package ifTest;

import java.util.Scanner;

//두수 비교하기 !
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println('>');
		} else if (a < b) {
			System.out.println('<');
		} else {
			System.out.println("==");
			
		}
	}
}
