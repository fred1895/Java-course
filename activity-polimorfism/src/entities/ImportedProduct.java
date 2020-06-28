package entities;

public class ImportedProduct extends Product {
	public Double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return super.price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " - $ " + totalPrice() + "(Customs fee: $" + customsFee + ")";
	}
}
