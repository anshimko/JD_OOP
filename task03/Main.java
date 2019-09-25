package by.htp.les10.main.task03;

import java.util.List;

import by.htp.les10.main.task03.Calendar.Month;

/*Задача 3.
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.
*/
public class Main {

	public static void main(String[] args) {

		Calendar cal2019 = new Calendar(2019);

		Calendar.Month juny = cal2019.new Month(MonthOfYear.JUNE);
		juny.add(1, DayOfWeek.MONDAY, false);
		juny.add(2, DayOfWeek.TUESDAY, false);
		juny.add(3, DayOfWeek.WEDNESDAY, false);
		juny.add(4, DayOfWeek.THURSDAY, false);
		juny.add(5, DayOfWeek.FRIDAY, false);
		juny.add(6, DayOfWeek.SATURDAY, false);
		juny.add(7, DayOfWeek.SUNDAY, true);
		juny.add(8, DayOfWeek.MONDAY, false);
		juny.add(9, DayOfWeek.TUESDAY, false);
		juny.add(10, DayOfWeek.WEDNESDAY, false);
		juny.add(11, DayOfWeek.THURSDAY, false);
		juny.add(12, DayOfWeek.FRIDAY, false);
		juny.add(13, DayOfWeek.SATURDAY, false);
		juny.add(14, DayOfWeek.SUNDAY, true);

		Calendar.Month september = cal2019.new Month(MonthOfYear.SEPTEMBER);
		september.add(1, DayOfWeek.MONDAY, false);
		september.add(2, DayOfWeek.TUESDAY, false);
		september.add(3, DayOfWeek.WEDNESDAY, false);
		september.add(4, DayOfWeek.THURSDAY, false);
		september.add(5, DayOfWeek.FRIDAY, false);
		september.add(6, DayOfWeek.SATURDAY, false);
		september.add(7, DayOfWeek.SUNDAY, true);
		september.add(8, DayOfWeek.MONDAY, false);
		september.add(9, DayOfWeek.TUESDAY, false);
		september.add(10, DayOfWeek.WEDNESDAY, false);
		september.add(11, DayOfWeek.THURSDAY, false);
		september.add(12, DayOfWeek.FRIDAY, false);
		september.add(13, DayOfWeek.SATURDAY, false);
		september.add(14, DayOfWeek.SUNDAY, true);

		print(CalendarLogic.takeHolidayMonth(september));

	}

	public static void print(List<Month.Day> days) {
		for (Month.Day day : days) {
			System.out.println(day.toString());
		}
	}

}
