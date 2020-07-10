package test;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] anArray; // 배열 선언 or declaration of an array
		
		anArray = new int [10];  // 배열 생성 및 10개 요소에 메모리 할당
		
		for (int i = 0 ; i <10; i++ ) {
			anArray[i] = (i+1)*100;			
		
			System.out.println("Element at index " + 
			  i + " : "+ anArray[i]);
		}

		
		
		
		
	} // main end

} //class end
