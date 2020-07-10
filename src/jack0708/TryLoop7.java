package jack0708;

public class TryLoop7 {

	public static void main(String[] args) {
		int sum = 0;
		
		//이곳에 for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하세요.
		
		for (int i = 1 ; i <= 100 ; i++) {
			if (i%3 == 0) {
				sum = i + sum;
				System.out.printf("+%3d \n" , i);
			} // if end
						
		} //for end
		
		System.out.println("3의 배수의 합: " + sum);

	}// main end

}// class end
