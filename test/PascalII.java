package test;

import java.util.ArrayList;
import java.util.List;

public class PascalII {

	public static List<Integer> getRow(int rowIndex) {

		ArrayList al = new ArrayList<Integer>();
		if(rowIndex < 0) {
			return al;
		}
		al.add(1);
		for(int i = 1; i <= rowIndex; i++) {
			List tempList = new ArrayList<Integer>();
			for(int j = i-1; j >0; j--) {
				System.out.println((int)al.get(j-1)+(int)al.get(j));
				tempList.add((int)al.get(j-1)+(int)al.get(j));
				//al.set(j, (int)al.get(j-1)+(int)al.get(j));

			}
			al.addAll(tempList);
			al.clear();
			al.add(1);
			al.addAll(tempList);
			al.add(1);
		}

		return al;


	}

	public static void main(String[] args) {
		System.out.println(getRow(2));

	}

}
