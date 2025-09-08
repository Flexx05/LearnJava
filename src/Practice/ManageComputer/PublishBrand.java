package Practice.ManageComputer;

public class PublishBrand {
	private String name;
	private Nationality nationality;

	public PublishBrand(String name, Nationality nationality) {
		this.name = name;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "PublishBrand [name=" + name + ", nationality=" + nationality + "]";
	}

}
