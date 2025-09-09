package Practice.Abstract;

public class Main {
	public static void main(String[] args) {
		PublishBrand brand1 = new PublishBrand("Brand 1", "Việt Nam");
		PublishBrand brand2 = new PublishBrand("Brand 2", "Nhật bản");
		PublishBrand brand3 = new PublishBrand("Brand 3", "Mỹ");

		Vehicle v1 = new Plane("Xăng", brand1);
		Vehicle v2 = new Car("Điện", brand2);
		Vehicle v3 = new Bycicle(brand3);

		System.out.println("Hãng sản xuất của máy bay: " + v1.getPublishBrand().getName());
		v2.Start();
		System.out.println("Vận tốc của xe đạp: " + v3.getVelocity() + "km");
	}
}
