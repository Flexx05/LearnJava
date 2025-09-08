package Practice.ManageFilm;

public class Film {
	private String name;
	private int publishYear;
	private double ticketPrice;
	private PublishBrand publishBrand;
	private ScreeningDate screeningDate;

	public Film(String name, int publishYear, double ticketPrice, PublishBrand publishBrand,
			ScreeningDate screeningDate) {
		if (publishYear < 0) {
			System.err.println("Năm phải bắt đầu từ năm 1");
			return;
		}
		this.name = name;
		this.publishYear = publishYear;
		this.ticketPrice = ticketPrice;
		this.publishBrand = publishBrand;
		this.screeningDate = screeningDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		if (publishYear < 0) {
			System.err.println("Năm phải bắt đầu từ năm 1");
			return;
		}
		this.publishYear = publishYear;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public PublishBrand getPublishBrand() {
		return publishBrand;
	}

	public void setPublishBrand(PublishBrand publishBrand) {
		this.publishBrand = publishBrand;
	}

	public ScreeningDate getScreeningDate() {
		return screeningDate;
	}

	public void setScreeningDate(ScreeningDate screeningDate) {
		this.screeningDate = screeningDate;
	}

	@Override
	public String toString() {
		return "Film [name=" + name + ", publishYear=" + publishYear + ", ticketPrice=" + ticketPrice
				+ ", publishBrand=" + publishBrand + ", screeningDate=" + screeningDate + "]";
	}

	public boolean checkTicketPrice(Film film) {
		return this.ticketPrice < film.ticketPrice;
	}

	public double TicketPriceAfterDiscount(double x) {
		return this.ticketPrice * (1 - x / 100);
	}

}
