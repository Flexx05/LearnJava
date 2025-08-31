package chapter4;

public class Student {

// Class attributes
	String name;
	int age;

	public Student() {
		this.name = "Mạnh Linh";
		this.age = 20;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

// CLass method	
	void learnJava() {
		System.out.println("Học Java đi");
	}

	String getAge() {
		return this.name;
	}
}
