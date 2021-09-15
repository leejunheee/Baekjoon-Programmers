package ProgrammersTest;

import java.util.*;

//에스티씨랩 -1 
public class Test13 {
	public static void main(String[] args) {
		int[][] m = { { 1, 19, 20, 8, 25 }, { 21, 4, 3, 17, 24 }, { 12, 5, 6, 16, 15 }, { 11, 18, 10, 9, 23 },
				{ 7, 13, 14, 22, 2 } };
//		int[][] m = { { 4, 2, 9 }, { 1, 3, 5 }, { 6, 8, 7 } };
		
		System.out.println(m.length);
		System.out.println(m.length/2);

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		int[][] list2 = new int[m.length][m[0].length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------");
		// 행렬 회전
		for (int j = 0; j < m.length; j++) {
			for (int k = 0; k < m.length; k++) {
				list2[j][k] = m[k][m.length - 1 - j];
			}
		}

		for (int r = 0; r < list2.length; r++) {
			for (int t = 0; t < list2.length; t++) {
				System.out.print(list2[r][t] + " ");
			}
			System.out.println();
		}

		// 0,0 0,1 0,2 0,3 0,4

		System.out.println("--------------");
		for (int i = 0; i < m.length; i++) {
			Arrays.sort(m[i]);
			list1.add(m[i][m.length / 2]);
			Arrays.sort(list2[i]);
			list3.add(list2[i][m.length / 2]);
		}

		for (int i : list1) {
			System.out.println(i);
		}
		System.out.println("0000000000000");
		for (int i : list3) {
			System.out.println(i);
		}

		int cnt = 0;
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list3.size(); j++) {
				if (list1.get(i) == list3.get(j)) {
					cnt++;
				}
			}
		}
		System.out.println("0000000000000");
		System.out.println(cnt);

	}

	class Solution14 {
		public int solution(int[][] m) {
			int answer = 0;
			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list3 = new ArrayList<Integer>();
			int[][] n = new int[m.length][m[0].length];

//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[0].length; j++) {
//				System.out.print(m[i][j] + " ");
//			}
//			System.out.println();
//		}

//		System.out.println("-----------------");
			// 행렬 회전
			for (int j = 0; j < m.length; j++) {
				for (int k = 0; k < m.length; k++) {
					n[j][k] = m[k][m.length - 1 - j];
				}
			}
//		
//		for(int r = 0; r < n.length; r ++) {
//			for(int t = 0; t < n.length; t++) {
//				System.out.print(n[r][t] + " ");
//			}
//			System.out.println();
//		}

			// 0,0 0,1 0,2 0,3 0,4

//		System.out.println("--------------");

			// 정렬 후 중앙값 찾기
			for (int i = 0; i < m.length; i++) {
				Arrays.sort(m[i]);
				list1.add(m[i][m.length / 2]);
				Arrays.sort(n[i]);
				list3.add(n[i][m.length / 2]);
			}

//		for (int i : list1) {
//			System.out.println(i);
//		}
//		System.out.println("0000000000000");
//		for (int i : list3) {
//			System.out.println(i);
//		}

			for (int i = 0; i < list1.size(); i++) {
				for (int j = 0; j < list3.size(); j++) {
					if (list1.get(i) == list3.get(j)) {
						answer++;
					}
				}
			}
//		System.out.println("0000000000000");
//		System.out.println(cnt);

			return answer;
		}
	}
}
