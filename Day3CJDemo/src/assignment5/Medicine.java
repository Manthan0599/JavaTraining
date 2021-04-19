package assignment5;

public abstract class Medicine {
	private double price;
	private String expiryDate;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public abstract void displayLabel();
	public void getDetails() {
		System.out.println("Price of Medicine: "+price);
		System.out.println("Expiry Date of Medicine: "+expiryDate);
	}
	
}
