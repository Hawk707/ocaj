package com.ocaj_exam.ch2;

public class StringSwitch{

	public static String getTypeofDayWithSwitchStatement(String dayOfWeekArg){
		String typeOfDay;
		switch (dayOfWeekArg){
			case "Monday":
			typeOfDay = "Start of work week";
			break;
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			typeOfDay = "Midweek";
			break;
			case "Friday":
			typeOfDay = "End of work";
			break;
			case "Saturday":
			case "Sunday":
			typeOfDay = "Weekend";
			break;
			default:
			throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);

		}
		return typeOfDay;
	}

	public static void main(String[] args){
		String typeOfDay = getTypeofDayWithSwitchStatement("Monday");
		System.out.println(typeOfDay);

	}


	
}
