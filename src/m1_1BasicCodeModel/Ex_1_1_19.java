package m1_1BasicCodeModel;

/*
 * ��쳲���������
 * 
 * ע����������˵���Ѳ�����������0��1��ʼ��֮��ķѲ�����ϵ������֮ǰ��������ӣ�������ʽ���£�
 *	  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946��������������
 */
public class Ex_1_1_19 {

	public static void main(String[] args) {
		System.out.println(F(10));
		F2(0,1,0,10);
	}
	
	//����ԭ����
	private static int F(int N){ 
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    } 
	
	//�ݹ�
	private static void F2(int valueA,int valueB,int i,int N){
		
		i ++;
		
		if (i < N) {
			if (i <= 1) {
				System.out.println(valueA);
				System.out.println(valueB);
			}
			
			int valueC = valueA + valueB;
			valueA = valueB;
			valueB = valueC;
			
			System.out.println(valueC);
			
			F2(valueA, valueB, i, N);
		}
	}
	
	

	
	

}
