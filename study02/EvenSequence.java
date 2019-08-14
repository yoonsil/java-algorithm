package study02;

import java.util.Scanner;

public class EvenSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sequence ="";
		int series =0;
		System.out.println("시작값");
		int start = scan.nextInt();
		System.out.println("마지막값");
		int end = scan.nextInt();
		for(int i=start; i<=end;i++) {
			if(i%2==0) {
				int end2=0;
				if(end%2==1) {
					end2 = end-1;
				}else {
					end2 = end;
				}
				if(i!=end2) {
					sequence += i+"+";
				}else {
					sequence += i+"=";
				}
				//==============
				series += i;		
			}
		}
		System.out.println(sequence + series);
	}
}
