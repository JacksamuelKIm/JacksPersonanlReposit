package jack0710;

import java.util.Arrays;

public class TryMethod3 {
	
	//����) ���� �����Ҵ� �ζǹ߻��⸦ �޼ҵ�	�� �Ἥ �����غ����� �մϴ�. 
	// lottoInput���� Math.random()�� ����Ͽ� 6���� ���� �迭�� �����ϰ�,
	// lottoOutput���� �ش� �迭�� �Ű������� �޾� ������ ����ϵ��� �޼ҵ带 �ϼ��ϼ���.
	//���������� 0709\answer\TryArray08a.java�� �����Ͻʽÿ�.
	public static void main(String[] args) {
		TryMethod3 my = new TryMethod3();
		int[] a = my.lottoInput();
		my.lottoOutput(a);

	}// main end

	public int[] lottoInput() {// ���ϰ�
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

	public void lottoOutput(int[] b) { // �Ű�����
		Arrays.sort(b);
		System.out.print("�ζ� ��÷��ȣ :  ");
		for (int temp : b) { 
			System.out.print(temp + "\t");
		}
	}// lottoOutput end
	
}// class end
