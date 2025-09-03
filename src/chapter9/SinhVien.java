package chapter9;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private double diem;
	private int age;

	public SinhVien(String maSV, String hoTen, double diem, int age) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diem = diem;
		this.age = age;
	}

	public SinhVien() {
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", diem=" + diem + ", age=" + age + "]";
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
