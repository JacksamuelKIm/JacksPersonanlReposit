package jack0708;

public class GugudanWhile {
	public static void main(String[] args) {
		//�밡�ٷ� �ۼ��� Gugudan1.java�� �����ϼż� �Ȱ��� ��µǵ��� while(true)���� �ۼ��غ�����.
		//dan�� cnt�� 
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
