package test;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		
		int a=5,i;

		i=++a + ++a + a++;  // i = {1+5(a초기값)=a=6} + {1+6(a1차이후값)}=a=7} + {7 (이후에 a 설정} = i = 19 / a= 8   
		i=a++ + ++a + ++a;  // i(i새로assgin) = {8(as는이제 9 됨)} + {a=10} + {a=11} = i = 29 / a = 11
		a=++a + ++a + a++;  // a = 12 + 13 + 13 = 38

		System.out.println(a);
		System.out.println(i);
	}

}
