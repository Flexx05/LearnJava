package Practice.ManageFilm;

public class ScreeningDate {
	private int day, month, year;

	public ScreeningDate(int day, int month, int year) {
		if (day < 0 || day > 31) {
			System.err.println("Ngày chỉ nằm trong khoảng từ 1 đến 31");
			return;
		}
		if (day < 0 || day > 31) {
			System.err.println("Ngày chỉ nằm trong khoảng từ 1 đến 31");
			return;
		}
		if (year < 0) {
			System.err.println("Năm phải bắt đầu từ 1");
			return;
		}
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day < 0 || day > 31) {
			System.err.println("Ngày chỉ nằm trong khoảng từ 1 đến 31");
			return;
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (day < 0 || day > 31) {
			System.err.println("Ngày chỉ nằm trong khoảng từ 1 đến 31");
			return;
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 0) {
			System.err.println("Năm phải bắt đầu từ 1");
			return;
		}
		this.year = year;
	}

	@Override
	public String toString() {
		return "ScreeningDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
