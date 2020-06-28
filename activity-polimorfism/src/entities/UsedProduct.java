package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {
	private Date manufactureDate;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return super.priceTag() + "(Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
	
	
}
