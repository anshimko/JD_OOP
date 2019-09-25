package by.htp.les10.main.task03;

import java.util.ArrayList;
import java.util.List;

import by.htp.les10.main.task03.Calendar.Month;

public class CalendarLogic {

	public static List<Month.Day> takeHolidayMonth(Month month) {
		List<Month.Day> takeHoliday = new ArrayList<Month.Day>();
		for (Month.Day days : month.getDays()) {
			if (days.isHoliday() == true) {
				takeHoliday.add(days);
			}
		}
		return takeHoliday;
	}

}
