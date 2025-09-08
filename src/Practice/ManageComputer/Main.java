package Practice.ManageComputer;

public class Main {
	public static void main(String[] args) {
		Nationality VietNam = new Nationality("VN", "Việt Nam");
		Nationality USA = new Nationality("USA", "Mỹ");
		Nationality JP = new Nationality("JP", "Nhật Bản");

		PublishBrand brand1 = new PublishBrand("Brand A", VietNam);
		PublishBrand brand2 = new PublishBrand("Brand B", USA);
		PublishBrand brand3 = new PublishBrand("Brand C", JP);

		PublishDate date1 = new PublishDate(22, 12, 2025);
		PublishDate date2 = new PublishDate(2, 1, 2024);
		PublishDate date3 = new PublishDate(2, 2, 2020);

		Computer pc1 = new Computer(brand1, date1, 20000000, 12);
		Computer pc2 = new Computer(brand2, date2, 50000000, 24);
		Computer pc3 = new Computer(brand3, date3, 55000000, 10);

		System.out.println("So sánh máy tính 1 với máy tính 2: " + pc1.ComparePrice(pc3));

		System.out.println("Tên quốc gia của máy tính 3: " + pc3.getPublishBrand().getNationality().getName());
	}
}
