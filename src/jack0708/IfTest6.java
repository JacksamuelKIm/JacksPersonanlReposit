package jack0708;

public class IfTest6 {

	public static void main(String[] args) {
		//문제) 아래와 같이 세개의 수가 주어졌을 때, 작은 순서대로 출력되도록 코드를 완성하세요. 
		int a=2,b=7,c=6; //2 6 7 
		  if(a<b && a<c){       // a가 제일 작다는 소리
			  if(b<c) {System.out.println(a + " " + b + " " +c);}  
			  else {System.out.println(a + " " + c + " " +b); } 
		  }else if(b<c){ // a가 제일 작은 수가 아닐 경우. 그리고 b<c일때
		    if(a<c){System.out.println(b + " " + a + " " +c);} 
		    else {System.out.println(b + " " + c + " " +a); } 
		  }else{ //a가 제일 작은 수가 아닐 경우. 그리고 c<b일때
			if(a<b) {System.out.println(c + " " + a + " " +b); } 
			else {System.out.println(c + " " + b + " " +a);}
		  }

	}


}
