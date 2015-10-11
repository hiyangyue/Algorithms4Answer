package m1_1BasicCodeModel;

/*
 * 求两个数的最大公约数
 */
public class Ex_1_1_24 {

	public static void main(String[] args) {

		caluecate(100, 30);	
	}
	
	private static void caluecate(int a,int b){
		
		int min = (a > b) ? b : a;
		int max = (a > b) ? a : b;
		
		int value = 1;
		
		for( int i  = min ; i >= 1 ; i --){
			if (min % i == 0 && max % i == 0) {
				value = i;
				System.out.println(value);
				break;
			}
		}
		
		
	}

}
