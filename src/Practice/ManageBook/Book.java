package Practice.ManageBook;

public class Book {
	private String bookName;
	private Author author;
	private int publishYear;
	private double price;

	public Book(String bookName, Author author, int publishYear, double price) {
		this.bookName = bookName;
		this.author = author;
		this.publishYear = publishYear;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", publishYear=" + publishYear + ", price=" + price
				+ "]";
	}

	public boolean checkPublishYear(Book book) {
		return this.publishYear == book.publishYear;
	}

	public double getSalePrice(double x) {
		return price * (1 - x / 100);
	}
}
