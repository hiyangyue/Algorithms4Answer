package m1_1BasicCodeModel;

public class Ex_1_1_07 {

	public static void main(String[] args) { 
        
		c();
    } 
	
	private static void a(){
		double t = 9.0;
        while (Math.abs(t - 9.0/t) > .00001)
        { 
            t = (9.0/t + t) / 2.0;
            System.out.printf("%.5f\n", t);
        } 
         
        // System.out.println('b' + 'c'); 
	}
	
	private static void b(){
		int sum = 0 ;
		for(int i = 1; i < 5 ; i++){
			for(int j = 0 ; j < i ; j ++ ){
				sum ++;
				System.out.println(sum);
			}
		}
	}
	
	private static void c(){
		int sum = 0;
		for (int i = 1 ; i < 1000 ; i = i * 2){
			for( int j = 0 ; j < 1000 ; j ++){
				sum ++;
				System.out.println(sum);
			}
		}
	}
	

	
}
 