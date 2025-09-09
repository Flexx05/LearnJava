package Practice.Abstract;

public abstract class Vehicle {
	protected String typeOfVehicle;
	protected PublishBrand publishBrand;

	public Vehicle(String typeOfVehicle, PublishBrand publishBrand) {
		super();
		this.typeOfVehicle = typeOfVehicle;
		this.publishBrand = publishBrand;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public PublishBrand getPublishBrand() {
		return publishBrand;
	}

	public void setPublishBrand(PublishBrand publishBrand) {
		this.publishBrand = publishBrand;
	}

	public void Start() {
		System.out.println("Starting.....");
	}

	public void SpeedUp() {
		System.out.println("........");
	}

	public void Stop() {
		System.out.println("Kzzzzzz");
	}

	public abstract double getVelocity();

	@Override
	public String toString() {
		return "Vehicle [typeOfVehicle=" + typeOfVehicle + "]";
	}

}
