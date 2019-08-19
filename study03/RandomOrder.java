package study03;
import java.util.Random;
public class RandomOrder {
	public static void main(String[] args) {
	Random ran = new Random();
	int team = 0;
	int[] arr = new int[6];
	for(int i=0; i<6; i++) {
		team = ran.nextInt(6)+1;
		if(team != 1 && team !=6 && team !=3 && team != 2) {
			System.out.println(team);
			}
		}
	}
}
