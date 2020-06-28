package t2;

public class Stack {

	private int size;
	private int[] stackArr;
	int hi = 0; 
	int top=-1;
	Integer[] minArray ;
	int minArrayi=-1;
	private int minEle;
	Stack(int size){
		this.size = size;
		this.stackArr = new int[this.size];
		this.minArray = new Integer[this.size];
	}

	int push(int n) throws Exception {
		if(hi == size-1) {
			throw new Exception("Stack full");
		}
		stackArr[hi++]=n;
		top++;
		minArrayi++;

		if(minArrayi >0 && minArray[minArrayi-1] >= n) {
			minArray[minArrayi]=n;
			this.minEle = minArray[minArrayi];
		}else if(minArrayi == 0) {
			minArray[minArrayi]=n;
		}else {
			minArrayi--;
		}


		//findLeastEle(n);
		return n;

	}

	void pop() throws Exception {
		if(top < 0) {
			throw new Exception("Stack is empty already");
		}
		System.out.println(" stackArr[top] "+stackArr[top]);
		if(stackArr[top]<=this.minEle) {
			System.out.println(true);
			minArrayi--;
		}
		for(int i =0; i < hi; i++) {
			System.out.println(" element "+ i +" is "+minArray[i]);
		}
		this.minEle = minArray[minArrayi];
		hi--;
		top--;



	}

	void printStack() {
		for(int i =0; i < hi; i++) {
			System.out.println(" element "+ i +" is "+stackArr[i]);
		}
	}

	int getMinEle(){
		return this.minEle;
	}





	public static void main(String[] args) throws Exception {
		Stack s= new Stack(5);
		s.push(2);
		s.push(3);
		s.push(1);
		s.push(0);
		s.printStack();
		s.pop();
		s.pop();

		System.out.println(s.getMinEle());
	}

}
