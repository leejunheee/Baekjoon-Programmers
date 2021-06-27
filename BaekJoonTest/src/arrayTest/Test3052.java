package arrayTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i]= sc.nextInt() % 42 ;
		}
		
		for(int num : arr) {
			if(!arraylist.contains(num)) {
				arraylist.add(num);
			}
		}
		
		System.out.println(arraylist.size());
	}
}
