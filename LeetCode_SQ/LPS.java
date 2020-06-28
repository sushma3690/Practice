package LeetCode_SQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class LPS {
	
	public static int numSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        for(int i=1; i*i<=n; ++i)
            squares.add(i*i);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        Set<Integer> visited = new HashSet<>();
        visited.add(n);
        int level =0;
        while(!queue.isEmpty()){
            int size = queue.size(); 
            while(size-- > 0){ 
            	System.out.println(level+"  "+queue);
                int currSum = queue.poll();  
                if(currSum == 0) 
                    return level;
                for(int square: squares){  
                    if(currSum - square >= 0){ 
                        if(!visited.contains(currSum - square)) 
                            queue.offer(currSum - square); 
                    }
                    else{
                        break; 
                    }
                    visited.add(currSum - square);
                }
            }
            level++; 
        }
        return -1;
    }
	
	public static void main(String[] args) {
		System.out.println(numSquares(12));
	}
	
	

}
