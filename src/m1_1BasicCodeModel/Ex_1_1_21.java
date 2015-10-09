package m1_1BasicCodeModel;

/*
 * 求二分算法的递归深度
 */
public class Ex_1_1_21 {
	
	public static void main(String[] args){
	
		//test
		int a[] = { 1,2,3,4,5,6,7,8,9};
		rank(a, 2, 0, 9, 1);
		
	}
	
	//BinarySearch
	private static int rank(int a[],int key,int lo,int hi,int indent){
		
		System.out.println(indent);
		
		if (lo < hi) {
			int mid = lo + (hi - lo)/2;
			if (mid < a[mid]) {
				return rank(a, key, lo, mid -1, indent + 1);
			}
			
			else if (mid > a[mid]) {
				return rank(a, key, mid + 1, hi, indent);
			}
			
			else 
				return mid;
		}
		
		return -1;
		
		
	}
	
	
	
	
	

}
