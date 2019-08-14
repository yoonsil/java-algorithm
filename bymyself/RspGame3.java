package bymyself;

import java.util.Random;
import java.util.Scanner;

public class RspGame3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int mix = ran.nextInt(3)+1;
		String computer = "";
		String result = "";
		while(true) {
			System.out.println("1.Game Start 2.Finish the Game");
			int op = scan.nextInt();
			switch(op) {
			case 1: System.out.println("Rock/Scissors/Paper 중 하나를 입력하세요.");
			String player = scan.next();
				switch(mix) {
				case 1: computer = "is Rock"; 
					switch(player) {
					case "rock": result ="draws";break;
					case "scissors": result ="lost";break;
					case "paper": result ="wins";break;
					}
				break;
				case 2: computer = "is Scissors"; 
					switch(player) {
					case "rock": result ="lost";break;
					case "scissors": result ="draws";break;
					case "paper": result ="wins";break;
					}					
				break;
				case 3: computer = "is Paper"; 
				switch(player) {
					case "rock": result ="lost";break;
					case "scissors": result ="wins";break;
					case "paper": result ="draws";break;
					}
				break;
				}
				System.out.println(String.format("Computer %s", computer));
				System.out.println(String.format("Player %s", player));
				System.out.println(String.format("player %s", result));				
				break;
			case 2:
				return;
			}
		}
	}
}
