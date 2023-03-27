package question;

public class ProductQuestion1 {
	private String name;
	private int price;
	private int salesCount;
	
	public ProductQuestion1(String name, int price, int salesCount) {
		this.name = name;
		this.price = price;
		this.salesCount = salesCount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
}
