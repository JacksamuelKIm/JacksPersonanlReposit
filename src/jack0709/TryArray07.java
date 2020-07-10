package jack0709	;

import java.util.Arrays;
import java.util.Collections;
public class TryArray07 {

	public static void main(String[] args) {
		//문제) 로또 번호 추첨기를 만들려고 합니다. 
		//	   정수 6개가 들어가는 lotto라는 이름의 배열을 생성하고
		//	  Math.random으로 1~45 사이의 숫자를 랜덤으로 발생시켜 차례로 배열에 넣고 
		//    탭만큼 띄워서 출력하세요. 
		//	  예: 20		5		1		18		32		30   
	
		int[] lotto;
		lotto = new int[6];
						
		System.out.print("당첨 번호 : ");
		for (int i=0; i<lotto.length ; i++) {
			lotto[i] = (int) (Math.random()*45)+(1);   /// 로또에서는 1~45중 6개이기 때문에 같은 번호가 중복되는 것 자체가 불가능한데... 중복제외 없나?
			 				  // 이렇게 복잡하게 할 필요 없이 그냥 lotto = win = Math.random 이므로 win 빼
			
		
			System.out.print(lotto[i] + "\t");				
		}
		
		System.out.println();
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));  // 이렇게 함으로서 올림차순(?)으로 배열은 시켰으나 음.... 뭔가 부족.
		Collections.shuffle(Arrays.asList(lotto));  // 이렇게 하면 duplicated한 number는 없지만(?? 정말로?)... 방송나갈때는 배열 제대로 하잖아!? 방법 없나?
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main end

}//class end
