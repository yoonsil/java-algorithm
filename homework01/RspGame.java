package homework01;
import java.util.Random;
import java.util.Scanner;

public class RspGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		Random ran = new Random();
		int mix = ran.nextInt(3)+1;
		System.out.println("가위/바위/보 중 하나를 입력하세요.");
		String client = scan.next();
		String eval = "";
		//컴퓨터(랜덤값)	
		String auto = "";
		switch(mix) {
		case 1: auto ="가위";
				switch(client){
				case "가위": eval ="비김"; break;
				case "바위": eval = "승리" ; break;
				case "보": eval = "패배"; break;
				}
		break;
		case 2: auto ="바위";
				switch(client){
				case "가위": eval ="패배"; break;
				case "바위": eval = "비김" ; break;
				case "보": eval = "승리"; break;
				}
		break;
		case 3: auto ="보";
				switch(client){
				case "가위": eval ="승리"; break;
				case "바위": eval = "패배" ; break;
				case "보": eval = "비김"; break;
				}
		break;
			}
		System.out.println(eval);
		}
		
	}
}
