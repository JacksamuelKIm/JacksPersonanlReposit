package jack0710;

public class TryMethod2 {

	// main���� �迭�� ũ��(s)�� ���ؼ� �����ϸ�
	// makeArray��� �޼ҵ忡�� �̸� �޾� �ش� ���̸�ŭ�� ���������� ������ �ϴ� �迭�� return�ϰ�
	// (��: s=5�� ���, {1, 4, 9, 16, 25}
	// �� ���ϰ��� B��� �迭�� �Ҵ��Ͽ� ����Ϸ��� �մϴ�.
	// �޼ҵ带 �ϼ��ϰ� ������ �ذ��ϼ���.
	public static int[] makeArray(int x) {
		int[] makeArray;
		makeArray = new int [x];
			for (int i = 0; i < makeArray.length; i++) {
				makeArray[i] = (i+1)*(i+1);
		}
		return makeArray; 
		
	}

	public static void main(String[] args) {
		int s = 5;
		int[] B = makeArray(s);
		for (int temp : makeArray(s))
			System.out.println(temp);

	}// main end

}// class end
