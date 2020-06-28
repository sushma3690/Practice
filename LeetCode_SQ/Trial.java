package LeetCode_SQ;

import java.util.ArrayList;
import java.util.List;

public class Trial {

	public static void main(String[] args) {
		List<Integer> squares = new ArrayList<>();
        for(int i=1; i*i<=12; ++i)
            squares.add(i*i);
        System.out.println(squares);
	}
	
}
