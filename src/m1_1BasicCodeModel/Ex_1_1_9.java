package m1_1BasicCodeModel;

import java.io.ObjectInputValidation;

/*
 * 将一个正整数用二进制表示并且转换成一个String类型的S
 */
public class Ex_1_1_9 {
	
	static int n = 10;
	
	public static void main(String[] args){
		a();
	}
	
	//Java自带的方法
	private static void a(){
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		
	}
	
	//其他的实现方法
	private static void b(){
		
	}
	
	private void dd(){
		
	}
	

}
