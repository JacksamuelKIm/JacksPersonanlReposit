package jack0708;

public class GugudanWhile {
	public static void main(String[] args) {
		//노가다로 작성한 Gugudan1.java를 참고하셔서 똑같이 출력되도록 while(true)문을 작성해보세요.
		//dan과 cnt를 
		int dan=7,cnt=1;		
	
		while(true) {
			int result = dan*cnt;
			System.out.println(dan +" * " + cnt + " = " + result  );
			cnt +=1;
				if (cnt == 10) {
				break;
				} //if break
		} // while end
		
	}//end
}//class END
