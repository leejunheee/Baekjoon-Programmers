package ProgrammersTest;

import java.util.ArrayList;
import java.util.Collections;

//K번째수 
public class Test3 {
	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < commands.length; i++) {
			for (int j = 0; j < commands[0].length; j++) {
//				System.out.println(commands[i][j]);
				a = commands[i][0];
				b = commands[i][1];
				c = commands[i][2];
			}

			for (int k = (a - 1); k <= (b - 1); k++) {
//				System.out.println(array[k]);

				list.add(array[k]);

			}
			Collections.sort(list);

			for (int n = 0; n < list.size(); n++) {

				list2.add(list.get(c - 1));
				list.clear();

			}

		}
		
		int[] answer = new int[list2.size()];
		
		for(int i = 0; i < list2.size(); i++) {
			answer[i] = list2.get(i);
		}
		

	}
}
