package test;

import java.util.Set;
import java.util.TreeSet;

public class ThirdMax {

	public static int thirdMax(int[] nums) {

		TreeSet<Integer> st = new TreeSet<Integer>();
		for(int num:nums) {
			if(!st.contains(num)) {
				if(st.size()==3) {

					if(st.first() < num) {
						st.pollFirst();
						st.add(num);
					}

				}else {
					st.add(num);
				}
			}
		}

		if(st.size() < 3) {
			return st.last();
		}
		return st.first();

	}

	public static void main(String[] args) {

		System.out.println(thirdMax(new int[] {3, 2, 1}));
		System.out.println(thirdMax(new int[] {1,2}));
		System.out.println(thirdMax(new int[] {2, 2, 3, 1}));

	}

}
