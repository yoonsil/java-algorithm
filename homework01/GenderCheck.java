package homework01;

import java.util.Scanner;

public class GenderCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요. (-)미포함");
		String num = scan.next();
		int find = Integer.parseInt(num.substring(6,7));
		String print = "";
		switch(find) {
		case 1 : print = "1900 ~ 1999년에 태어난 남성"; break; 
		case 2 : print = "1900 ~ 1999년에 태어난 여성"; break; 
		case 3 : print = "2000 ~ 2099년에 태어난 남성"; break; 
		case 4 : print = "2000 ~ 2099년에 태어난 여성"; break; 
		case 5 : print = "1900 ~ 1999년에 태어난 외국인 남성"; break; 
		case 6 : print = "1900 ~ 1999년에 태어난 외국인 여성"; break; 
		case 7 : print = "2000 ~ 2099년에 태어난 외국인 남성"; break; 
		case 9 : print = "1800 ~ 1899년에 태어난 남성"; break; 
		case 0 : print = "1800 ~ 1899년에 태어난 여성"; break; 
		}
		System.out.println(print);
	}
}
