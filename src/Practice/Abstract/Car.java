package Practice.Abstract;

public class Car extends Vehicle {
	private String typeOfEnergy;

	public Car(String typeOfEnergy, PublishBrand publishBrand) {
		super("Ô tô", publishBrand);
		this.typeOfEnergy = typeOfEnergy;
	}

	public String getTypeOfEnergy() {
		return typeOfEnergy;
	}

	public void setTypeOfEnergy(String typeOfEnergy) {
		this.typeOfEnergy = typeOfEnergy;
	}

	@Override
	public String toString() {
		return "Car [typeOfEnergy=" + typeOfEnergy + "]";
	}

	@Override
	public double getVelocity() {
		return 150;
	}

}
