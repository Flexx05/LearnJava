package chapter4;

public class Bai2 {
	public static void main(String[] args) {
		Product milk = new Product("Vina Milk", 150000, 0.1);
		Product egg = new Product("Chicken Egg", 15000, 0.01);

		System.out.printf("Cửa hàng chúng tôi có sản phẩm: %s với giá %.0f và cộng với thuế %.0f\n", milk.getName(),
				milk.getPrice(), milk.getTaxPrice());
		System.out.printf("Cửa hàng chúng tôi có sản phẩm: %s với giá %.0f và cộng với thuế %.0f", egg.getName(),
				egg.getPrice(), egg.getTaxPrice());
	}
}
