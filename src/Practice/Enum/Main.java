package Practice.Enum;

public class Main {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb1 = new ThoiKhoaBieu(Day.Monday, "Lập trình Java");
		ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Day.Tuesday, "Lập trình Js");
		ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Day.Wednesday, "Lập trình PHP");

		System.out.println(tkb1);

		int x = Month.January.getDayOfMonth();

		System.out.println(x);
	}
}
