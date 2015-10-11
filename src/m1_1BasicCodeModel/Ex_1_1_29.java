package m1_1BasicCodeModel;

public class Ex_1_1_29 {
	
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
	
	private static int count(int a[],int key){
		
		int count = 0;
		for(int j = rank(a, key) ; j < a.length && a[j] == key ; j++){
			count ++;
		}
		
		return count;
	}

}
