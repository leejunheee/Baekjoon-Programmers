package ProgrammersTest;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double[][] arr = new Double[3][5];
		
		for (int i =0; i<arr.length; i++) {
			arr[i][0]=sc.nextDouble();
			arr[i][1]=sc.nextDouble();
			arr[i][2]=sc.nextDouble();
			
			for(int j =0; j<arr[0].length; j++) {
				arr[i][3] = arr[i][0]+arr[i][1]+arr[i][2];
				arr[i][4] = arr[i][3] / 3;
						
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
