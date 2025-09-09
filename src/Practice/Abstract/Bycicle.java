package Practice.Abstract;

public class Bycicle extends Vehicle {

	public Bycicle(PublishBrand publishBrand) {
		super("Xe đạp", publishBrand);
	}

	@Override
	public double getVelocity() {
		return 20;
	}

}
