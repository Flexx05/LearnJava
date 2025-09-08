package Practice.ManageFilm;

public class Main {
	public static void main(String[] args) {
		ScreeningDate screen1 = new ScreeningDate(13, 8, 2025);
		ScreeningDate screen2 = new ScreeningDate(13, 9, 2025);
		ScreeningDate screen3 = new ScreeningDate(13, 9, 2024);

		PublishBrand brand1 = new PublishBrand("Hãng A", "Việt Nam");
		PublishBrand brand2 = new PublishBrand("Hãng B", "Hoa Kỳ");
		PublishBrand brand3 = new PublishBrand("Hãng C", "Hàn Quốc");

		Film film1 = new Film("Bố già 1", 2023, 150000, brand1, screen3);
		Film film2 = new Film("Bố già 2", 2025, 200000, brand2, screen1);
		Film film3 = new Film("Quỷ Cẩu", 2024, 70000, brand3, screen2);

		System.out.println("So sánh giá vé phim Bố già 1 rẻ hơn Quỷ Cẩu: " + film1.checkTicketPrice(film3));
		System.out.println("Phim Bố già 2 được sản xuất bởi: " + film2.getPublishBrand().getName());
		System.out.println("Giá vé phim Quỷ Cẩu sau khi giảm 10%: " + film3.TicketPriceAfterDiscount(10));
	}
}
