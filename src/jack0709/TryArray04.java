package jack0709;

import java.util.*;
public class TryArray04 {

	public static void main(String[] args) {
		int a = 5, b = 10, c = 4, d = 2, e = 8, f = 5;
		int[] su = { 5, 10, 4, 2, 8, 5 };
		
		int hap = 0, tot = 0;
		// ����1) ���� ���� �־����� �� hap���� a~f������ ����,
		// tot���� for���� ����Ͽ� �迭(su) ���� ������ ���Ͽ�
		// hap=xx
		// tot=xx �� �������� ����ϼ���
		hap = a + b + c + d + e + f;
		for (int i = 0; i < su.length; i++) {
			tot += su[i]; // ���Կ���
		}

		// ����2) ����1���� 2���� �迭�� �߰��Ǿ����ϴ�.
		// �̹����� sum�� ��ø for���� ����Ͽ� �迭(score)�� ������ ���� ���ؼ� 
		// ������ ���� ���� �Ʒ��� ����ϼ���.
		double score[][] = { // 4��x2���� 2���� �迭
				{ 3.3, 3.4 }, // 1�г� 1, 2�б� ����
				{ 3.5, 3.6 }, // 2�г� 1, 2�б� ����
				{ 3.7, 4.0 }, // 3�г� 1, 2�б� ����
				{ 4.1, 4.2 } // 4�г� 1, 2�б� ����
		};
		
		double sum=0.0;
		
		//�̰��� ��ø�� �ۼ�
		
		
		for (int i=0; i<score.length; i++) {  // ���� i�� �����Ƿ� ���� �̸��� �ٸ� ������ ���ִ� ���� ���ڴ�
			for (int j=0; j<2; j++) {
				sum = sum + score[i][j];
				System.out.print(" "+(i+1)+"�г� "+(j+1)+"�б� ���� : " + score[i][j]);
			}
		System.out.println();
		}
		
		
		
		
		
		
		System.out.println("hap = " + hap);
		System.out.println("tot = " + tot);
		System.out.println("sum = " + sum);
		System.out.println("���� ��� = " + sum/8);
		System.out.printf("���� ��� = %.2f", sum/8);
		

	}// main end

}// class end
