package class_10_Hashing;

import java.util.HashMap;
import java.util.Map;

public class Change_Date_Format {

	public static void main(String[] args) {
		String A = "16th Mar 2068";
		
		Map<String, String> Day = new HashMap<>();
		Day.put("1st", "01");
		Day.put("2nd", "02");
		Day.put("3rd", "03");
		Day.put("4th", "04");
		Day.put("5th", "05");
		Day.put("6th", "06");
		Day.put("7th", "07");
		Day.put("8th", "08");
		Day.put("9th", "09");
		Day.put("10th", "10");
		Day.put("11th", "11");
		Day.put("12th", "12");
		Day.put("13th", "13");
		Day.put("14th", "14");
		Day.put("15th", "15");
		Day.put("16th", "16");
		Day.put("17th", "17");
		Day.put("18th", "18");
		Day.put("19th", "19");
		Day.put("20th", "20");
		Day.put("21th", "21");
		Day.put("22th", "22");
		Day.put("23th", "23");
		Day.put("24th", "24");
		Day.put("25th", "25");
		Day.put("26th", "26");
		Day.put("27th", "27");
		Day.put("28th", "28");
		Day.put("29th", "29");
		Day.put("30th", "30");
		Day.put("31st", "31");
		Day.put("31th", "31");
		
		
		Map<String, String> Month = new HashMap<>();
		Month.put("Jan", "01");
		Month.put("Feb", "02");
		Month.put("Mar", "03");
		Month.put("Apr", "04");
		Month.put("May", "05");
		Month.put("Jun", "06");
		Month.put("Jul", "07");
		Month.put("Aug", "08");
		Month.put("Sep", "09");
		Month.put("Oct", "10");
		Month.put("Nov", "11");
		Month.put("Dec", "12");
		
		String[] str = A.split(" ");
//		int year = Integer.parseInt(str[2]);
//		System.out.println(year);
		String ans = str[2] + "-" + Month.get(str[1]) + "-" + Day.get(str[0]);
		System.out.println(ans);
		
				
	}

}
