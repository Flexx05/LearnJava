package Practice.Abstract;

public class PublishBrand {
	private String name, nationality;

	public PublishBrand(String name, String nationality) {
		this.name = name;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "PublishBrand [name=" + name + ", nationality=" + nationality + "]";
	}

}
