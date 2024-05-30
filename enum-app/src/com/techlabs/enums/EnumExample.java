package com.techlabs.enums;


enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
public class EnumExample {
	Day day;
	public EnumExample(Day day) {
		this.day=day;
	}
	public void dayIsLike()
    {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are for working");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so boring");
            break;
        }
    }

}
