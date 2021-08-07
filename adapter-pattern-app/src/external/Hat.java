package external;

public class Hat {
	private String shortName, longName;
	private double basePrice;
	
	public Hat(String shortName, String longName, double basePrice) {
		this.basePrice = basePrice;
		this.shortName = shortName;
		this.longName = longName;
	}
	
	public double getPrice() {
		return this.basePrice;
	}
	public String getShortName() {
		return this.shortName;
	}
	public String getLongName() {
		return this.longName;
	}
}
