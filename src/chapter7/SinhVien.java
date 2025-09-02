package chapter7;

public abstract class SinhVien {
	protected String id;
	protected String name;

	public SinhVien(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public SinhVien() {
	}

//	Bắt buộc kế thừa
	abstract double getPoint();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
