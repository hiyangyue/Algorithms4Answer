package m1_1BasicCodeModel;

import java.io.ObjectInputValidation;

/*
 * ��һ���������ö����Ʊ�ʾ����ת����һ��String���͵�S
 */
public class Ex_1_1_09 {
	
	static int n = 10;
	
	public static void main(String[] args){

		//Java���Դ��ķ���
		String s1 = Integer.toBinaryString(n);
		System.out.println(s1);
		
		//������ʵ�ַ���
		String s2 = "";
		for ( int i = 10 ; i > 0 ; i = i / 2){
			s2 = (i % 2) + s2;
			System.out.println(s2);
		}
		
	}


}
