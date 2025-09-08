package Practice.ManageBook;

public class Main {
	public static void main(String[] args) {
		Date date1 = new Date(13, 8, 2025);
		Date date2 = new Date(14, 8, 2005);
		Date date3 = new Date(10, 8, 2000);

		Author auth1 = new Author("Mạnh Linh", date1);
		Author auth2 = new Author("Linh", date2);
		Author auth3 = new Author("Mạnh", date3);

		Book book1 = new Book("Làm đĩ", auth1, 2025, 150000);
		Book book2 = new Book("Làm bò", auth2, 2025, 100000);
		Book book3 = new Book("Làm người", auth3, 2023, 250000);

		boolean samePublishYear = book1.checkPublishYear(book2);

		System.out.println(samePublishYear ? "Cùng năm xuất bản" : "Khác năm xuất bản");
		System.out.println("Sách 1 giảm 10%: " + book1.getSalePrice(10));

	}
}
