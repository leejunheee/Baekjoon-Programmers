package ifTest;
//윤년 
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int a = sc.nextInt();
		if((a%4 == 0) && (a%100 != 0 || a%400 ==0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		sc.close();
	}
}
