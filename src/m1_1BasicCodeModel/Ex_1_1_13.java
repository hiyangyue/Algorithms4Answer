package m1_1BasicCodeModel;

import org.omg.CORBA.PRIVATE_MEMBER;

/*
 * 1.��ӡһ�� M ��  N �е�����
 * 2.�����к���
 */
public class Ex_1_1_13 {

	//����һ����ά����
	static int a[][] = { {1,2,3} , { 4,5,6} , { 7,8,9 } , {10,11,12} };
	static int arrA[][] = new int[a[0].length][a.length];
	
	public static void main(String[] args) {
		
		//��ӡ��ά����
		for( int i = 0 ; i < 4 ; i ++){
			
			for( int j = 0 ; j < 3 ; j ++){
				arrA[j][i] = a[i][j];
				System.out.print(arrA[j][i] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("����֮�������Ϊ:");
		
		//�����к���
		for( int i = 0 ; i < arrA.length; i ++){
			for( int j = 0 ; j < arrA[0].length; j ++){
				System.out.print(a[j][i] + " ");
			}
			
			System.out.println("");
			
		}
	}
	

}









