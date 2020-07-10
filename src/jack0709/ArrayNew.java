package jack0709;

import java.util.Arrays;

public class ArrayNew {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		
		int[] arr1 = new int[5];
		int arr2[] = new int[3];
		int arr3[] = {1, 2, 3};
		
//		int[4] arr4 = new int[]; 이런거 안됨
//		int[] arr5 = new int[]; 이런거 안됨
		
		// 초기화 방법 (되돌리는 것을 말하는 것이 아니라 초기설정인듯)
		int [] arr6 = new int[] {2, 3, 4}; // 크기를 안주고 값부터 먼저 넣으려면 이렇게 하면 됨
//		int [] arr7; arr7 = {4,5,6,7}; 이거 안됨.
//		int [] arr8 = new int [6] {1, 2, 3, 4, 5, 6}크기와 값을 동시에 주면 안된다
		
//		출력1) for 문으로
		for (int i = 0; i < arr6.length; i++) {
			System.out.println("arr6[" + i + "]=" + arr6[i]);
			}
		
//		출력2) for each
		for(int temp:arr6 ) {
			System.out.print(temp + " ");
			}
		
//		출력3) Array.toString(배열이름)
		System.out.println(Arrays.toString(arr6));
		
		
		//배열 선언시 주의할점. 다음의 차이점 구분 잘해라
		int [] data1, data2, data3;
		int data4[], data5, data6; // 이 경우에는 data4만 array이고 나머지는 그냥 정수 변수.
		
		data4 = new int[10];
		System.out.println(data4); //초기화가 알아서 됨???
		System.out.println(data4[3]); // 얘는 뭐지? 주소 표시?? 이따 알아보자
		
		// 배열 복사하기
		data1 = new int[] {2,3,4,5,6,7,54};
		data4 = data1;
		System.out.println("data1:" + data1 + " "+ Arrays.toString(data1));
		System.out.println("data4:" + data4 + " "+ Arrays.toString(data4));
		
		data1[4]=33;
		System.out.println(Arrays.toString(data1) + "\n" + Arrays.toString(data4));
		
		
		

		

	} //main end 

} // class end
