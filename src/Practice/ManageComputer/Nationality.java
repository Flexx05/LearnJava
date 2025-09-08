package Practice.ManageComputer;

public class Nationality {
	private String nationId, name;

	public Nationality(String nationId, String name) {
		this.nationId = nationId;
		this.name = name;
	}

	public String getNationId() {
		return nationId;
	}

	public void setNationId(String nationId) {
		this.nationId = nationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Nationality [nationId=" + nationId + ", name=" + name + "]";
	}

}
