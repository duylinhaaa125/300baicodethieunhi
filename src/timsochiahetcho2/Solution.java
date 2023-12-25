package timsochiahetcho2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
	public static List<Integer> timSoChiaHetCho2(int[] a) {
		
		// tim theo mang
//		int[] result = new int[100];
//		int index = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				result[index] = a[i];
//				index++;
//			}
//		}
		
		//tao ra list luu kq
//		List<Integer> result = new ArrayList<Integer>();
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				result.add(a[i]);
//			}
//		}
		List<Integer> result = (List<Integer>) Arrays.stream(a)
												.filter(x -> x % 2 == 0)
												.boxed()
												.collect(Collectors.toList())
									;

		

		
		return result;
	}

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 6, 9, 12, 15, 20 };

//		int[] result = timSoChiaHetCho2(a);

//		for (int i = 0; i < result.length; i++) {
//			if (result[i] != 0) {
//				System.out.println(result[i]);
//			}
//		}
		
		List<Integer> rs = timSoChiaHetCho2(a);
		
		rs.forEach(num -> System.out.println(num));
	
	

	}
}
