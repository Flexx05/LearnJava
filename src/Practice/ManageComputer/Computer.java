package Practice.ManageComputer;

public class Computer {
	private PublishBrand publishBrand;
	private PublishDate publishDate;
	private double price;
	private int warranty; // Thời gian bảo hành

	public Computer(PublishBrand publishBrand, PublishDate publishDate, double price, int warranty) {
		if (warranty < 0) {
			System.err.println("Thời gian bảo hành phải lớn hơn 0");
			return;
		}

		if (price < 0) {
			System.err.println("Giá phải lớn hơn 0");
			return;
		}
		this.publishBrand = publishBrand;
		this.publishDate = publishDate;
		this.price = price;
		this.warranty = warranty;
	}

	public PublishBrand getPublishBrand() {
		return publishBrand;
	}

	public void setPublishBrand(PublishBrand publishBrand) {
		this.publishBrand = publishBrand;
	}

	public PublishDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(PublishDate publishDate) {
		this.publishDate = publishDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			System.err.println("Giá phải lớn hơn 0");
			return;
		}
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		if (warranty < 0) {
			System.err.println("Thời gian bảo hành phải lớn hơn 0");
			return;
		}
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Computer [publishBrand=" + publishBrand + ", publishDate=" + publishDate + ", price=" + price
				+ ", warranty=" + warranty + "]";
	}

	public String ComparePrice(Computer computer) {
		return this.price < computer.price ? "Thấp hơn" : "Cao hơn";
	}
}
