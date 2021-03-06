package BS;

public class BinarySearch {

	static int binarySearch(int[] arr, int low, int high, int x) {
        //System.out.println(" binarySearch "+low+"  "+high+" "+x);
		if( low <= high) {
			int mid = (high+low)/2;
			//System.out.println("mid is "+ mid);
			if(arr[mid]==x) {
				//System.out.println("Equal So print ");
				return mid;
			}else if(arr[mid] < x ) {
				//System.out.println("Less, Search in right ");
				return binarySearch(arr, mid+1, high, x); 
			}else {
				//System.out.println("High, Search in left  ");
				return binarySearch(arr, low, mid-1, x); // search in left of array, leaving the mid as its checked abve
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,4,4,4,5,8,10,15,19,35,100,102};
		System.out.println(" Found 101 at "+ binarySearch(arr,0,arr.length-1,101));//-1
		System.out.println(" Found 100 at "+ binarySearch(arr,0,arr.length-1,100));//11
		System.out.println(" Found 10 at "+ binarySearch(arr,0,arr.length-1,10));//7
		System.out.println(" Found 10 at "+ binarySearch(arr,0,arr.length-1,102));//12



	}

}
