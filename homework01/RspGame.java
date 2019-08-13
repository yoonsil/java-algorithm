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
		String result = "";
		//컴퓨터(랜덤값)	
		String computer = "";
		switch(mix) {
		case 1: computer ="가위";
				switch(client){
				case "가위": result ="비김"; break;
				case "바위": result = "승리" ; break;
				case "보": result = "패배"; break;
				}
		break;
		case 2: computer ="바위";
				switch(client){
				case "가위": result ="패배"; break;
				case "바위": result = "비김" ; break;
				case "보": result = "승리"; break;
				}
		break;
		case 3: computer ="보";
				switch(client){
				case "가위": result ="승리"; break;
				case "바위": result = "패배" ; break;
				case "보": result = "비김"; break;
				}
		break;
			}
		System.out.println(result);
		}
		
	}
}
