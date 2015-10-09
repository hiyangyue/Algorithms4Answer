package m1_1BasicCodeModel;

import org.omg.CORBA.PRIVATE_MEMBER;

/*
 * 1.打印一组 M 行  N 列的数组
 * 2.交换行和列
 */
public class Ex_1_1_13 {

	//输入一个二维数组
	static int a[][] = { {1,2,3} , { 4,5,6} , { 7,8,9 } , {10,11,12} };
	static int arrA[][] = new int[a[0].length][a.length];
	
	public static void main(String[] args) {
		
		//打印二维数组
		for( int i = 0 ; i < 4 ; i ++){
			
			for( int j = 0 ; j < 3 ; j ++){
				arrA[j][i] = a[i][j];
				System.out.print(arrA[j][i] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("交换之后的数组为:");
		
		//交换行和列
		for( int i = 0 ; i < arrA.length; i ++){
			for( int j = 0 ; j < arrA[0].length; j ++){
				System.out.print(a[j][i] + " ");
			}
			
			System.out.println("");
			
		}
	}
	

}









