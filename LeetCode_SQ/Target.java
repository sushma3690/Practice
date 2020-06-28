package LeetCode_SQ;

public class Target {
	
	    static int result = 0;
	    public static int findTargetSumWays(int[] nums, int S) {
	        if (nums == null || nums.length == 0) return 0;
	        dfs (nums, S, 0, 0);        
	        return result;       
	    }
	    
	    public static void dfs (int[] nums, int S, int current, int index) {
         //   System.out.println("main "+ S +"  "+ current+"   "+ index);
	        if (index == nums.length && current == S) {
	            result += 1;
	            System.out.println("one "+ S +"  "+ current+"   "+ index);
	            return;
	        }
             System.out.println("three  "+ S +"  "+ current+"   "+ index);

	        if (index < nums.length) {
	           System.out.println("two 1 "+ S +"  "+ current+"   "+ index);
	            dfs (nums, S, current + nums[index], index + 1);
		           System.out.println("two 2 "+ S +"  "+ current+"   "+ index);

	            dfs (nums, S, current - nums[index], index + 1);
	        }  

	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(findTargetSumWays(new int[] {1, 1, 1, 1, 1},3));
	    }

}
