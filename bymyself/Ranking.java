package bymyself;
import java.util.Scanner;
public class Ranking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 값 입력.");
		int a =scan.nextInt();
		System.out.println("두번째 값 입력.");
		int b =scan.nextInt();
		System.out.println("세번째 값 입력.");
		int c =scan.nextInt();
		
		String fir="";
		String sec ="";
		String thi = "";
		String seq = "";
		
		if(a >b && b > c && a > c ) {
			fir = "a";
			sec = "b";
			thi = "c";
		}else if(a<b && b>c && a>c) {
			fir = "b";
			sec = "a";
			thi = "c";
		}else if(a<c && b<c && b>a) {
			fir = "c";
			sec = "b";
			thi = "a";
		}			
	
		for(int i =a; i<2; i++ ) {
			seq += i;
		}
			System.out.printf("1등: %s\n",fir);
			System.out.printf("2등: %s\n",sec);
			System.out.printf("3등: %s\n",thi);
	}
}

