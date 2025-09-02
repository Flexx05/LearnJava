package chapter7;

class Animal {
	void eat() {
		System.out.println("Animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating...");
	}
}

class BabyDog extends Dog {
	void eat() {
		System.out.println("Baby Dog is eating...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat is eating...");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Animal a = new BabyDog();

		a.eat();
	}
}
