package Practice.Abstract;

public class Plane extends Vehicle {
	private String typeOfEnergy;

	public Plane(String typeOfEnergy, PublishBrand publishBrand) {
		super("Máy Bay", publishBrand);
		this.typeOfEnergy = typeOfEnergy;
	}

	public String getTypeOfEnergy() {
		return typeOfEnergy;
	}

	public void setTypeOfEnergy(String typeOfEnergy) {
		this.typeOfEnergy = typeOfEnergy;
	}

	public void CatCanh() {
		System.out.println("Cất cánh....");
	}

	public void HaCanh() {
		System.out.println("Hạ cánh...");
	}

	@Override
	public String toString() {
		return "Plane [typeOfEnergy=" + typeOfEnergy + "]";
	}

	@Override
	public double getVelocity() {
		return 500;
	}

}
