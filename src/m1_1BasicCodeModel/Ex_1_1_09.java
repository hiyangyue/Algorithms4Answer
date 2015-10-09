package m1_1BasicCodeModel;

import java.io.ObjectInputValidation;

/*
 * 将一个正整数用二进制表示并且转换成一个String类型的S
 */
public class Ex_1_1_09 {
	
	static int n = 10;
	
	public static void main(String[] args){

		//Java中自带的方法
		String s1 = Integer.toBinaryString(n);
		System.out.println(s1);
		
		//其他的实现方法
		String s2 = "";
		for ( int i = 10 ; i > 0 ; i = i / 2){
			s2 = (i % 2) + s2;
			System.out.println(s2);
		}
		
	}


}
