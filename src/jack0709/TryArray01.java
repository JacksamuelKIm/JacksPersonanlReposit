package jack0709;
import java.util.*;
public class TryArray01 {
	public static void main(String[] args) {
		
		//����1) city��� �̸��� ũ�� 5¥�� �迭�� �����Ͽ�, 
		//���� �̸����� ���� �־��ְ� (��: "����", "����", "����¡", "����", "�ϳ���") 
		//for���� for~each���� ���� ����Ͽ� �迭�� ����ϼ���. 
		
		String[] city = {"����", "����", "����¡", "����", "�ϳ���"};
		
		for (int i=0 ; i < 5; i++) {
			System.out.print(city[i]+" ");			
		}
		System.out.println();
		
		for (String temp:city) {	
			System.out.print(temp + " ");			
		}
		
		
	}//main end

}//class end
