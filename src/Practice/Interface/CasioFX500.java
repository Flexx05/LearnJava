package Practice.Interface;

public class CasioFX500 implements ICaculator {

	@Override
	public double Add(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double Minus(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double Multi(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double Divide(double a, double b) {
		return a / b;
	}

}
