package step1;
import java.util.Scanner;
public class Print5times {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("1.start 0.stop");
		int flag = sc.nextInt();
		switch(flag){
			case 0: 
				System.out.println("시스템종료");
				return;
			case 1: 
				System.out.println("시스템진행");
				break;
			}
		System.out.println("hello");
		}
		
	}
}
