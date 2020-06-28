
public class TrafficLight {
	static boolean current=true;
	static boolean left=false;
	static boolean right=false;
	static boolean opposite=false;
	static class Light{
		
		public void showLightData() {
			synchronized(this) {
				if(current) {
					current = !current;
					left=true;
				}
				if(left) {
					left = !left;
					right=true;
				}
				if(right) {
					right = !right;
					opposite=true;
				}
				if(opposite) {
					opposite = !opposite;
					opposite=false;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		
		//Object signal = new Object();
		     
				
				
		Thread t1= new Thread(()->{
			if(current) {
				System.out.print(" current road green");
			}else {
				System.out.print(" current road green");
			}
		});
		Thread t2= new Thread(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!left) {
				System.out.print(" stopped");
			}else {
				System.out.print(" left road green");
			}
		});
       Thread t3= new Thread(()->{
    	   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!right) {
				System.out.print(" stopped");
			}else {
				System.out.print(" right road green");
			}
		});
       Thread t4= new Thread(()->{
    	   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!opposite) {
				System.out.print(" stopped");
			}else {
				System.out.print(" opposite road green");
			}
		});
		
		
		
	}
	

}
