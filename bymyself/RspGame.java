package bymyself;

import java.util.Random;
import java.util.Scanner;

public class RspGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		while(true) {
			System.out.println("1.게임하기 2.종료하기");
			int op = scan.nextInt();
			String computer ="";
			String result ="";
			int mix = ran.nextInt(3)+1;
			switch(op) {
			case 1: System.out.println("가위/바위/보 중 하나를 입력하세요.");
					String player =scan.next();
					switch(mix) {
					case 1: computer = "가위";
						switch(player) {
						case "가위": result ="무"; break;
						case "바위": result ="승"; break;
						case "보": result ="패"; break;
						}
					break;
					case 2: computer = "바위";
						switch(player) {
						case "가위": result ="패"; break;
						case "바위": result ="무"; break;
						case "보": result ="승"; break;
						}
					break;
					case 3: computer = "보"; 
						switch(player) {
						case "가위": result = "승"; break;
						case "바위": result = "패"; break;
						case "보": result = "무"; break;
						}
					break;
					}
					System.out.println(String.format("컴퓨터 %s", computer));
					System.out.println(String.format("사용자 %s", player));
					System.out.println(String.format("사용자 %s", result));
				break;
			case 2: return;
			}
		}
	}
}
