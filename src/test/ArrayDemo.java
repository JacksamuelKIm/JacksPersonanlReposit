package test;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] anArray; // �迭 ���� or declaration of an array
		
		anArray = new int [10];  // �迭 ���� �� 10�� ��ҿ� �޸� �Ҵ�
		
		for (int i = 0 ; i <10; i++ ) {
			anArray[i] = (i+1)*100;			
		
			System.out.println("Element at index " + 
			  i + " : "+ anArray[i]);
		}

		
		
		
		
	} // main end

} //class end
