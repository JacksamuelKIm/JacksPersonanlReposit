package jack0708;

public class TryLoop1 {

	public static void main(String[] args) {
		//�ǽ�)num=����, tot=�հ��� ���� ��, 
		//num�� �ϳ��� �������Ѽ� 1���� 10������  while(true)�� �Ἥ ���ϼ���.
		//��µ� ���: 1  2  3  4  5  6  7  8  9  10  tot=55
				
		System.out.println("while(true)���� �ǽ�");
		int num = 0, tot = 0;
		//while(true)...
		
		boolean flag = true;
		while (flag == true) {
			num += 1  ;
			tot = num + tot;
			
			System.out.print(num + "  ");
			if (num > 9) {flag = false;}
		
		}
		
		System.out.print("tot=" + tot);

	}// main end

}// class end
