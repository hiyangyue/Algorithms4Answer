package m1_1BasicCodeModel;


public class Ex_1_1_12 {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		for( int i = 0 ; i < 10 ; i ++){
			a[i] = 9 - i;
		}
				
		for( int i = 0 ; i < 10 ; i ++){
			a[i] = a[a[i]];
			//Compare test
			System.out.println(a[i]);
			System.out.println(a[a[i]]);
			System.out.println("......");
		}
		
		System.out.println(".........");
		
		for ( int i = 0 ; i < 10 ; i ++){
			System.out.println(a[i]);
		}
		
	}

}
