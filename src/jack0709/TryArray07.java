package jack0709	;

import java.util.Arrays;
import java.util.Collections;
public class TryArray07 {

	public static void main(String[] args) {
		//����) �ζ� ��ȣ ��÷�⸦ ������� �մϴ�. 
		//	   ���� 6���� ���� lotto��� �̸��� �迭�� �����ϰ�
		//	  Math.random���� 1~45 ������ ���ڸ� �������� �߻����� ���ʷ� �迭�� �ְ� 
		//    �Ǹ�ŭ ����� ����ϼ���. 
		//	  ��: 20		5		1		18		32		30   
	
		int[] lotto;
		lotto = new int[6];
						
		System.out.print("��÷ ��ȣ : ");
		for (int i=0; i<lotto.length ; i++) {
			lotto[i] = (int) (Math.random()*45)+(1);   /// �ζǿ����� 1~45�� 6���̱� ������ ���� ��ȣ�� �ߺ��Ǵ� �� ��ü�� �Ұ����ѵ�... �ߺ����� ����?
			 				  // �̷��� �����ϰ� �� �ʿ� ���� �׳� lotto = win = Math.random �̹Ƿ� win ��
			
		
			System.out.print(lotto[i] + "\t");				
		}
		
		System.out.println();
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));  // �̷��� �����μ� �ø�����(?)���� �迭�� �������� ��.... ���� ����.
		Collections.shuffle(Arrays.asList(lotto));  // �̷��� �ϸ� duplicated�� number�� ������(?? ������?)... ��۳������� �迭 ����� ���ݾ�!? ��� ����?
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main end

}//class end
