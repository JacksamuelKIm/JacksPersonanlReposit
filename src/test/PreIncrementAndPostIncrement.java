package test;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		
		int a=5,i;

		i=++a + ++a + a++;  // i = {1+5(a�ʱⰪ)=a=6} + {1+6(a1�����İ�)}=a=7} + {7 (���Ŀ� a ����} = i = 19 / a= 8   
		i=a++ + ++a + ++a;  // i(i����assgin) = {8(as������ 9 ��)} + {a=10} + {a=11} = i = 29 / a = 11
		a=++a + ++a + a++;  // a = 12 + 13 + 13 = 38

		System.out.println(a);
		System.out.println(i);
	}

}
