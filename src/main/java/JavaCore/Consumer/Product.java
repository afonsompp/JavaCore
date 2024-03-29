package JavaCore.Consumer;

import java.text.NumberFormat;

public class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void staticAccept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonStaticAccept() {
		price *= 1.1;
	}

	@Override
	public String toString() {
		return "[ " + name + ", " + NumberFormat.getInstance().format(price) + " ]";
	}
}
