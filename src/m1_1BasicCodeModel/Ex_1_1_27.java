package m1_1BasicCodeModel;
/*
 * 二项分布
 */
public class Ex_1_1_27 {
	
	static int count = 0;

	public static void main(String[] args) {
		
		binomial(100, 50, 0.25);
	}
	
	
	public static double binomial(int n, int k, double p){ 
		
		count = count + 1;
		
		if (n == 0 && k == 0) return 1.0;
	    if (n < 0 || k < 0) return 0.0;
	         
	    return (1.0 - p) * binomial(n-1, k, p) + p * binomial(n-1, k-1, p);
	
	} 
	


}
