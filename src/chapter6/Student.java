package chapter6;

public class Student {
	private String name;
	private int _id;

	public Student(String name, int _id) {
		this.name = name;
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", _id=" + _id + "]";
	}

}
