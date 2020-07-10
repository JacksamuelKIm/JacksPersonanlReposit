package jack0710;

import java.util.Arrays;

public class TryMethod3 {
	
	//문제) 어제 만들어보았던 로또발생기를 메소드	를 써서 구현해보고자 합니다. 
	// lottoInput에는 Math.random()을 사용하여 6개의 숫자 배열을 리턴하고,
	// lottoOutput에는 해당 배열을 매개변수로 받아 나란히 출력하도록 메소드를 완성하세요.
	//공유폴더의 0709\answer\TryArray08a.java를 참고하십시오.
	public static void main(String[] args) {
		TryMethod3 my = new TryMethod3();
		int[] a = my.lottoInput();
		my.lottoOutput(a);

	}// main end

	public int[] lottoInput() {// 리턴값
		int[] data = new int[6];
		for (int i=0; i<data.length; i++) {
			data[i] = (int) (Math.random()*45);
			for (int j=0; j<data.length; j++) {
				if (data[i] == data[i]) {
					j--;
					break;
				} //if end				
			} //for j end			
		} // for i end		
		return data;
	}// lottoInput end

	public void lottoOutput(int[] b) { // 매개인자
		Arrays.sort(b);
		System.out.print("로또 당첨번호 :  ");
		for (int temp : b) { 
			System.out.print(temp + "\t");
		}
	}// lottoOutput end
	
}// class end
