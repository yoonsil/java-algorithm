package study01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Month {
	public static void main(String[] args) {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String tday = sdf.format(date);
	
	int flag = Integer.parseInt(tday.substring(5,7));
	String eval = "";
	switch(flag) {
	case 1: eval = "jan"; break;
	case 2: eval = "feb"; break;
	case 3: eval = "mar"; break;
	case 4: eval = "apr"; break;
	case 5: eval = "may"; break;
	case 6: eval = "jun"; break;
	case 7: eval = "jul"; break;
	case 8: eval = "aug"; break;
	case 9: eval = "sep"; break;
	case 10: eval = "oct"; break;
	case 11: eval = "nov"; break;
	case 12: eval = "dec"; break;
	}
	System.out.println(eval);
	}

}
