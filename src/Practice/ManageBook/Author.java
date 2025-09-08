package Practice.ManageBook;

public class Author {
	private String name;
	private Date birth;

	public Author(String name, Date birth) {
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", birth=" + birth + "]";
	}

}
