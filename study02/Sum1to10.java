package study02;

public class Sum1to10 {
	public static void main(String[] args) {
		String result ="";	
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i==10) {
				result += i+"=";
			}else {
				result += i+"+";
			}			
			sum += i;
		}	
		System.out.print(result+sum);
	}
}
