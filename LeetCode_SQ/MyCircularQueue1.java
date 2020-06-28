package LeetCode_SQ;

public class MyCircularQueue1 {

	/** Initialize your data structure here. Set the size of the queue to be k. */
	int start = 0;
	int end = 0;
	int countOfElements = 0;
	final int[] arr;
	int size;
	public MyCircularQueue1(int k) {
		arr = new int[k];
		size=k;
	}

	/** Insert an element into the circular queue. Return true if the operation is successful. */
	public boolean enQueue(int value) {
		System.out.println(" countOfElements "+ countOfElements);
		if(countOfElements < size) {
         System.out.println("end is "+end);
			if(end == size) {
				end=0;
			}
			arr[end++]=value;
			countOfElements++;
			return true;

		}

		return false;
	}

	/** Delete an element from the circular queue. Return true if the operation is successful. */
	public boolean deQueue() {
		if(countOfElements != 0) {

			if(start == size-1) {
				if(start == end-1) {
					end = 0;
				}
				start=0;
			}else {
				if(start == end-1) {
					end++;
				}
				start++;
			}
			countOfElements --;
			return true;

		}

		return false;

	}

	/** Get the front item from the queue. */
	public int Front() {
		if(start == 0) {
			return arr[0];
		}
		return arr[start];
	}

	/** Get the last item from the queue. */
	public int Rear() {
		if(end == 0) {
			return arr[0];
		}
		return arr[end-1];

	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return countOfElements==0;
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		return countOfElements == size;
	}
	
	public void printQueue() {
		///System.out.println(arr[0]);
		
		  for(int i = 0; i < size; i++) { System.out.println(arr[i]+" --> "); }
		 
	}

	public static void main(String[] args) {
		MyCircularQueue1 obj = new MyCircularQueue1(5);
		/*
		 * obj.printQueue(); boolean param_1 = obj.enQueue(1);
		 * System.out.println("1 added "+ param_1); obj.printQueue(); boolean param_2 =
		 * obj.deQueue(); System.out.println("1 removed "+ param_2); obj.printQueue();
		 * int param_3 = obj.Front(); System.out.println("front of queue "+ param_3);
		 * int param_4 = obj.Rear(); System.out.println("rear of queue "+ param_4);
		 * boolean param_5 = obj.isEmpty(); System.out.println("is queue empty"+
		 * param_5); boolean param_6 = obj.isFull(); System.out.println("is queue full"+
		 * param_6);
		 */
		
		obj.printQueue();
		boolean param_1 = obj.enQueue(1);
		System.out.println("1 added "+ param_1 + obj.arr[0]);
		boolean param_2 = obj.enQueue(2);
		System.out.println("2 added "+ param_2 + + obj.arr[1]);
		boolean param_3 = obj.enQueue(3);
		System.out.println("3 added "+ param_3 + obj.arr[2]);
		boolean param_4 = obj.enQueue(4);
		System.out.println("4 added "+ param_4+ obj.arr[3]);
		boolean param_5 = obj.enQueue(5);
		System.out.println("5 added "+ param_5 + obj.arr[4]);
		boolean param_6 = obj.enQueue(6);
		System.out.println("6 added "+ param_6);
		obj.printQueue();
		System.out.println(" front "+ obj.Front());
		System.out.println(" Rear "+ obj.Rear());
		System.out.println(" full "+ obj.isFull());
		System.out.println(" empty "+ obj.isEmpty());
		boolean param_7 = obj.deQueue(); //1
		System.out.println("ele removed "+ param_7);
		System.out.println(" front "+ obj.Front());
		System.out.println(" Rear "+ obj.Rear());
		
		boolean param_8 = obj.deQueue(); //2 
		System.out.println("ele removed "+ param_8);
		System.out.println(" front "+ obj.Front());
		System.out.println(" Rear "+ obj.Rear());
		
		boolean param_9 = obj.deQueue(); //3
		System.out.println("ele removed "+ param_9);
		System.out.println(" front "+ obj.Front());
		System.out.println(" Rear "+ obj.Rear());
		
		boolean param_10 = obj.deQueue(); //4
		System.out.println("ele removed "+ param_10);
		System.out.println(" front "+ obj.Front());
		System.out.println(" Rear "+ obj.Rear());
		
		boolean param_11 = obj.deQueue(); //5
		System.out.println("ele removed "+ param_11);
		System.out.println(" front "+ obj.Front());
		System.out.println(" Rear "+ obj.Rear());
		



		//boolean param_7 = obj.deQueue();
	

		/**
		 * Your MyCircularQueue object will be instantiated and called as such:
		 * MyCircularQueue obj = new MyCircularQueue(k);
		 * boolean param_1 = obj.enQueue(value);
		 * boolean param_2 = obj.deQueue();
		 * int param_3 = obj.Front();
		 * int param_4 = obj.Rear();
		 * boolean param_5 = obj.isEmpty();
		 * boolean param_6 = obj.isFull();
		 */
	}

}
