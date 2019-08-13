package homework01;

import java.util.Random;
import java.util.Scanner;

public class RspGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		while(true) {
			System.out.println("1.게임 시작 2.게임종료");
			int op = scan.nextInt();
			switch(op) {
			case 1 :
				System.out.println("가위바위보 중 하나를 선택하세요.");
				String user = scan.next();
				String result = "";
				int mix = ran.nextInt(3)+1;
				String computer = "";
				switch(mix) {
				case 1: computer = "가위"; 
					switch(user){
						case "가위": result ="무승부"; break;
						case "바위": result ="승리"; break;
						case "보": result ="패배"; break;
						}
					break;
				case 2: computer = "바위";
					switch(user) {
						case "가위": result = "패배"; break;
						case "바위": result = "무승부"; break;
						case "보": result = "승리"; break;
						}
					break;
				case 3: computer = "보";
					switch(user) {
						case "가위": result ="승리"; break;
						case "바위": result ="패배"; break;
						case "보": result ="무승부"; break;
					}
					break;
				}
				System.out.println(String.format("컴퓨터 %s", computer));
				System.out.println(String.format("사용자 %s", user));				
				System.out.println(String.format("사용자  %s", result));				
				break;
			case 2: 
				return;
			}
		}
	}
}
