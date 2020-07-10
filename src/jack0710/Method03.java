package jack0710;

public class Method03 {

	public static int doSomething() {  //작성 도중에 빨간 값이 뜬 것은 return값 입력 자리에 void가 아닌 데이터 타입을 넣어놨기에 그 값이 채워질때까지는 빨간줄
		int result;
		result = 10*100;
		return result;		
	} // 매개변수는 없고 반환값이 있는 경우
		
	public static void main(String[] args) {
		int x;
		x = doSomething();
		System.out.println("x :" + x);
		
	} //main end

} //class end
