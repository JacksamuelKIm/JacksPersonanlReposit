package jack0710;

public class Method03 {

	public static int doSomething() {  //�ۼ� ���߿� ���� ���� �� ���� return�� �Է� �ڸ��� void�� �ƴ� ������ Ÿ���� �־���⿡ �� ���� ä������������ ������
		int result;
		result = 10*100;
		return result;		
	} // �Ű������� ���� ��ȯ���� �ִ� ���
		
	public static void main(String[] args) {
		int x;
		x = doSomething();
		System.out.println("x :" + x);
		
	} //main end

} //class end
