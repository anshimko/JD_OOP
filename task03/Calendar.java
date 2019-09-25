package by.htp.les10.main.task03;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private short year;
	private List<Month> months;

	public Calendar(int year) {
		this.year = (short) year;
		this.months = new ArrayList<Month>(12);
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}

	public class Month {

		private MonthOfYear name;
		private List<Day> days;

		public Month(MonthOfYear name) {
			this.name = name;
			days = new ArrayList<Day>();
		}

		public MonthOfYear getName() {
			return name;
		}

		public void setName(MonthOfYear name) {
			this.name = name;
		}

		public List<Day> getDays() {
			return days;
		}

		public void setDays(List<Day> days) {
			this.days = days;
		}

		public void add(int number, DayOfWeek day, boolean dayOff) {
			days.add(new Day((byte) number, day, dayOff));
		}

		class Day {
			private byte number;
			private DayOfWeek day;
			private boolean holiday;
			private boolean dayOff;

			public Day(byte number, DayOfWeek day, boolean dayOff) {
				this.number = (number <= 31) ? number : 31;
				this.day = day;
				this.dayOff = dayOff;

				switch (day) {
				case SATURDAY:
					this.holiday = true;
					break;
				case SUNDAY:
					this.holiday = true;
					break;
				default:
					this.holiday = false;
				}

			}

			public byte getNumber() {
				return number;
			}

			public void setNumber(byte number) {
				this.number = (number <= 31) ? number : 31;
			}

			public DayOfWeek getDay() {
				return day;
			}

			public void setDay(DayOfWeek day) {
				this.day = day;
			}

			public boolean isDayOff() {
				return dayOff;
			}

			public void setDayOff(boolean dayOff) {
				this.dayOff = dayOff;
			}

			public boolean isHoliday() {
				return holiday;
			}

			@Override
			public String toString() {
				return number + " " + Month.this.name + " " + day + ", holiday=" + holiday + ", dayOff=" + dayOff;
			}

		}

	}

}
