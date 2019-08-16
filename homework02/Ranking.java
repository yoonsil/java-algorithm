/*To. 개발자님
	저희는 비트올림픽 위원회입니다.
	한번의 트랙에서 육상선수는 총 3명 입니다.
	총 세명의 100m 기록을 입력받아서 
	1, 2, 3 등을 가려야 합니다.
	
	A 선수 기록 : 10.5초
	B 선수 기록 : 10.8초
	C 선수 기록 : 10.1초 
	라고 입력받았다면
	
	###### 성적 랭킹 #######
	
	1등 : C 선수 기록 (10.1초)
	2등 : A 선수 기록 (10.5초)
	3등 : B 선수 기록 (10.8초)
	
	라고 출력시켜주세요.
 * */
package homework02;
import java.util.Scanner;
public class Ranking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"A","B","C"};
		float[] time = new float[3]; 
		String fir = "";
		String sec ="";
		String thi = "";	
		//기록입력
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s선수 기록을 입력하세요.\n", name[i]);
			time[i] = scan.nextFloat();
		}		
		//순서정하기
		for(int i = 0; i<time.length; i++) {
			if(time[0]<time[1] && time[1]<time[2] && time[0]<time[2]){
				fir = String.format("1등 : A선수 (%.1f초)",time[0]);
				sec = String.format("2등 : B선수 (%.1f초)",time[1]);
				thi = String.format("3등 : C선수 (%.1f초)",time[2]);
			}else if(time[2]<time[0] && time[2]<time[1] && time[0]<time[1]) {
				fir = String.format("1등 : C선수 (%.1f초)",time[2]);
				sec = String.format("2등 : A선수 (%.1f초)",time[0]);
				thi = String.format("3등 : B선수 (%.1f초)",time[1]);
			}else if(time[1]<time[2] && time[1]<time[0] && time[2]<time[0]) {
				fir = String.format("1등 : B선수 (%.1f초)",time[1]);
				sec = String.format("2등 : C선수 (%.1f초)",time[2]);
				thi = String.format("3등 : A선수 (%.1f초)",time[0]);				
			}
		}
		//출력	
		System.out.printf("%s\n",fir);
		System.out.printf("%s\n",sec);
		System.out.printf("%s\n",thi);			
	}
}
