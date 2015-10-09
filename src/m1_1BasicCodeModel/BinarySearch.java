package m1_1BasicCodeModel;

public class BinarySearch {

	public static void main(String[] args) {
		
	}
	
	private static int rank(int a[],int key){
		int lo = 0;
		int hi = a.length -1;
		
		while (lo < hi) {
			int mid = lo + (hi - lo)/2;
			if (mid < a[mid]) {
				hi = mid - 1;
			}
			
			else if (mid > a[mid]) {
				lo = mid + 1;
			}
			
			else 
				return mid;
		}
		
		return -1;
		
		
	}

}
