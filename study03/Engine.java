package study03;
import java.util.Scanner;
import study03.Student;
import java.util.Random;
public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student std = new Student();
		
		int flag = 0;
		String result ="";
		while(true) {
			System.out.println("메뉴: 0.종료 1.BMI 2.Ranking 3.HowMuch 4.ReportCard");
			flag = scan.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료"); return;
			//============================
			case 1 :
				System.out.println("BMI");
				String[] ask = {"이름","키 (cm)","몸무게 (kg)"};
				String[] get = new String[3];				
				for(int i=0; i<3; i++) {
					System.out.printf("%s 입력하세요.\n",ask[i]);
					get[i] = scan.next();
				}
				
				result=std.getBmi(get);
				
				System.out.println(result);
				break;
			//=============================================	
			case 2 : 
				System.out.println("Ranking");
				float[] time = new float[3]; 
				
				//기록입력
				for(int i=0; i<3; i++) {
					System.out.print("선수기록을 입력하세요.\n");
					time[i] = scan.nextFloat();
				}		
				result = std.getRanking(time);
				break;
				
			case 3 : 
				System.out.println("How much");
				std.howMuch();
				break;
				
			case 4 : 
				System.out.println("Report Card");
				std.reportCard();
				break;
			}
		}
	}
}
