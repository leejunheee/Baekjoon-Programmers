package ProgrammersTest;

import java.util.*;
import java.util.stream.*;

public class Test9 {
	public static void main(String[] args) {
		String[] s = { "abc", "hq", "xyz" };
		String[] a = { "hq", "abc", "pp", "xy", "pp", "hq" };

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (!s[i].equals(a[j])) {
					list1.add(a[j]);

				}
			}
		}
		
		for(int k =0 ; k < s.length; k ++) {
			list2.add(s[k]);
		}
		
		
//		for (String str : list1) {
//			if (!list2.contains(str)) {
//				list2.add(str);
//			}
//		}

		
		
		List result1 = list1.stream().distinct().collect(Collectors.toList());
		
		for(int r = 0; r < result1.size(); r ++) {
			System.out.println(result1.get(r));
		}

		System.out.println("-------------");
		
		System.out.println(result1.stream().filter(x -> !list2.contains(x)).collect(Collectors.toList()));
		System.out.println("-------------");
		
		
		for (int k = 0; k < s.length; k++) {
			for (int l = 0; l < result1.size(); l++) {
				if (s[k].equals(result1.get(l))) {
					result1.remove(l);
				}
			}
		}

		for(int r = 0; r < result1.size(); r ++) {
			System.out.println(result1.get(r));
		}


		String[] result = new String[result1.size()];
		int n = 0;
		for (String str2 : result) {
			result[n] = str2;
			n++;
		}

		for (int o = 0; o < result.length; o++) {
			System.out.println(result[o]);
		}

	}

}

class Solution10 {
	public List solution(String[] teamIDs, String[] additional) {

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		//비교하여 다른 요소가 있다면 list1에 추가  
		for (int i = 0; i < teamIDs.length; i++) {
			for (int j = 0; j < additional.length; j++) {
				if (!teamIDs[i].equals(additional)) {
					list1.add(additional[j]);

				}
			}
		}

		//list1엔 중복요소가 들어갔으므로 중복제거 
//		for (String str : list1) {
//			if (!list2.contains(str)) {
//				list2.add(str);
//			}
//		}
		
		List result1 = list1.stream().distinct().collect(Collectors.toList());

		//중복을 제거하였지만 teamIDs와의 중복 존재하므로 비교하여 중복제거 
		for (int k = 0; k < teamIDs.length; k++) {
			for (int l = 0; l < result1.size(); l++) {
				if (teamIDs[k].equals(result1.get(l))) {
					result1.remove(l);
				}
			}
		}


		//list2의 요소를 새로운 배열로 복사 
//		String[] result = new String[list2.size()];
//		int n = 0;
//		for (String str2 : list2) {
//			result[n] = str2;
//			n++;
//		}
//
//		for (int o = 0; o < result.length; o++) {
//			System.out.println(result[o]);
//		}

		return result1;
	}
}